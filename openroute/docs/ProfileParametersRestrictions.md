# IO.Swagger.Model.ProfileParametersRestrictions
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Length** | **float?** | Length restriction in metres. | [optional] 
**Width** | **float?** | Width restriction in metres. | [optional] 
**Height** | **float?** | Height restriction in metres.  | [optional] 
**Axleload** | **float?** | Axleload restriction in tons. | [optional] 
**Weight** | **float?** | Weight restriction in tons.  | [optional] 
**Hazmat** | **bool?** | Specifies whether to use appropriate routing for delivering hazardous goods and avoiding water protected areas. Default is &#x60;false&#x60;.  | [optional] [default to false]
**SurfaceType** | **string** | Specifies the minimum surface type. Default is &#x60;sett&#x60;.  | [optional] [default to "sett"]
**TrackType** | **string** | Specifies the minimum grade of the route. Default is &#x60;grade1&#x60;.  | [optional] [default to "grade1"]
**SmoothnessType** | **string** | Specifies the minimum smoothness of the route. Default is &#x60;good&#x60;. | [optional] [default to SmoothnessTypeEnum.Good]
**MaximumSlopedKerb** | **float?** | Specifies the maximum height of the sloped curb in metres. Values are &#x60;0.03&#x60;, &#x60;0.06&#x60; (default), &#x60;0.1&#x60;. | [optional] [default to 0.6]
**MaximumIncline** | **int?** | Specifies the maximum incline as a percentage. &#x60;3&#x60;, &#x60;6&#x60; (default), &#x60;10&#x60;, &#x60;15. | [optional] [default to 6]
**MinimumWidth** | **float?** | Specifies the minimum width of the footway in metres. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

