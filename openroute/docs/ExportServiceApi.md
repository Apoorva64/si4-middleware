# IO.Swagger.Api.ExportServiceApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDefault1**](ExportServiceApi.md#getdefault1) | **POST** /v2/export/{profile} | Export Service
[**GetJsonExport**](ExportServiceApi.md#getjsonexport) | **POST** /v2/export/{profile}/json | Export Service JSON

<a name="getdefault1"></a>
# **GetDefault1**
> InlineResponse2002 GetDefault1 (GraphExportService body, string profile)

Export Service

Returns a list of points, edges and weights within a given bounding box for a selected profile as JSON. This method does not accept any request body or parameters other than profile, start coordinate, and end coordinate.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetDefault1Example
    {
        public void main()
        {
            var apiInstance = new ExportServiceApi();
            var body = new GraphExportService(); // GraphExportService | 
            var profile = profile_example;  // string | Specifies the route profile.

            try
            {
                // Export Service
                InlineResponse2002 result = apiInstance.GetDefault1(body, profile);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExportServiceApi.GetDefault1: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GraphExportService**](GraphExportService.md)|  | 
 **profile** | **string**| Specifies the route profile. | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/geo+json, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getjsonexport"></a>
# **GetJsonExport**
> InlineResponse2002 GetJsonExport (GraphExportService1 body, string profile)

Export Service JSON

Returns a list of points, edges and weights within a given bounding box for a selected profile JSON.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetJsonExportExample
    {
        public void main()
        {
            var apiInstance = new ExportServiceApi();
            var body = new GraphExportService1(); // GraphExportService1 | 
            var profile = profile_example;  // string | Specifies the profile.

            try
            {
                // Export Service JSON
                InlineResponse2002 result = apiInstance.GetJsonExport(body, profile);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExportServiceApi.GetJsonExport: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GraphExportService1**](GraphExportService1.md)|  | 
 **profile** | **string**| Specifies the profile. | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/geo+json, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
