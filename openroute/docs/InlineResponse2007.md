# IO.Swagger.Model.InlineResponse2007
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **int?** | status code. Possible values:   Value         | Status |  :- -- -- -- -- --: | :- -- -- -- -- --: |  &#x60;0&#x60; | no error raised |  &#x60;1&#x60; | internal error |  &#x60;2&#x60; | input error |  &#x60;3&#x60; | routing error |  | [optional] 
**Error** | **string** | error message (present if &#x60;code&#x60; is different from &#x60;0&#x60;)  | [optional] 
**Summary** | [**InlineResponse2007Summary**](InlineResponse2007Summary.md) |  | [optional] 
**Unassigned** | [**List&lt;InlineResponse2007Unassigned&gt;**](InlineResponse2007Unassigned.md) | array of objects describing unassigned jobs with their &#x60;id&#x60; and &#x60;location&#x60; (if provided)  | [optional] 
**Routes** | [**List&lt;InlineResponse2007Routes&gt;**](InlineResponse2007Routes.md) | array of &#x60;route&#x60; objects  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

