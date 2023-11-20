# IO.Swagger.Api.DirectionsServiceApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDefault2**](DirectionsServiceApi.md#getdefault2) | **POST** /v2/directions/{profile} | Directions Service
[**GetGPXRoute**](DirectionsServiceApi.md#getgpxroute) | **POST** /v2/directions/{profile}/gpx | Directions Service GPX
[**GetGeoJsonRoute**](DirectionsServiceApi.md#getgeojsonroute) | **POST** /v2/directions/{profile}/geojson | Directions Service GeoJSON
[**GetJsonRoute**](DirectionsServiceApi.md#getjsonroute) | **POST** /v2/directions/{profile}/json | Directions Service JSON
[**GetSimpleGeoJsonRoute**](DirectionsServiceApi.md#getsimplegeojsonroute) | **GET** /v2/directions/{profile} | Directions Service

<a name="getdefault2"></a>
# **GetDefault2**
> InlineResponse2004 GetDefault2 (DirectionsService body, string profile)

Directions Service

Returns a route between two or more locations for a selected profile and its settings as JSON

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetDefault2Example
    {
        public void main()
        {
            var apiInstance = new DirectionsServiceApi();
            var body = new DirectionsService(); // DirectionsService | 
            var profile = profile_example;  // string | Specifies the route profile.

            try
            {
                // Directions Service
                InlineResponse2004 result = apiInstance.GetDefault2(body, profile);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DirectionsServiceApi.GetDefault2: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectionsService**](DirectionsService.md)|  | 
 **profile** | **string**| Specifies the route profile. | 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getgpxroute"></a>
# **GetGPXRoute**
> InlineResponse2005 GetGPXRoute (DirectionsService2 body, string profile)

Directions Service GPX

Returns a route between two or more locations for a selected profile and its settings as GPX. The schema can be found [here](https://raw.githubusercontent.com/GIScience/openrouteservice-schema/master/gpx/v1/ors-gpx.xsd)

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetGPXRouteExample
    {
        public void main()
        {
            var apiInstance = new DirectionsServiceApi();
            var body = new DirectionsService2(); // DirectionsService2 | 
            var profile = profile_example;  // string | Specifies the route profile.

            try
            {
                // Directions Service GPX
                InlineResponse2005 result = apiInstance.GetGPXRoute(body, profile);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DirectionsServiceApi.GetGPXRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectionsService2**](DirectionsService2.md)|  | 
 **profile** | **string**| Specifies the route profile. | 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/gpx+xml, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getgeojsonroute"></a>
# **GetGeoJsonRoute**
> InlineResponse2003 GetGeoJsonRoute (DirectionsService3 body, string profile)

Directions Service GeoJSON

Returns a route between two or more locations for a selected profile and its settings as GeoJSON

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetGeoJsonRouteExample
    {
        public void main()
        {
            var apiInstance = new DirectionsServiceApi();
            var body = new DirectionsService3(); // DirectionsService3 | 
            var profile = profile_example;  // string | Specifies the route profile.

            try
            {
                // Directions Service GeoJSON
                InlineResponse2003 result = apiInstance.GetGeoJsonRoute(body, profile);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DirectionsServiceApi.GetGeoJsonRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectionsService3**](DirectionsService3.md)|  | 
 **profile** | **string**| Specifies the route profile. | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/geo+json, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getjsonroute"></a>
# **GetJsonRoute**
> InlineResponse2004 GetJsonRoute (DirectionsService1 body, string profile)

Directions Service JSON

Returns a route between two or more locations for a selected profile and its settings as JSON

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetJsonRouteExample
    {
        public void main()
        {
            var apiInstance = new DirectionsServiceApi();
            var body = new DirectionsService1(); // DirectionsService1 | 
            var profile = profile_example;  // string | Specifies the route profile.

            try
            {
                // Directions Service JSON
                InlineResponse2004 result = apiInstance.GetJsonRoute(body, profile);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DirectionsServiceApi.GetJsonRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectionsService1**](DirectionsService1.md)|  | 
 **profile** | **string**| Specifies the route profile. | 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getsimplegeojsonroute"></a>
# **GetSimpleGeoJsonRoute**
> InlineResponse2003 GetSimpleGeoJsonRoute (string profile, string start, string end)

Directions Service

Get a basic route between two points with the profile provided. Returned response is in GeoJSON format. This method does not accept any request body or parameters other than profile, start coordinate, and end coordinate.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetSimpleGeoJsonRouteExample
    {
        public void main()
        {
            var apiInstance = new DirectionsServiceApi();
            var profile = profile_example;  // string | Specifies the route profile.
            var start = start_example;  // string | Start coordinate of the route in `longitude,latitude` format.
            var end = end_example;  // string | Destination coordinate of the route in `longitude,latitude` format.

            try
            {
                // Directions Service
                InlineResponse2003 result = apiInstance.GetSimpleGeoJsonRoute(profile, start, end);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DirectionsServiceApi.GetSimpleGeoJsonRoute: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profile** | **string**| Specifies the route profile. | 
 **start** | **string**| Start coordinate of the route in &#x60;longitude,latitude&#x60; format. | 
 **end** | **string**| Destination coordinate of the route in &#x60;longitude,latitude&#x60; format. | 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/geo+json, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
