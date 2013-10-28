package com.csvanefalk.phatgeo.object.feature;

import com.csvanefalk.phatgeo.object.GeoJSONObject;
import com.csvanefalk.phatgeo.object.GeoJSONType;

public class Feature extends GeoJSONObject {

	public Feature(String type) {
		super(GeoJSONType.FEATURE);
	}
}
