package com.csvanefalk.phatgeo.object.geometry;

import com.csvanefalk.phatgeo.object.GeoJSONObject;
import com.csvanefalk.phatgeo.object.GeoJSONType;

public class Point extends GeoJSONObject {

	public Point(String type) {
		super(GeoJSONType.POINT);
	}
}
