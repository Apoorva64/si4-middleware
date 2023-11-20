# IO.Swagger.Api.ElevationApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ElevationLinePost**](ElevationApi.md#elevationlinepost) | **POST** /elevation/line | Elevation Line Service
[**ElevationPointGet**](ElevationApi.md#elevationpointget) | **GET** /elevation/point | Elevation Point Service
[**ElevationPointPost**](ElevationApi.md#elevationpointpost) | **POST** /elevation/point | Elevation Point Service

<a name="elevationlinepost"></a>
# **ElevationLinePost**
> InlineResponse2006 ElevationLinePost (ElevationLineBody body, string authorization)

Elevation Line Service

This endpoint can take planar 2D line objects and enrich them with elevation from a variety of datasets.  The input and output formats are:   * GeoJSON   * Polyline   * <a href=\"https://developers.google.com/maps/documentation/utilities/polylinealgorithm\">Google's Encoded polyline</a> with coordinate precision 5 or 6  Example: ```   # POST LineString as polyline   curl -XPOST https://api.openrouteservice.org/elevation/line     -H 'Content-Type: application/json' \\     -H 'Authorization: INSERT_YOUR_KEY     -d '{       \"format_in\": \"polyline\",       \"format_out\": \"encodedpolyline5\",       \"geometry\": [[13.349762, 38.112952],                    [12.638397, 37.645772]]         }' ``` 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ElevationLinePostExample
    {
        public void main()
        {
            var apiInstance = new ElevationApi();
            var body = new ElevationLineBody(); // ElevationLineBody | Query the elevation of a line in various formats.
            var authorization = authorization_example;  // string | Insert your API Key here.  (default to your-api-key)

            try
            {
                // Elevation Line Service
                InlineResponse2006 result = apiInstance.ElevationLinePost(body, authorization);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ElevationApi.ElevationLinePost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElevationLineBody**](ElevationLineBody.md)| Query the elevation of a line in various formats. | 
 **authorization** | **string**| Insert your API Key here.  | [default to your-api-key]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="elevationpointget"></a>
# **ElevationPointGet**
> InlineResponse2006 ElevationPointGet (string apiKey, List<decimal?> geometry, string formatOut = null, string dataset = null)

Elevation Point Service

This endpoint can take a 2D point and enrich it with elevation from a variety of datasets.  The output formats are:   * GeoJSON   * Point  Example: ```   # GET point   curl -XGET https://localhost:5000/elevation/point?geometry=13.349762,38.11295 ``` 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ElevationPointGetExample
    {
        public void main()
        {
            var apiInstance = new ElevationApi();
            var apiKey = apiKey_example;  // string | Insert your API Key here. 
            var geometry = new List<decimal?>(); // List<decimal?> | The point to be queried, in comma-separated lon,lat values, e.g. [13.349762, 38.11295]
            var formatOut = formatOut_example;  // string | The output format to be returned. (optional) 
            var dataset = dataset_example;  // string | The elevation dataset to be used. (optional) 

            try
            {
                // Elevation Point Service
                InlineResponse2006 result = apiInstance.ElevationPointGet(apiKey, geometry, formatOut, dataset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ElevationApi.ElevationPointGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **string**| Insert your API Key here.  | 
 **geometry** | [**List&lt;decimal?&gt;**](decimal?.md)| The point to be queried, in comma-separated lon,lat values, e.g. [13.349762, 38.11295] | 
 **formatOut** | **string**| The output format to be returned. | [optional] 
 **dataset** | **string**| The elevation dataset to be used. | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="elevationpointpost"></a>
# **ElevationPointPost**
> InlineResponse2006 ElevationPointPost (ElevationPointBody body, string authorization)

Elevation Point Service

This endpoint can take a 2D point and enrich it with elevation from a variety of datasets.  The input and output formats are:   * GeoJSON   * Point  Example: ```   # POST point as GeoJSON   # https://api.openrouteservice.org/elevation/point?api_key=YOUR-KEY   {     \"format_in\": \"geojson\",     \"format_out\": \"geojson\",     \"geometry\": {       \"coordinates\": [13.349762, 38.11295],       \"type\": \"Point\"     }   } ``` 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ElevationPointPostExample
    {
        public void main()
        {
            var apiInstance = new ElevationApi();
            var body = new ElevationPointBody(); // ElevationPointBody | Query the elevation of a point in various formats.
            var authorization = authorization_example;  // string | Insert your API Key here.  (default to your-api-key)

            try
            {
                // Elevation Point Service
                InlineResponse2006 result = apiInstance.ElevationPointPost(body, authorization);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ElevationApi.ElevationPointPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ElevationPointBody**](ElevationPointBody.md)| Query the elevation of a point in various formats. | 
 **authorization** | **string**| Insert your API Key here.  | [default to your-api-key]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
