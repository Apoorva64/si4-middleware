# IO.Swagger.Api.ParksApi

All URIs are relative to *https://api.jcdecaux.com/vls/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPark**](ParksApi.md#getpark) | **GET** /contracts/{contract_name}/parks/{park_number} | Get a park
[**GetParks**](ParksApi.md#getparks) | **GET** /contracts/{contract_name}/parks | Get all parks of a contract

<a name="getpark"></a>
# **GetPark**
> Park GetPark (string contractName, int? parkNumber)

Get a park

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetParkExample
    {
        public void main()
        {
            // Configure API key authorization: ApiKey
            Configuration.Default.AddApiKey("apiKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apiKey", "Bearer");

            var apiInstance = new ParksApi();
            var contractName = contractName_example;  // string | 
            var parkNumber = 56;  // int? | 

            try
            {
                // Get a park
                Park result = apiInstance.GetPark(contractName, parkNumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ParksApi.GetPark: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractName** | **string**|  | 
 **parkNumber** | **int?**|  | 

### Return type

[**Park**](Park.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getparks"></a>
# **GetParks**
> List<Park> GetParks (string contractName)

Get all parks of a contract

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetParksExample
    {
        public void main()
        {
            // Configure API key authorization: ApiKey
            Configuration.Default.AddApiKey("apiKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apiKey", "Bearer");

            var apiInstance = new ParksApi();
            var contractName = contractName_example;  // string | 

            try
            {
                // Get all parks of a contract
                List&lt;Park&gt; result = apiInstance.GetParks(contractName);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ParksApi.GetParks: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractName** | **string**|  | 

### Return type

[**List<Park>**](Park.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
