# IO.Swagger.Model.InlineResponse2007Routes
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Vehicle** | **int?** | id of the vehicle assigned to this route | [optional] 
**Steps** | [**List&lt;InlineResponse2007Steps&gt;**](InlineResponse2007Steps.md) | array of &#x60;step&#x60; objects | [optional] 
**Cost** | **float?** | cost for this route | [optional] 
**Service** | **float?** | total service time for this route | [optional] 
**Duration** | **float?** | total travel time for this route | [optional] 
**WaitingTime** | **float?** | total waiting time for this route | [optional] 
**Amount** | **List&lt;int?&gt;** | total amount for jobs in this route | [optional] 
**Geometry** | **string** | polyline encoded route geometry. Only provided when using the &#x60;-g&#x60; flag | [optional] 
**Distance** | **float?** | total route distance. Only provided when using the &#x60;-g&#x60; flag | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

