# IO.Swagger.Api.GeocodeApi

All URIs are relative to *https://api.openrouteservice.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GeocodeAutocompleteGet**](GeocodeApi.md#geocodeautocompleteget) | **GET** /geocode/autocomplete | Geocode Autocomplete Service
[**GeocodeReverseGet**](GeocodeApi.md#geocodereverseget) | **GET** /geocode/reverse | Reverse Geocode Service
[**GeocodeSearchGet**](GeocodeApi.md#geocodesearchget) | **GET** /geocode/search | Forward Geocode Service
[**GeocodeSearchStructuredGet**](GeocodeApi.md#geocodesearchstructuredget) | **GET** /geocode/search/structured | Structured Forward Geocode Service (beta)

<a name="geocodeautocompleteget"></a>
# **GeocodeAutocompleteGet**
> void GeocodeAutocompleteGet (string apiKey, string text, float? focusPointLon = null, float? focusPointLat = null, float? boundaryRectMinLon = null, float? boundaryRectMinLat = null, float? boundaryRectMaxLon = null, float? boundaryRectMaxLat = null, string boundaryCountry = null, List<string> sources = null, List<string> layers = null)

Geocode Autocomplete Service

**Requests should be throttled when using this endpoint!** *Be aware that Responses are asynchronous.* Returns a JSON formatted list of objects corresponding to the search input. `boundary.*`-parameters can be combined if they are overlapping. **The interactivity for this enpoint is experimental!** [Please refer to this external Documentation](https://github.com/pelias/documentation/blob/master/autocomplete.md) 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GeocodeAutocompleteGetExample
    {
        public void main()
        {
            var apiInstance = new GeocodeApi();
            var apiKey = apiKey_example;  // string | Insert your API Key here.  (default to your-api-key)
            var text = text_example;  // string | Name of location, street address or postal code. 
            var focusPointLon = 3.4;  // float? | Longitude of the `focus.point`. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance.  Use with `focus.point.lat`.  (optional) 
            var focusPointLat = 3.4;  // float? | Latitude of the `focus.point`. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance. Use with `focus.point.lon`.  (optional) 
            var boundaryRectMinLon = 3.4;  // float? | Left border of rectangular boundary to narrow results.  (optional) 
            var boundaryRectMinLat = 3.4;  // float? | Bottom border of rectangular boundary to narrow results.  (optional) 
            var boundaryRectMaxLon = 3.4;  // float? | Right border of rectangular boundary to narrow results.  (optional) 
            var boundaryRectMaxLat = 3.4;  // float? | Top border of rectangular boundary to narrow results.  (optional) 
            var boundaryCountry = boundaryCountry_example;  // string | Restrict results to single country. Possible values are [alpha-2 and alpha-3 country codes](https://en.wikipedia.org/wiki/ISO_3166-1). Example: `DEU` or `DE` for Germany.  (optional) 
            var sources = new List<string>(); // List<string> | Restrict your search to specific sources. Searches all sources by default. You can either use the normal or short name. Sources are [`openstreetmap(osm)`](http://www.openstreetmap.org/), [`openaddresses(oa)`](http://openaddresses.io/), [`whosonfirst(wof)`](https://whosonfirst.org/), [`geonames(gn)`](http://www.geonames.org/).  (optional) 
            var layers = new List<string>(); // List<string> | Restrict search to layers (place type). By default all layers are searched.   layer|description|   - -- -|- -- -|   `venue`|points of interest, businesses, things with walls|   `address`|places with a street address|   `street`|streets,roads,highways|   `neighbourhood`|social communities, neighbourhoods|   `borough`|a local administrative boundary, currently only used for New York City|   `localadmin`|local administrative boundaries|   `locality`|towns, hamlets, cities|   `county`|official governmental area; usually bigger than a locality, almost always smaller than a region|   `macrocounty`|a related group of counties. Mostly in Europe.|   `region`|states and provinces|   `macroregion`|a related group of regions. Mostly in Europe|   `country`|places that issue passports, nations, nation-states|   `coarse`|alias for simultaneously using all administrative layers (everything except `venue` and `address`)|  (optional) 

            try
            {
                // Geocode Autocomplete Service
                apiInstance.GeocodeAutocompleteGet(apiKey, text, focusPointLon, focusPointLat, boundaryRectMinLon, boundaryRectMinLat, boundaryRectMaxLon, boundaryRectMaxLat, boundaryCountry, sources, layers);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GeocodeApi.GeocodeAutocompleteGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **string**| Insert your API Key here.  | [default to your-api-key]
 **text** | **string**| Name of location, street address or postal code.  | 
 **focusPointLon** | **float?**| Longitude of the &#x60;focus.point&#x60;. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance.  Use with &#x60;focus.point.lat&#x60;.  | [optional] 
 **focusPointLat** | **float?**| Latitude of the &#x60;focus.point&#x60;. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance. Use with &#x60;focus.point.lon&#x60;.  | [optional] 
 **boundaryRectMinLon** | **float?**| Left border of rectangular boundary to narrow results.  | [optional] 
 **boundaryRectMinLat** | **float?**| Bottom border of rectangular boundary to narrow results.  | [optional] 
 **boundaryRectMaxLon** | **float?**| Right border of rectangular boundary to narrow results.  | [optional] 
 **boundaryRectMaxLat** | **float?**| Top border of rectangular boundary to narrow results.  | [optional] 
 **boundaryCountry** | **string**| Restrict results to single country. Possible values are [alpha-2 and alpha-3 country codes](https://en.wikipedia.org/wiki/ISO_3166-1). Example: &#x60;DEU&#x60; or &#x60;DE&#x60; for Germany.  | [optional] 
 **sources** | [**List&lt;string&gt;**](string.md)| Restrict your search to specific sources. Searches all sources by default. You can either use the normal or short name. Sources are [&#x60;openstreetmap(osm)&#x60;](http://www.openstreetmap.org/), [&#x60;openaddresses(oa)&#x60;](http://openaddresses.io/), [&#x60;whosonfirst(wof)&#x60;](https://whosonfirst.org/), [&#x60;geonames(gn)&#x60;](http://www.geonames.org/).  | [optional] 
 **layers** | [**List&lt;string&gt;**](string.md)| Restrict search to layers (place type). By default all layers are searched.   layer|description|   - -- -|- -- -|   &#x60;venue&#x60;|points of interest, businesses, things with walls|   &#x60;address&#x60;|places with a street address|   &#x60;street&#x60;|streets,roads,highways|   &#x60;neighbourhood&#x60;|social communities, neighbourhoods|   &#x60;borough&#x60;|a local administrative boundary, currently only used for New York City|   &#x60;localadmin&#x60;|local administrative boundaries|   &#x60;locality&#x60;|towns, hamlets, cities|   &#x60;county&#x60;|official governmental area; usually bigger than a locality, almost always smaller than a region|   &#x60;macrocounty&#x60;|a related group of counties. Mostly in Europe.|   &#x60;region&#x60;|states and provinces|   &#x60;macroregion&#x60;|a related group of regions. Mostly in Europe|   &#x60;country&#x60;|places that issue passports, nations, nation-states|   &#x60;coarse&#x60;|alias for simultaneously using all administrative layers (everything except &#x60;venue&#x60; and &#x60;address&#x60;)|  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="geocodereverseget"></a>
# **GeocodeReverseGet**
> void GeocodeReverseGet (string apiKey, float? pointLon, float? pointLat, decimal? boundaryCircleRadius = null, long? size = null, List<string> layers = null, List<string> sources = null, string boundaryCountry = null)

Reverse Geocode Service

Returns the next enclosing object with an address tag which surrounds the given coordinate. **The interactivity for this enpoint is experimental!** [Please refer to this external Documentation](https://github.com/pelias/documentation/blob/master/reverse.md#reverse-geocoding) 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GeocodeReverseGetExample
    {
        public void main()
        {
            var apiInstance = new GeocodeApi();
            var apiKey = apiKey_example;  // string | Insert your API Key here.  (default to your-api-key)
            var pointLon = 3.4;  // float? | Longitude of the coordinate to query. 
            var pointLat = 3.4;  // float? | Latitude of the coordinate to query. 
            var boundaryCircleRadius = 1.2;  // decimal? | Restrict search to circular region around `point.lat/point.lon`. Value in kilometers.  (optional) 
            var size = 789;  // long? | Set the number of returned results.  (optional) 
            var layers = new List<string>(); // List<string> | Restrict search to layers (place type). By default all layers are searched.   layer|description|   - -- -|- -- -|   `venue`|points of interest, businesses, things with walls|   `address`|places with a street address|   `street`|streets,roads,highways|   `neighbourhood`|social communities, neighbourhoods|   `locality`|towns, hamlets, cities|   `borough`|a local administrative boundary, currently only used for New York City|   `localadmin`|local administrative boundaries|   `county`|official governmental area; usually bigger than a locality, almost always smaller than a region|   `macrocounty`|a related group of counties. Mostly in Europe.|   `region`|states and provinces|   `macroregion`|a related group of regions. Mostly in Europe|   `country`|places that issue passports, nations, nation-states|   `coarse`|alias for simultaneously using all administrative layers (everything except `venue` and `address`)|  (optional) 
            var sources = new List<string>(); // List<string> | Restrict your search to specific sources. Searches all sources by default. You can either use the normal or short name. Sources are [`openstreetmap(osm)`](http://www.openstreetmap.org/), [`openaddresses(oa)`](http://openaddresses.io/), [`whosonfirst(wof)`](https://whosonfirst.org/), [`geonames(gn)`](http://www.geonames.org/).  (optional) 
            var boundaryCountry = boundaryCountry_example;  // string | Restrict search to country by [alpha 2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [alpha 3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) codes.  (optional) 

            try
            {
                // Reverse Geocode Service
                apiInstance.GeocodeReverseGet(apiKey, pointLon, pointLat, boundaryCircleRadius, size, layers, sources, boundaryCountry);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GeocodeApi.GeocodeReverseGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **string**| Insert your API Key here.  | [default to your-api-key]
 **pointLon** | **float?**| Longitude of the coordinate to query.  | 
 **pointLat** | **float?**| Latitude of the coordinate to query.  | 
 **boundaryCircleRadius** | **decimal?**| Restrict search to circular region around &#x60;point.lat/point.lon&#x60;. Value in kilometers.  | [optional] 
 **size** | **long?**| Set the number of returned results.  | [optional] 
 **layers** | [**List&lt;string&gt;**](string.md)| Restrict search to layers (place type). By default all layers are searched.   layer|description|   - -- -|- -- -|   &#x60;venue&#x60;|points of interest, businesses, things with walls|   &#x60;address&#x60;|places with a street address|   &#x60;street&#x60;|streets,roads,highways|   &#x60;neighbourhood&#x60;|social communities, neighbourhoods|   &#x60;locality&#x60;|towns, hamlets, cities|   &#x60;borough&#x60;|a local administrative boundary, currently only used for New York City|   &#x60;localadmin&#x60;|local administrative boundaries|   &#x60;county&#x60;|official governmental area; usually bigger than a locality, almost always smaller than a region|   &#x60;macrocounty&#x60;|a related group of counties. Mostly in Europe.|   &#x60;region&#x60;|states and provinces|   &#x60;macroregion&#x60;|a related group of regions. Mostly in Europe|   &#x60;country&#x60;|places that issue passports, nations, nation-states|   &#x60;coarse&#x60;|alias for simultaneously using all administrative layers (everything except &#x60;venue&#x60; and &#x60;address&#x60;)|  | [optional] 
 **sources** | [**List&lt;string&gt;**](string.md)| Restrict your search to specific sources. Searches all sources by default. You can either use the normal or short name. Sources are [&#x60;openstreetmap(osm)&#x60;](http://www.openstreetmap.org/), [&#x60;openaddresses(oa)&#x60;](http://openaddresses.io/), [&#x60;whosonfirst(wof)&#x60;](https://whosonfirst.org/), [&#x60;geonames(gn)&#x60;](http://www.geonames.org/).  | [optional] 
 **boundaryCountry** | **string**| Restrict search to country by [alpha 2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [alpha 3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) codes.  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="geocodesearchget"></a>
# **GeocodeSearchGet**
> void GeocodeSearchGet (string apiKey, string text, float? focusPointLon = null, float? focusPointLat = null, float? boundaryRectMinLon = null, float? boundaryRectMinLat = null, float? boundaryRectMaxLon = null, float? boundaryRectMaxLat = null, float? boundaryCircleLon = null, float? boundaryCircleLat = null, float? boundaryCircleRadius = null, string boundaryGid = null, string boundaryCountry = null, List<string> sources = null, List<string> layers = null, long? size = null)

Forward Geocode Service

Returns a JSON formatted list of objects corresponding to the search input. `boundary.*`-parameters can be combined if they are overlapping. **The interactivity for this enpoint is experimental!** [Please refer to this external Documentation](https://github.com/pelias/documentation/blob/master/search.md#search-the-world) 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GeocodeSearchGetExample
    {
        public void main()
        {
            var apiInstance = new GeocodeApi();
            var apiKey = apiKey_example;  // string | Insert your API Key here.  (default to you-api-key)
            var text = text_example;  // string | Name of location, street address or postal code. 
            var focusPointLon = 3.4;  // float? | Longitude of the `focus.point`. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance.  Use with `focus.point.lat`.  (optional) 
            var focusPointLat = 3.4;  // float? | Latitude of the `focus.point`. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance. Use with `focus.point.lon`.  (optional) 
            var boundaryRectMinLon = 3.4;  // float? | Left border of rectangular boundary to narrow results.  (optional) 
            var boundaryRectMinLat = 3.4;  // float? | Bottom border of rectangular boundary to narrow results.  (optional) 
            var boundaryRectMaxLon = 3.4;  // float? | Right border of rectangular boundary to narrow results.  (optional) 
            var boundaryRectMaxLat = 3.4;  // float? | Top border of rectangular boundary to narrow results.  (optional) 
            var boundaryCircleLon = 3.4;  // float? | Center Longitude of circular boundary to narrow results. Use with `boundary.circle.lat` & `boundary.circle.radius`.  (optional) 
            var boundaryCircleLat = 3.4;  // float? | Center Latitude of circular boundary to narrow results. Use with `boundary.circle.lon` & `boundary.circle.radius`.  (optional) 
            var boundaryCircleRadius = 3.4;  // float? | Radius of circular boundary around the center coordinate in kilometers. Use with `boundary.circle.lon` & `boundary.circle.lat`.  (optional) 
            var boundaryGid = boundaryGid_example;  // string | Restrict results to administrative boundary using a Pelias global id [`gid`](https://github.com/pelias/documentation/blob/f1f475aa4f8c18426fb80baea636990502c08ed3/search.md#search-within-a-parent-administrative-area). `gid`s for records can be found using either the [Who's on First Spelunker](http://spelunker.whosonfirst.org/), a tool for searching Who's on First data, or from the responses of other Pelias queries. In this case a [search for Oklahoma](http://pelias.github.io/compare/#/v1/search%3Ftext=oklahoma) will return the proper `gid`.  (optional) 
            var boundaryCountry = boundaryCountry_example;  // string | Restrict results to single country. Possible values are [alpha-2 and alpha-3 country codes](https://en.wikipedia.org/wiki/ISO_3166-1). Example: `DEU` or `DE` for Germany.  (optional) 
            var sources = new List<string>(); // List<string> | Restrict your search to specific sources. Searches all sources by default. You can either use the normal or short name. Sources are [`openstreetmap(osm)`](http://www.openstreetmap.org/), [`openaddresses(oa)`](http://openaddresses.io/), [`whosonfirst(wof)`](https://whosonfirst.org/), [`geonames(gn)`](http://www.geonames.org/).  (optional) 
            var layers = new List<string>(); // List<string> | Restrict search to layers (place type). By default all layers are searched.   layer|description|   - -- -|- -- -|   `venue`|points of interest, businesses, things with walls|   `address`|places with a street address|   `street`|streets,roads,highways|   `neighbourhood`|social communities, neighbourhoods|   `borough`|a local administrative boundary, currently only used for New York City|   `localadmin`|local administrative boundaries|   `locality`|towns, hamlets, cities|   `county`|official governmental area; usually bigger than a locality, almost always smaller than a region|   `macrocounty`|a related group of counties. Mostly in Europe.|   `region`|states and provinces|   `macroregion`|a related group of regions. Mostly in Europe|   `country`|places that issue passports, nations, nation-states|   `coarse`|alias for simultaneously using all administrative layers (everything except `venue` and `address`)|  (optional) 
            var size = 789;  // long? | Set the number of returned results.  (optional) 

            try
            {
                // Forward Geocode Service
                apiInstance.GeocodeSearchGet(apiKey, text, focusPointLon, focusPointLat, boundaryRectMinLon, boundaryRectMinLat, boundaryRectMaxLon, boundaryRectMaxLat, boundaryCircleLon, boundaryCircleLat, boundaryCircleRadius, boundaryGid, boundaryCountry, sources, layers, size);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GeocodeApi.GeocodeSearchGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **string**| Insert your API Key here.  | [default to you-api-key]
 **text** | **string**| Name of location, street address or postal code.  | 
 **focusPointLon** | **float?**| Longitude of the &#x60;focus.point&#x60;. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance.  Use with &#x60;focus.point.lat&#x60;.  | [optional] 
 **focusPointLat** | **float?**| Latitude of the &#x60;focus.point&#x60;. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance. Use with &#x60;focus.point.lon&#x60;.  | [optional] 
 **boundaryRectMinLon** | **float?**| Left border of rectangular boundary to narrow results.  | [optional] 
 **boundaryRectMinLat** | **float?**| Bottom border of rectangular boundary to narrow results.  | [optional] 
 **boundaryRectMaxLon** | **float?**| Right border of rectangular boundary to narrow results.  | [optional] 
 **boundaryRectMaxLat** | **float?**| Top border of rectangular boundary to narrow results.  | [optional] 
 **boundaryCircleLon** | **float?**| Center Longitude of circular boundary to narrow results. Use with &#x60;boundary.circle.lat&#x60; &amp; &#x60;boundary.circle.radius&#x60;.  | [optional] 
 **boundaryCircleLat** | **float?**| Center Latitude of circular boundary to narrow results. Use with &#x60;boundary.circle.lon&#x60; &amp; &#x60;boundary.circle.radius&#x60;.  | [optional] 
 **boundaryCircleRadius** | **float?**| Radius of circular boundary around the center coordinate in kilometers. Use with &#x60;boundary.circle.lon&#x60; &amp; &#x60;boundary.circle.lat&#x60;.  | [optional] 
 **boundaryGid** | **string**| Restrict results to administrative boundary using a Pelias global id [&#x60;gid&#x60;](https://github.com/pelias/documentation/blob/f1f475aa4f8c18426fb80baea636990502c08ed3/search.md#search-within-a-parent-administrative-area). &#x60;gid&#x60;s for records can be found using either the [Who&#x27;s on First Spelunker](http://spelunker.whosonfirst.org/), a tool for searching Who&#x27;s on First data, or from the responses of other Pelias queries. In this case a [search for Oklahoma](http://pelias.github.io/compare/#/v1/search%3Ftext&#x3D;oklahoma) will return the proper &#x60;gid&#x60;.  | [optional] 
 **boundaryCountry** | **string**| Restrict results to single country. Possible values are [alpha-2 and alpha-3 country codes](https://en.wikipedia.org/wiki/ISO_3166-1). Example: &#x60;DEU&#x60; or &#x60;DE&#x60; for Germany.  | [optional] 
 **sources** | [**List&lt;string&gt;**](string.md)| Restrict your search to specific sources. Searches all sources by default. You can either use the normal or short name. Sources are [&#x60;openstreetmap(osm)&#x60;](http://www.openstreetmap.org/), [&#x60;openaddresses(oa)&#x60;](http://openaddresses.io/), [&#x60;whosonfirst(wof)&#x60;](https://whosonfirst.org/), [&#x60;geonames(gn)&#x60;](http://www.geonames.org/).  | [optional] 
 **layers** | [**List&lt;string&gt;**](string.md)| Restrict search to layers (place type). By default all layers are searched.   layer|description|   - -- -|- -- -|   &#x60;venue&#x60;|points of interest, businesses, things with walls|   &#x60;address&#x60;|places with a street address|   &#x60;street&#x60;|streets,roads,highways|   &#x60;neighbourhood&#x60;|social communities, neighbourhoods|   &#x60;borough&#x60;|a local administrative boundary, currently only used for New York City|   &#x60;localadmin&#x60;|local administrative boundaries|   &#x60;locality&#x60;|towns, hamlets, cities|   &#x60;county&#x60;|official governmental area; usually bigger than a locality, almost always smaller than a region|   &#x60;macrocounty&#x60;|a related group of counties. Mostly in Europe.|   &#x60;region&#x60;|states and provinces|   &#x60;macroregion&#x60;|a related group of regions. Mostly in Europe|   &#x60;country&#x60;|places that issue passports, nations, nation-states|   &#x60;coarse&#x60;|alias for simultaneously using all administrative layers (everything except &#x60;venue&#x60; and &#x60;address&#x60;)|  | [optional] 
 **size** | **long?**| Set the number of returned results.  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="geocodesearchstructuredget"></a>
# **GeocodeSearchStructuredGet**
> void GeocodeSearchStructuredGet (string apiKey, string address = null, string neighbourhood = null, string country = null, string postalcode = null, string region = null, string county = null, string locality = null, string borough = null, float? focusPointLon = null, float? focusPointLat = null, float? boundaryRectMinLon = null, float? boundaryRectMinLat = null, float? boundaryRectMaxLon = null, float? boundaryRectMaxLat = null, float? boundaryCircleLon = null, float? boundaryCircleLat = null, float? boundaryCircleRadius = null, string boundaryCountry = null, List<string> layers = null, List<string> sources = null, long? size = null)

Structured Forward Geocode Service (beta)

Returns a JSON formatted list of objects corresponding to the search input. **The interactivity for this enpoint is experimental!** [Please refer to this external Documentation](https://github.com/pelias/documentation/blob/master/structured-geocoding.md#structured-geocoding) 

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GeocodeSearchStructuredGetExample
    {
        public void main()
        {
            var apiInstance = new GeocodeApi();
            var apiKey = apiKey_example;  // string | Insert your API Key here.  (default to your-api-key)
            var address = address_example;  // string | Search for full address with house number or only a street name.  (optional) 
            var neighbourhood = neighbourhood_example;  // string | Search for neighbourhoods. Neighbourhoods are vernacular geographic entities that may not necessarily be official administrative divisions but are important nonetheless. Example: `Notting Hill`.  (optional) 
            var country = country_example;  // string | Search for full country name, [alpha 2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [alpha 3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) codes.  (optional) 
            var postalcode = postalcode_example;  // string | Search for postal codes. Postal codes are unique within a country so they are useful in geocoding as a shorthand for a fairly granular geographical location.  (optional) 
            var region = region_example;  // string | Search for regions. Regions are normally the first-level administrative divisions within countries. For US-regions [common abbreviations](https://en.wikipedia.org/wiki/List_of_U.S._state_abbreviations) can be used.  (optional) 
            var county = county_example;  // string | Search for counties. Counties are administrative divisions between localities and regions. Can be useful when attempting to disambiguate between localities.  (optional) 
            var locality = locality_example;  // string | Search for localities. Localities are equivalent to what are commonly referred to as *cities*.  (optional) 
            var borough = borough_example;  // string | Search for boroughs. Boroughs are mostly known in the context of New York City, even though they may exist in other cities, such as Mexico City. Example: `Manhatten`.  (optional) 
            var focusPointLon = 3.4;  // float? | Longitude of the `focus.point`. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance.  Use with `focus.point.lat`.  (optional) 
            var focusPointLat = 3.4;  // float? | Latitude of the `focus.point`. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance. Use with `focus.point.lon`.  (optional) 
            var boundaryRectMinLon = 3.4;  // float? | Left border of rectangular boundary to narrow results.  (optional) 
            var boundaryRectMinLat = 3.4;  // float? | Bottom border of rectangular boundary to narrow results.  (optional) 
            var boundaryRectMaxLon = 3.4;  // float? | Right border of rectangular boundary to narrow results.  (optional) 
            var boundaryRectMaxLat = 3.4;  // float? | Top border of rectangular boundary to narrow results.  (optional) 
            var boundaryCircleLon = 3.4;  // float? | Center Longitude of circular boundary to narrow results. Use with `boundary.circle.lat` & `boundary.circle.radius`.  (optional) 
            var boundaryCircleLat = 3.4;  // float? | Center Latitude of circular boundary to narrow results. Use with `boundary.circle.lon` & `boundary.circle.radius`.  (optional) 
            var boundaryCircleRadius = 3.4;  // float? | Radius of circular boundary around the center coordinate in kilometers. Use with `boundary.circle.lon` & `boundary.circle.lat`.  (optional) 
            var boundaryCountry = boundaryCountry_example;  // string | Restrict results to single country. Possible values are [alpha-2 and alpha-3 country codes](https://en.wikipedia.org/wiki/ISO_3166-1). Example: `DEU` or `DE` for Germany.  (optional) 
            var layers = new List<string>(); // List<string> | Restrict search to layers (place type). By default all layers are searched.   layer|description|   - -- -|- -- -|   `venue`|points of interest, businesses, things with walls|   `address`|places with a street address|   `street`|streets,roads,highways|   `neighbourhood`|social communities, neighbourhoods|   `borough`|a local administrative boundary, currently only used for New York City|   `localadmin`|local administrative boundaries|   `locality`|towns, hamlets, cities|   `county`|official governmental area; usually bigger than a locality, almost always smaller than a region|   `macrocounty`|a related group of counties. Mostly in Europe.|   `region`|states and provinces|   `macroregion`|a related group of regions. Mostly in Europe|   `country`|places that issue passports, nations, nation-states|   `coarse`|alias for simultaneously using all administrative layers (everything except `venue` and `address`)|  (optional) 
            var sources = new List<string>(); // List<string> | Restrict your search to specific sources. Searches all sources by default. You can either use the normal or short name. Sources are [`openstreetmap(osm)`](http://www.openstreetmap.org/), [`openaddresses(oa)`](http://openaddresses.io/), [`whosonfirst(wof)`](https://whosonfirst.org/), [`geonames(gn)`](http://www.geonames.org/).  (optional) 
            var size = 789;  // long? | Set the number of returned results.  (optional) 

            try
            {
                // Structured Forward Geocode Service (beta)
                apiInstance.GeocodeSearchStructuredGet(apiKey, address, neighbourhood, country, postalcode, region, county, locality, borough, focusPointLon, focusPointLat, boundaryRectMinLon, boundaryRectMinLat, boundaryRectMaxLon, boundaryRectMaxLat, boundaryCircleLon, boundaryCircleLat, boundaryCircleRadius, boundaryCountry, layers, sources, size);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GeocodeApi.GeocodeSearchStructuredGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **string**| Insert your API Key here.  | [default to your-api-key]
 **address** | **string**| Search for full address with house number or only a street name.  | [optional] 
 **neighbourhood** | **string**| Search for neighbourhoods. Neighbourhoods are vernacular geographic entities that may not necessarily be official administrative divisions but are important nonetheless. Example: &#x60;Notting Hill&#x60;.  | [optional] 
 **country** | **string**| Search for full country name, [alpha 2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [alpha 3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) codes.  | [optional] 
 **postalcode** | **string**| Search for postal codes. Postal codes are unique within a country so they are useful in geocoding as a shorthand for a fairly granular geographical location.  | [optional] 
 **region** | **string**| Search for regions. Regions are normally the first-level administrative divisions within countries. For US-regions [common abbreviations](https://en.wikipedia.org/wiki/List_of_U.S._state_abbreviations) can be used.  | [optional] 
 **county** | **string**| Search for counties. Counties are administrative divisions between localities and regions. Can be useful when attempting to disambiguate between localities.  | [optional] 
 **locality** | **string**| Search for localities. Localities are equivalent to what are commonly referred to as *cities*.  | [optional] 
 **borough** | **string**| Search for boroughs. Boroughs are mostly known in the context of New York City, even though they may exist in other cities, such as Mexico City. Example: &#x60;Manhatten&#x60;.  | [optional] 
 **focusPointLon** | **float?**| Longitude of the &#x60;focus.point&#x60;. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance.  Use with &#x60;focus.point.lat&#x60;.  | [optional] 
 **focusPointLat** | **float?**| Latitude of the &#x60;focus.point&#x60;. Specify the focus point to order results by linear distance to this point. Works for up to 100 kilometers distance. Use with &#x60;focus.point.lon&#x60;.  | [optional] 
 **boundaryRectMinLon** | **float?**| Left border of rectangular boundary to narrow results.  | [optional] 
 **boundaryRectMinLat** | **float?**| Bottom border of rectangular boundary to narrow results.  | [optional] 
 **boundaryRectMaxLon** | **float?**| Right border of rectangular boundary to narrow results.  | [optional] 
 **boundaryRectMaxLat** | **float?**| Top border of rectangular boundary to narrow results.  | [optional] 
 **boundaryCircleLon** | **float?**| Center Longitude of circular boundary to narrow results. Use with &#x60;boundary.circle.lat&#x60; &amp; &#x60;boundary.circle.radius&#x60;.  | [optional] 
 **boundaryCircleLat** | **float?**| Center Latitude of circular boundary to narrow results. Use with &#x60;boundary.circle.lon&#x60; &amp; &#x60;boundary.circle.radius&#x60;.  | [optional] 
 **boundaryCircleRadius** | **float?**| Radius of circular boundary around the center coordinate in kilometers. Use with &#x60;boundary.circle.lon&#x60; &amp; &#x60;boundary.circle.lat&#x60;.  | [optional] 
 **boundaryCountry** | **string**| Restrict results to single country. Possible values are [alpha-2 and alpha-3 country codes](https://en.wikipedia.org/wiki/ISO_3166-1). Example: &#x60;DEU&#x60; or &#x60;DE&#x60; for Germany.  | [optional] 
 **layers** | [**List&lt;string&gt;**](string.md)| Restrict search to layers (place type). By default all layers are searched.   layer|description|   - -- -|- -- -|   &#x60;venue&#x60;|points of interest, businesses, things with walls|   &#x60;address&#x60;|places with a street address|   &#x60;street&#x60;|streets,roads,highways|   &#x60;neighbourhood&#x60;|social communities, neighbourhoods|   &#x60;borough&#x60;|a local administrative boundary, currently only used for New York City|   &#x60;localadmin&#x60;|local administrative boundaries|   &#x60;locality&#x60;|towns, hamlets, cities|   &#x60;county&#x60;|official governmental area; usually bigger than a locality, almost always smaller than a region|   &#x60;macrocounty&#x60;|a related group of counties. Mostly in Europe.|   &#x60;region&#x60;|states and provinces|   &#x60;macroregion&#x60;|a related group of regions. Mostly in Europe|   &#x60;country&#x60;|places that issue passports, nations, nation-states|   &#x60;coarse&#x60;|alias for simultaneously using all administrative layers (everything except &#x60;venue&#x60; and &#x60;address&#x60;)|  | [optional] 
 **sources** | [**List&lt;string&gt;**](string.md)| Restrict your search to specific sources. Searches all sources by default. You can either use the normal or short name. Sources are [&#x60;openstreetmap(osm)&#x60;](http://www.openstreetmap.org/), [&#x60;openaddresses(oa)&#x60;](http://openaddresses.io/), [&#x60;whosonfirst(wof)&#x60;](https://whosonfirst.org/), [&#x60;geonames(gn)&#x60;](http://www.geonames.org/).  | [optional] 
 **size** | **long?**| Set the number of returned results.  | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
