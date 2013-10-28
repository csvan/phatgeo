package com.csvanefalk.phatgeo.object;

import java.util.HashSet;
import java.util.Set;

/**
 * Encapsulates the types of legitimate GeoJSON objects.
 * <p>
 * See http://geojson.org/geojson-spec.html#geojson-objects
 * 
 * @author christopher
 * 
 */
public class GeoJSONType {
	public static String POINT = "Point";
	public static String MULTIPOINT = "MultiPoint";
	public static String LINESTRING = "LineString";
	public static String MULTI_LINESTRING = "MultiLineString";
	public static String POLYGON = "Polygon";
	public static String MULTI_POLYGON = "MultiPolygon";
	public static String GEOMETRY_COLLECTION = "GeometryCollection";
	public static String FEATURE = "Feature";
	public static String FEATURE_COLLECTION = "FeatureCollection";

	private static Set<String> geoJSONTypeSet = new HashSet<String>();
	static {
		geoJSONTypeSet.add(POINT);
		geoJSONTypeSet.add(MULTIPOINT);
		geoJSONTypeSet.add(LINESTRING);
		geoJSONTypeSet.add(MULTI_LINESTRING);
		geoJSONTypeSet.add(POLYGON);
		geoJSONTypeSet.add(MULTI_POLYGON);
		geoJSONTypeSet.add(GEOMETRY_COLLECTION);
		geoJSONTypeSet.add(FEATURE);
		geoJSONTypeSet.add(FEATURE_COLLECTION);
	}

	public static boolean isGeoJSONType(String type) {
		return geoJSONTypeSet.contains(type);
	}
}