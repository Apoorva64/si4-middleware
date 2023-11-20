# IO.Swagger.Model.JSONIndividualRouteResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Summary** | [**JSONIndividualRouteResponseSummary**](JSONIndividualRouteResponseSummary.md) |  | [optional] 
**Segments** | [**List&lt;JSONIndividualRouteResponseSegments&gt;**](JSONIndividualRouteResponseSegments.md) | List containing the segments and its corresponding steps which make up the route. | [optional] 
**Bbox** | **List&lt;double?&gt;** | A bounding box which contains the entire route | [optional] 
**Geometry** | **string** | The geometry of the route. For JSON route responses this is an encoded polyline. | [optional] 
**WayPoints** | **List&lt;int?&gt;** | List containing the indices of way points corresponding to the *geometry*. | [optional] 
**Warnings** | [**List&lt;JsonExportResponseWarning&gt;**](JsonExportResponseWarning.md) | List of warnings that have been generated for the route | [optional] 
**Legs** | [**List&lt;JSONIndividualRouteResponseLegs&gt;**](JSONIndividualRouteResponseLegs.md) | List containing the legs the route consists of. | [optional] 
**Extras** | [**Dictionary&lt;string, JSONIndividualRouteResponseExtras&gt;**](JSONIndividualRouteResponseExtras.md) | List of extra info objects representing the extra info items that were requested for the route. | [optional] 
**Departure** | **DateTime?** | Departure date and time | [optional] 
**Arrival** | **DateTime?** | Arrival date and time | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

