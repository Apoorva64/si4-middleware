# IO.Swagger.Api.OptimizationApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OptimizationPost**](OptimizationApi.md#optimizationpost) | **POST** /optimization | Optimization Service

<a name="optimizationpost"></a>
# **OptimizationPost**
> InlineResponse2007 OptimizationPost (OptimizationBody body, string authorization)

Optimization Service

The optimization endpoint solves [Vehicle Routing Problems](https://en.wikipedia.org/wiki/Vehicle_routing_problem) and can be used to schedule multiple vehicles and jobs, respecting time windows, capacities and required skills.  This service is based on the excellent [Vroom project](https://github.com/VROOM-Project/vroom). Please also consult its [API documentation](https://github.com/VROOM-Project/vroom/blob/master/docs/API.md).  General Info: - The expected order for all coordinates arrays is `[lon, lat]` - All timings are in seconds - All distances are in meters - A `time_window` object is a pair of timestamps in the form `[start, end]` 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class OptimizationPostExample
    {
        public void main()
        {
            var apiInstance = new OptimizationApi();
            var body = new OptimizationBody(); // OptimizationBody | The request body of the optimization request.
            var authorization = authorization_example;  // string | Insert your API Key here.  (default to your-api-key)

            try
            {
                // Optimization Service
                InlineResponse2007 result = apiInstance.OptimizationPost(body, authorization);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OptimizationApi.OptimizationPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OptimizationBody**](OptimizationBody.md)| The request body of the optimization request. | 
 **authorization** | **string**| Insert your API Key here.  | [default to your-api-key]

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
