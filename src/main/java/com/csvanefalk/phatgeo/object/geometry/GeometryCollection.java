package com.csvanefalk.phatgeo.object.geometry;

import com.csvanefalk.phatgeo.object.GeoJSONObject;
import com.csvanefalk.phatgeo.object.GeoJSONType;

public class GeometryCollection extends GeoJSONObject {

	public GeometryCollection() {
		super(GeoJSONType.GEOMETRY_COLLECTION);
	}
}
