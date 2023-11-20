# IO.Swagger.Model.OptimizationVehicles
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int?** | Integer used as unique identifier  | [optional] 
**Profile** | **string** | The ORS routing profile for the vehicle.  | [optional] 
**Start** | **List&lt;float?&gt;** | Start coordinates array in &#x60;[lon, lat]&#x60; format. If left blank, the optimization engine will identify the optimal start point.  | [optional] 
**StartIndex** | **Object** | Index of relevant row and column in custom matrix.  | [optional] 
**End** | **List&lt;float?&gt;** | End coordinates array in &#x60;[lon, lat]&#x60; format. If left blank, the optimization engine will identify the optimal end point.  | [optional] 
**EndIndex** | **Object** | Index of relevant row and column in custom matrix.  | [optional] 
**Capacity** | **List&lt;int?&gt;** | Array of integers describing multidimensional quantities.  | [optional] 
**Skills** | **List&lt;int?&gt;** | Array of integers defining skills for this vehicle  | [optional] 
**TimeWindow** | **List&lt;int?&gt;** | A &#x60;time_window&#x60; array describing working hours for this vehicle, in week seconds, i.e. 28800 &#x3D; Mon, 8 AM.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

