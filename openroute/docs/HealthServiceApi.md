# IO.Swagger.Api.HealthServiceApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FetchHealth1**](HealthServiceApi.md#fetchhealth1) | **GET** /v2/health | 

<a name="fetchhealth1"></a>
# **FetchHealth1**
> Object FetchHealth1 ()



### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FetchHealth1Example
    {
        public void main()
        {
            var apiInstance = new HealthServiceApi();

            try
            {
                Object result = apiInstance.FetchHealth1();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling HealthServiceApi.FetchHealth1: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
