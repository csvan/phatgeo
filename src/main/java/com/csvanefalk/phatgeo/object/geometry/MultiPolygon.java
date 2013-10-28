package com.csvanefalk.phatgeo.object.geometry;

import com.csvanefalk.phatgeo.object.GeoJSONObject;
import com.csvanefalk.phatgeo.object.GeoJSONType;

public class MultiPolygon extends GeoJSONObject {

	public MultiPolygon(String type) {
		super(GeoJSONType.MULTI_POLYGON);
	}
}
