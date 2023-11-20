# IO.Swagger.Model.MatrixProfileBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Locations** | **List&lt;List&lt;double?&gt;&gt;** | List of comma separated lists of &#x60;longitude,latitude&#x60; coordinates in WGS 84 (EPSG:4326) | 
**Id** | **string** | Arbitrary identification string of the request reflected in the meta information. | [optional] 
**Sources** | **List&lt;string&gt;** | A list of indices that refers to the list of locations (starting with &#x60;0&#x60;). &#x60;{index_1},{index_2}[,{index_N} ...]&#x60; or &#x60;all&#x60; (default). example &#x60;[0,3]&#x60; for the first and fourth locations  | [optional] [default to ["all"]]
**Destinations** | **List&lt;string&gt;** | A list of indices that refers to the list of locations (starting with &#x60;0&#x60;). &#x60;{index_1},{index_2}[,{index_N} ...]&#x60; or &#x60;all&#x60; (default). &#x60;[0,3]&#x60; for the first and fourth locations  | [optional] [default to ["all"]]
**Metrics** | **List&lt;string&gt;** | Specifies a list of returned metrics. \&quot;* &#x60;distance&#x60; - Returns distance matrix for specified points in defined &#x60;units&#x60;. * &#x60;duration&#x60; - Returns duration matrix for specified points in **seconds**.  | [optional] 
**ResolveLocations** | **bool?** | Specifies whether given locations are resolved or not. If the parameter value set to &#x60;true&#x60;, every element in &#x60;destinations&#x60; and &#x60;sources&#x60; will contain a &#x60;name&#x60; element that identifies the name of the closest street. Default is &#x60;false&#x60;.  | [optional] [default to false]
**Units** | **string** | Specifies the distance unit. Default: m. | [optional] [default to UnitsEnum.M]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

