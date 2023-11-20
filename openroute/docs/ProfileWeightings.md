# IO.Swagger.Model.ProfileWeightings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SteepnessDifficulty** | **int?** | Specifies the fitness level for &#x60;cycling-*&#x60; profiles.   level: 0 &#x3D; Novice, 1 &#x3D; Moderate, 2 &#x3D; Amateur, 3 &#x3D; Pro. The prefered gradient increases with level. | [optional] 
**Green** | **float?** | Specifies the Green factor for &#x60;foot-*&#x60; profiles.  factor: Multiplication factor range from 0 to 1. 0 is the green routing base factor without multiplying it by the manual factor and is already different from normal routing. 1 will prefer ways through green areas over a shorter route. | [optional] 
**Quiet** | **float?** | Specifies the Quiet factor for foot-* profiles.  factor: Multiplication factor range from 0 to 1. 0 is the quiet routing base factor without multiplying it by the manual factor and is already different from normal routing. 1 will prefer quiet ways over a shorter route. | [optional] 
**Shadow** | **float?** | Specifies the shadow factor for &#x60;foot-*&#x60; profiles.  factor: Multiplication factor range from 0 to 1. 0 is the shadow routing base factor without multiplying it by the manual factor and is already different from normal routing. 1 will prefer ways through shadow areas over a shorter route. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

