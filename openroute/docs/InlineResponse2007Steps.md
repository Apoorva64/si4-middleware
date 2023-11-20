# IO.Swagger.Model.InlineResponse2007Steps
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | string that is either &#x60;start&#x60;, &#x60;job&#x60; or &#x60;end&#x60; | [optional] 
**Arrival** | **float?** | estimated time of arrival at this step in seconds | [optional] 
**Duration** | **float?** | cumulated travel time upon arrival at this step in seconds | [optional] 
**Location** | **List&lt;float?&gt;** | coordinates array for this step (if provided in input) | [optional] 
**Job** | **int?** | id of the job performed at this step, only provided if &#x60;type&#x60; value is &#x60;job&#x60; | [optional] 
**Service** | **float?** | service time at this step, only provided if &#x60;type&#x60; value is &#x60;job&#x60; | [optional] 
**WaitingTime** | **float?** | waiting time upon arrival at this step, only provided if &#x60;type&#x60; value is &#x60;job&#x60; | [optional] 
**Distance** | **float?** | traveled distance upon arrival at this step. Only provided when using the &#x60;-g&#x60; flag with &#x60;OSRM&#x60; | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

