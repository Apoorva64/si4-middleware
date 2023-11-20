# IO.Swagger.Api.IsochronesServiceApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDefaultIsochrones**](IsochronesServiceApi.md#getdefaultisochrones) | **POST** /v2/isochrones/{profile} | Isochrones Service

<a name="getdefaultisochrones"></a>
# **GetDefaultIsochrones**
> InlineResponse2001 GetDefaultIsochrones (IsochronesProfileBody body, string profile)

Isochrones Service

The Isochrone Service supports time and distance analyses for one single or multiple locations. You may also specify the isochrone interval or provide multiple exact isochrone range values. This service allows the same range of profile options as the /directions endpoint, which help you to further customize your request to obtain a more detailed reachability area response.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetDefaultIsochronesExample
    {
        public void main()
        {
            var apiInstance = new IsochronesServiceApi();
            var body = new IsochronesProfileBody(); // IsochronesProfileBody | 
            var profile = profile_example;  // string | Specifies the route profile.

            try
            {
                // Isochrones Service
                InlineResponse2001 result = apiInstance.GetDefaultIsochrones(body, profile);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IsochronesServiceApi.GetDefaultIsochrones: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IsochronesProfileBody**](IsochronesProfileBody.md)|  | 
 **profile** | **string**| Specifies the route profile. | 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/geo+json, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
