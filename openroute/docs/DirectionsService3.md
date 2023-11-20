# IO.Swagger.Model.DirectionsService3
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Coordinates** | **List&lt;List&lt;double?&gt;&gt;** | The waypoints to use for the route as an array of &#x60;longitude/latitude&#x60; pairs in WGS 84 (EPSG:4326) | 
**Id** | **string** | Arbitrary identification string of the request reflected in the meta information. | [optional] 
**Preference** | **string** | Specifies the route preference | [optional] [default to PreferenceEnum.Recommended]
**Units** | **string** | Specifies the distance unit. | [optional] [default to UnitsEnum.M]
**Language** | **string** | Language for the route instructions. | [optional] [default to LanguageEnum.En]
**Geometry** | **bool?** | Specifies whether to return geometry.  | [optional] [default to true]
**Instructions** | **bool?** | Specifies whether to return instructions. | [optional] [default to true]
**InstructionsFormat** | **string** | Select html for more verbose instructions. | [optional] [default to InstructionsFormatEnum.Text]
**RoundaboutExits** | **bool?** | Provides bearings of the entrance and all passed roundabout exits. Adds the &#x60;exit_bearings&#x60; array to the step object in the response.  | [optional] [default to false]
**Attributes** | **List&lt;string&gt;** | List of route attributes | [optional] 
**Maneuvers** | **bool?** | Specifies whether the maneuver object is included into the step object or not.  | [optional] [default to false]
**Radiuses** | **List&lt;double?&gt;** | A list of maximum distances (measured in metres) that limit the search of nearby road segments to every given waypoint. The values must be greater than 0, the value of -1 specifies using the maximum possible search radius. The number of radiuses correspond to the number of waypoints. If only a single value is given, it will be applied to all waypoints. | [optional] 
**Bearings** | **List&lt;List&lt;double?&gt;&gt;** | Specifies a list of pairs (bearings and deviations) to filter the segments of the road network a waypoint can snap to. \&quot;For example &#x60;bearings&#x3D;[[45,10],[120,20]]&#x60;. \&quot;Each pair is a comma-separated list that can consist of one or two float values, where the first value is the bearing and the second one is the allowed deviation from the bearing. \&quot;The bearing can take values between &#x60;0&#x60; and &#x60;360&#x60; clockwise from true north. If the deviation is not set, then the default value of &#x60;100&#x60; degrees is used. \&quot;The number of pairs must correspond to the number of waypoints. \&quot;The number of bearings corresponds to the length of waypoints-1 or waypoints. If the bearing information for the last waypoint is given, then this will control the sector from which the destination waypoint may be reached. \&quot;You can skip a bearing for a certain waypoint by passing an empty value for an array, e.g. &#x60;[30,20],[],[40,20]&#x60;. | [optional] 
**ContinueStraight** | **bool?** | Forces the route to keep going straight at waypoints restricting uturns there even if it would be faster. | [optional] [default to false]
**Elevation** | **bool?** | Specifies whether to return elevation values for points. Please note that elevation also gets encoded for json response encoded polyline. | [optional] 
**ExtraInfo** | **List&lt;string&gt;** | The extra info items to include in the response | [optional] 
**Options** | [**RouteOptions**](RouteOptions.md) |  | [optional] 
**SuppressWarnings** | **bool?** | Suppress warning messages in the response | [optional] 
**GeometrySimplify** | **bool?** | Specifies whether to simplify the geometry. Simplify geometry cannot be applied to routes with more than **one segment** and when &#x60;extra_info&#x60; is required. | [optional] [default to false]
**SkipSegments** | **List&lt;int?&gt;** | Specifies the segments that should be skipped in the route calculation. A segment is the connection between two given coordinates and the counting starts with 1 for the connection between the first and second coordinate. | [optional] 
**AlternativeRoutes** | [**AlternativeRoutes**](AlternativeRoutes.md) |  | [optional] 
**MaximumSpeed** | **double?** | The maximum speed specified by user. | [optional] 
**Schedule** | **bool?** | If true, return a public transport schedule starting at &lt;departure&gt; for the next &lt;schedule_duration&gt; minutes. | [optional] [default to false]
**ScheduleDuration** | [**V2directionsprofileScheduleDuration**](V2directionsprofileScheduleDuration.md) |  | [optional] 
**ScheduleRows** | **int?** | The maximum amount of entries that should be returned when requesting a schedule. | [optional] 
**WalkingTime** | [**V2directionsprofileWalkingTime**](V2directionsprofileWalkingTime.md) |  | [optional] 
**IgnoreTransfers** | **bool?** | Specifies if transfers as criterion should be ignored. | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

