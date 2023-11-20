# IO.Swagger.Api.ContractsApi

All URIs are relative to *https://api.jcdecaux.com/vls/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetContracts**](ContractsApi.md#getcontracts) | **GET** /contracts | Get all contracts

<a name="getcontracts"></a>
# **GetContracts**
> List<Contract> GetContracts ()

Get all contracts

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetContractsExample
    {
        public void main()
        {
            // Configure API key authorization: ApiKey
            Configuration.Default.AddApiKey("apiKey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apiKey", "Bearer");

            var apiInstance = new ContractsApi();

            try
            {
                // Get all contracts
                List&lt;Contract&gt; result = apiInstance.GetContracts();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContractsApi.GetContracts: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Contract>**](Contract.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
