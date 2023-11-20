# IO.Swagger.Api.MatrixServiceApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDefault**](MatrixServiceApi.md#getdefault) | **POST** /v2/matrix/{profile} | Matrix Service

<a name="getdefault"></a>
# **GetDefault**
> InlineResponse200 GetDefault (MatrixProfileBody body, string profile)

Matrix Service

Returns duration or distance matrix for multiple source and destination points. By default a square duration matrix is returned where every point in locations is paired with each other. The result is null if a value can’t be determined.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetDefaultExample
    {
        public void main()
        {
            var apiInstance = new MatrixServiceApi();
            var body = new MatrixProfileBody(); // MatrixProfileBody | 
            var profile = profile_example;  // string | Specifies the matrix profile.

            try
            {
                // Matrix Service
                InlineResponse200 result = apiInstance.GetDefault(body, profile);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MatrixServiceApi.GetDefault: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MatrixProfileBody**](MatrixProfileBody.md)|  | 
 **profile** | **string**| Specifies the matrix profile. | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8, */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
