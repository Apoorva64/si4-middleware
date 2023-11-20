using System;
using System.Collections.Generic;
using JCDECAUX.rest.client.Api;
using JCDECAUX.rest.client.Client;
using JCDECAUX.rest.client.Model;
using System.Runtime.Caching;
using System.Runtime.Serialization.Formatters;

namespace JCDECAUX.wcf.library
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "Service1" in both code and config file together.
    public class JcdecauxProxyService : IJcdecauxProxyService
    {
        private readonly ContractsApi _contractsApi;
        private readonly StationsApi _stationsApi;
        private readonly ParksApi _parksApi;
        private readonly MemoryCache _memoryCache;
        private readonly int _cacheDurationInSeconds;

        JcdecauxProxyService(
            string apiKey,
            int cacheDurationInSeconds
        )
        {
            if (apiKey == null)
            {
                throw new ArgumentNullException(nameof(apiKey));
            }

            if (!Configuration.Default.ApiKey.ContainsKey("apiKey"))
            {
                Configuration.Default.ApiKey.Add("apiKey", apiKey);
            }

            _contractsApi = new ContractsApi();
            _stationsApi = new StationsApi();
            _parksApi = new ParksApi();
            _memoryCache = MemoryCache.Default;
            _cacheDurationInSeconds = cacheDurationInSeconds;
        }

        JcdecauxProxyService() : this(System.Configuration.ConfigurationManager.AppSettings.Get("api_key_jcdecaux"),
            int.Parse(System.Configuration.ConfigurationManager.AppSettings.Get("cache_duration_in_seconds"))
        )
        {
        }

        public List<Contract> GetContracts()
        {
            List<Contract> contracts = _memoryCache.Get("contracts") as List<Contract>;
            if (contracts == null)
            {
                contracts = _contractsApi.GetContracts();
                _memoryCache.Add("contracts", contracts, DateTimeOffset.Now.AddSeconds(_cacheDurationInSeconds));
            }

            return contracts;
        }

        public List<Station> GetStations()
        {
            List<Station> stations = _memoryCache.Get("stations") as List<Station>;
            if (stations == null)
            {
                stations = _stationsApi.GetStations();
                _memoryCache.Add("stations", stations, DateTimeOffset.Now.AddSeconds(_cacheDurationInSeconds));
            }

            return stations;
        }

        public Station GetStation(int stationNumber, string contractName)
        {
            Station station = _memoryCache.Get("station" + stationNumber + contractName) as Station;
            if (station == null)
            {
                station = _stationsApi.GetStation(stationNumber, contractName);
                _memoryCache.Add("station" + stationNumber + contractName, station,
                    DateTimeOffset.Now.AddSeconds(_cacheDurationInSeconds));
            }

            return station;
        }

        public List<Park> GetParks(string contractName)
        {
            List<Park> parks = _memoryCache.Get("parks" + contractName) as List<Park>;
            if (parks == null)
            {
                parks = _parksApi.GetParks(contractName);
                _memoryCache.Add("parks" + contractName, parks, DateTimeOffset.Now.AddSeconds(_cacheDurationInSeconds));
            }

            return parks;
        }

        public Park GetPark(int parkNumber, string contractName)
        {
            Park park = _memoryCache.Get("park" + parkNumber + contractName) as Park;
            if (park == null)
            {
                park = _parksApi.GetPark(contractName, parkNumber);
                _memoryCache.Add("park" + parkNumber + contractName, park,
                    DateTimeOffset.Now.AddSeconds(_cacheDurationInSeconds));
            }

            return park;
        }
    }
}