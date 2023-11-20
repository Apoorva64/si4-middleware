# IO.Swagger.Model.OptimizationJobs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int?** | an integer used as unique identifier  | [optional] 
**Location** | **List&lt;List&lt;float?&gt;&gt;** | coordinates array in &#x60;[lon, lat]&#x60;  | [optional] 
**LocationIndex** | **Object** | index of relevant row and column in custom matrix  | [optional] 
**Service** | **Object** | job service duration (defaults to 0), in seconds  | [optional] 
**Amount** | **List&lt;int?&gt;** | Array describing multidimensional quantities  | [optional] 
**Skills** | **List&lt;int?&gt;** | Array of integers defining mandatory skills for this job  | [optional] 
**TimeWindows** | **List&lt;List&lt;int?&gt;&gt;** | Array of &#x60;time_window&#x60; arrays describing valid slots for job service start and end, in week seconds, i.e. 28800 &#x3D; Mon, 8 AM.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

