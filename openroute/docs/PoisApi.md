# IO.Swagger.Api.PoisApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PoisPost**](PoisApi.md#poispost) | **POST** /pois | Pois Service

<a name="poispost"></a>
# **PoisPost**
> OpenpoiservicePoiResponse PoisPost (OpenpoiservicePoiRequest body, string authorization)

Pois Service

Returns points of interest in the area surrounding a geometry which can either be a bounding box, polygon or buffered linestring or point. Find more examples on [github](https://github.com/GIScience/openpoiservice). 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class PoisPostExample
    {
        public void main()
        {
            var apiInstance = new PoisApi();
            var body = new OpenpoiservicePoiRequest(); // OpenpoiservicePoiRequest | body for a post request
            var authorization = authorization_example;  // string | Insert your API Key here.  (default to your-api-key)

            try
            {
                // Pois Service
                OpenpoiservicePoiResponse result = apiInstance.PoisPost(body, authorization);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PoisApi.PoisPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OpenpoiservicePoiRequest**](OpenpoiservicePoiRequest.md)| body for a post request | 
 **authorization** | **string**| Insert your API Key here.  | [default to your-api-key]

### Return type

[**OpenpoiservicePoiResponse**](OpenpoiservicePoiResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
