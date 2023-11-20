using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using JCDECAUX.rest.client.Model;

namespace JCDECAUX.wcf.library
{
    [ServiceContract]
    public interface IJcdecauxProxyService
    {
        [OperationContract]
        List<Contract> GetContracts();

        [OperationContract]
        List<Station> GetStations();

        [OperationContract]
        Station GetStation(int stationNumber, string contractName);

        [OperationContract]
        List<Park> GetParks(string contractName);

        [OperationContract]
        Park GetPark(int parkNumber, string contractName);
    }
}