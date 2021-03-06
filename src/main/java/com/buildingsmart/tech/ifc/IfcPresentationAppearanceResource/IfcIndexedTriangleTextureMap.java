// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcIndexedTextureMap;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceTexture;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedFaceSet;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcTextureVertexList;

@Guid("2749b740-94fa-4cfa-ba95-c6f30ee8024d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcIndexedTriangleTextureMap extends IfcIndexedTextureMap
{
	@Description("Index into the <em>IfcTextureVertexList</em> for each vertex of the triangles representing the <em>IfcTriangulatedFaceSet</em>.")
	@Guid("d5e9ea70-6d42-4103-afbe-45a940d87c3d")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPositiveInteger")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "TexCoordIndex")
	private List<IfcPositiveInteger> texCoordIndex;


	public IfcIndexedTriangleTextureMap()
	{
	}

	public IfcIndexedTriangleTextureMap(IfcSurfaceTexture[] maps, IfcTessellatedFaceSet mappedTo, IfcTextureVertexList texCoords)
	{
		super(maps, mappedTo, texCoords);
	}

	public List<IfcPositiveInteger> getTexCoordIndex() {
		return this.texCoordIndex;
	}


}

