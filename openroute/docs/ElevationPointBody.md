# IO.Swagger.Model.ElevationPointBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FormatIn** | **string** | The input format the API has to expect. | 
**FormatOut** | **string** | The output format to be returned. | [optional] [default to FormatOutEnum.Geojson]
**Dataset** | **string** | The elevation dataset to be used. | [optional] [default to DatasetEnum.Srtm]
**Geometry** | **Object** | * geojson: A geometry object of a Point GeoJSON, e.g.          {\&quot;type\&quot;: \&quot;Point\&quot;,           \&quot;coordinates\&quot;: [13.331273, 38.10849]          } * point: A coordinate list, e.g.          [13.331273, 38.10849]  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

