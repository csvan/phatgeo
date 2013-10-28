package com.csvanefalk.phatgeo.object.geometry;

import com.csvanefalk.phatgeo.object.GeoJSONObject;
import com.csvanefalk.phatgeo.object.GeoJSONType;

public class MultiPoint extends GeoJSONObject {

	public MultiPoint(String type) {
		super(GeoJSONType.MULTIPOINT);
	}
}
