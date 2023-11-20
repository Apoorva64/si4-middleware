# IO.Swagger.Model.JSONIndividualRouteResponseLegs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | The type of the leg, possible values are currently &#x27;walk&#x27; and &#x27;pt&#x27;. | [optional] 
**DepartureLocation** | **string** | The departure location of the leg. | [optional] 
**TripHeadsign** | **string** | The headsign of the public transport vehicle of the leg. | [optional] 
**RouteLongName** | **string** | The public transport route name of the leg. | [optional] 
**RouteShortName** | **string** | The public transport route name (short version) of the leg. | [optional] 
**RouteDesc** | **string** | The route description of the leg (if provided in the GTFS data set). | [optional] 
**RouteType** | **int?** | The route type of the leg (if provided in the GTFS data set). | [optional] 
**Distance** | **double?** | The distance for the leg in metres. | [optional] 
**Duration** | **double?** | The duration for the leg in seconds. | [optional] 
**Departure** | **DateTime?** | Departure date and time | [optional] 
**Arrival** | **DateTime?** | Arrival date and time | [optional] 
**FeedId** | **string** | The feed ID this public transport leg based its information from. | [optional] 
**TripId** | **string** | The trip ID of this public transport leg. | [optional] 
**RouteId** | **string** | The route ID of this public transport leg. | [optional] 
**IsInSameVehicleAsPrevious** | **bool?** | Whether the legs continues in the same vehicle as the previous one. | [optional] 
**Geometry** | **string** | The geometry of the leg. This is an encoded polyline. | [optional] 
**Instructions** | [**List&lt;JSONIndividualRouteResponseSteps&gt;**](JSONIndividualRouteResponseSteps.md) | List containing the specific steps the segment consists of. | [optional] 
**Stops** | [**List&lt;JSONIndividualRouteResponseStops&gt;**](JSONIndividualRouteResponseStops.md) | List containing the stops the along the leg. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

