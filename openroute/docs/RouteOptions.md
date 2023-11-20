# IO.Swagger.Model.RouteOptions
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvoidFeatures** | **List&lt;string&gt;** | List of features to avoid.  | [optional] 
**AvoidBorders** | **string** | Specify which type of border crossing to avoid | [optional] 
**AvoidCountries** | **List&lt;string&gt;** | List of countries to exclude from matrix with &#x60;driving-*&#x60; profiles. Can be used together with &#x60;&#x27;avoid_borders&#x27;: &#x27;controlled&#x27;&#x60;. &#x60;[ 11, 193 ]&#x60; would exclude Austria and Switzerland. List of countries and application examples can be found [here](https://GIScience.github.io/openrouteservice/documentation/routing-options/Country-List.html). Also, ISO standard country codes cna be used in place of the numerical ids, for example, DE or DEU for Germany.  | [optional] 
**VehicleType** | **string** | Definition of the vehicle type. | [optional] [default to VehicleTypeEnum.Hgv]
**ProfileParams** | [**ProfileParameters**](ProfileParameters.md) |  | [optional] 
**AvoidPolygons** | [**RouteOptionsAvoidPolygons**](RouteOptionsAvoidPolygons.md) |  | [optional] 
**RoundTrip** | [**RoundTripRouteOptions**](RoundTripRouteOptions.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

