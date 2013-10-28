package com.csvanefalk.phatgeo.object;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 * Represents a fundamental GeoJSON object.
 * 
 * http://geojson.org/geojson-spec.html
 * 
 * @author christopher
 * 
 */
public abstract class GeoJSONObject {

	/*
	 * Local string constants.
	 */
	protected static final String FEATURES_KEY = "features";
	protected static final String TYPE_KEY = "type";
	protected static final String GEOMETRY_KEY = "geometry";
	protected static final String PROPERTIES_KEY = "properties";
	protected static final String COORDINATES_KEY = "coordinates";
	protected static final String CRS_KEY = "crs";

	/*
	 * Underlying JSON object which we simply wrap in order to represent the
	 * GEOJson object.
	 */
	private final JSONObject wrapped;

	private final String type;

	public GeoJSONObject(String type) {

		wrapped = new JSONObject();
		this.type = type;

		try {
			wrapped.accumulate(TYPE_KEY, type);
		} catch (JSONException e) {
			// These assignments are safe and will never throw.
		}
	}

	/**
	 * @return the {@link GeoJSONType} of the object.
	 */
	public String getType() {
		return type;
	}

}
