# IO.Swagger.Model.ElevationLineBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FormatIn** | **string** | The input format the API has to expect. | 
**FormatOut** | **string** | The output format to be returned. | [optional] [default to FormatOutEnum.Geojson]
**Dataset** | **string** | The elevation dataset to be used. | [optional] [default to DatasetEnum.Srtm]
**Geometry** | **Object** | * geojson: A geometry object of a LineString GeoJSON, e.g.          {\&quot;type\&quot;: \&quot;LineString\&quot;,           \&quot;coordinates\&quot;: [[13.331302, 38.108433],[13.331273, 38.10849]]          } * polyline: A list of coordinate lists, e.g.          [[13.331302, 38.108433], [13.331273, 38.10849]]  * encodedpolyline5: A &lt;a href&#x3D;\&quot;https://developers.google.com/maps/documentation/utilities/polylinealgorithm\&quot;&gt;Google encoded polyline&lt;/a&gt; with a coordinate precision of 5, e.g.          u&#x60;rgFswjpAKD  * encodedpolyline6: A &lt;a href&#x3D;\&quot;https://developers.google.com/maps/documentation/utilities/polylinealgorithm\&quot;&gt;Google encoded polyline&lt;/a&gt; with a coordinate precision of 6, e.g.          ap}tgAkutlXqBx@  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

