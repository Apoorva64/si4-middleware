# IO.Swagger.Api.StatusServiceApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FetchHealth**](StatusServiceApi.md#fetchhealth) | **GET** /v2/status | 

<a name="fetchhealth"></a>
# **FetchHealth**
> string FetchHealth ()



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FetchHealthExample
    {
        public void main()
        {
            var apiInstance = new StatusServiceApi();

            try
            {
                string result = apiInstance.FetchHealth();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StatusServiceApi.FetchHealth: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
