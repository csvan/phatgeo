package com.csvanefalk.phatgeo.object.geometry;

import com.csvanefalk.phatgeo.object.GeoJSONObject;
import com.csvanefalk.phatgeo.object.GeoJSONType;

public class Polygon extends GeoJSONObject {

	public Polygon(String type) {
		super(GeoJSONType.POLYGON);
	}
}
