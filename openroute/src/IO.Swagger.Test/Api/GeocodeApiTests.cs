/* 
 * Openrouteservice
 *
 * This is the openrouteservice API documentation for ORS Core-Version 7.1.0. Documentations for [older Core-Versions](https://github.com/GIScience/openrouteservice-docs/releases) can be rendered with the [Swagger-Editor](https://editor-next.swagger.io/).
 *
 * OpenAPI spec version: 7.1.0
 * Contact: support@smartmobility.heigit.org
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing GeocodeApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class GeocodeApiTests
    {
        private GeocodeApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new GeocodeApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of GeocodeApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' GeocodeApi
            //Assert.IsInstanceOfType(typeof(GeocodeApi), instance, "instance is a GeocodeApi");
        }

        /// <summary>
        /// Test GeocodeAutocompleteGet
        /// </summary>
        [Test]
        public void GeocodeAutocompleteGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string apiKey = null;
            //string text = null;
            //float? focusPointLon = null;
            //float? focusPointLat = null;
            //float? boundaryRectMinLon = null;
            //float? boundaryRectMinLat = null;
            //float? boundaryRectMaxLon = null;
            //float? boundaryRectMaxLat = null;
            //string boundaryCountry = null;
            //List<string> sources = null;
            //List<string> layers = null;
            //instance.GeocodeAutocompleteGet(apiKey, text, focusPointLon, focusPointLat, boundaryRectMinLon, boundaryRectMinLat, boundaryRectMaxLon, boundaryRectMaxLat, boundaryCountry, sources, layers);
            
        }
        /// <summary>
        /// Test GeocodeReverseGet
        /// </summary>
        [Test]
        public void GeocodeReverseGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string apiKey = null;
            //float? pointLon = null;
            //float? pointLat = null;
            //decimal? boundaryCircleRadius = null;
            //long? size = null;
            //List<string> layers = null;
            //List<string> sources = null;
            //string boundaryCountry = null;
            //instance.GeocodeReverseGet(apiKey, pointLon, pointLat, boundaryCircleRadius, size, layers, sources, boundaryCountry);
            
        }
        /// <summary>
        /// Test GeocodeSearchGet
        /// </summary>
        [Test]
        public void GeocodeSearchGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string apiKey = null;
            //string text = null;
            //float? focusPointLon = null;
            //float? focusPointLat = null;
            //float? boundaryRectMinLon = null;
            //float? boundaryRectMinLat = null;
            //float? boundaryRectMaxLon = null;
            //float? boundaryRectMaxLat = null;
            //float? boundaryCircleLon = null;
            //float? boundaryCircleLat = null;
            //float? boundaryCircleRadius = null;
            //string boundaryGid = null;
            //string boundaryCountry = null;
            //List<string> sources = null;
            //List<string> layers = null;
            //long? size = null;
            //instance.GeocodeSearchGet(apiKey, text, focusPointLon, focusPointLat, boundaryRectMinLon, boundaryRectMinLat, boundaryRectMaxLon, boundaryRectMaxLat, boundaryCircleLon, boundaryCircleLat, boundaryCircleRadius, boundaryGid, boundaryCountry, sources, layers, size);
            
        }
        /// <summary>
        /// Test GeocodeSearchStructuredGet
        /// </summary>
        [Test]
        public void GeocodeSearchStructuredGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string apiKey = null;
            //string address = null;
            //string neighbourhood = null;
            //string country = null;
            //string postalcode = null;
            //string region = null;
            //string county = null;
            //string locality = null;
            //string borough = null;
            //float? focusPointLon = null;
            //float? focusPointLat = null;
            //float? boundaryRectMinLon = null;
            //float? boundaryRectMinLat = null;
            //float? boundaryRectMaxLon = null;
            //float? boundaryRectMaxLat = null;
            //float? boundaryCircleLon = null;
            //float? boundaryCircleLat = null;
            //float? boundaryCircleRadius = null;
            //string boundaryCountry = null;
            //List<string> layers = null;
            //List<string> sources = null;
            //long? size = null;
            //instance.GeocodeSearchStructuredGet(apiKey, address, neighbourhood, country, postalcode, region, county, locality, borough, focusPointLon, focusPointLat, boundaryRectMinLon, boundaryRectMinLat, boundaryRectMaxLon, boundaryRectMaxLat, boundaryCircleLon, boundaryCircleLat, boundaryCircleRadius, boundaryCountry, layers, sources, size);
            
        }
    }

}