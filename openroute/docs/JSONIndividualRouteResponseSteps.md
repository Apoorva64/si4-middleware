# IO.Swagger.Model.JSONIndividualRouteResponseSteps
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Distance** | **double?** | The distance for the step in metres. | [optional] 
**Duration** | **double?** | The duration for the step in seconds. | [optional] 
**Type** | **int?** | The [instruction](https://GIScience.github.io/openrouteservice/documentation/Instruction-Types.html) action for symbolisation purposes. | [optional] 
**Instruction** | **string** | The routing instruction text for the step. | [optional] 
**Name** | **string** | The name of the next street. | [optional] 
**ExitNumber** | **int?** | Only for roundabouts. Contains the number of the exit to take. | [optional] 
**ExitBearings** | **List&lt;int?&gt;** | Contains the bearing of the entrance and all passed exits in a roundabout. | [optional] 
**WayPoints** | **List&lt;int?&gt;** | List containing the indices of the steps start- and endpoint corresponding to the *geometry*. | [optional] 
**Maneuver** | [**JSONIndividualRouteResponseManeuver**](JSONIndividualRouteResponseManeuver.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

