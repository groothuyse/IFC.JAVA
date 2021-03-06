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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcSurfaceStyleRendering;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb;

@Guid("4d15ed6e-2d9b-4101-a12a-055e03cab045")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcSurfaceStyleRendering.class, name = "IfcSurfaceStyleRendering"))
public class IfcSurfaceStyleShading extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcSurfaceStyleElementSelect
{
	@Description("The colour used to render the surface. The surface colour for visualisation is defined by specifying the intensity of red, green and blue.")
	@Required()
	@Guid("a2fe2d3a-9a84-4326-9016-dae00e0d0af9")
	@JacksonXmlProperty(isAttribute=false, localName = "SurfaceColour")
	private IfcColourRgb surfaceColour;

	@Description("The transparency field specifies how \"clear\" an object is, with 1.0 being completely transparent, and 0.0 completely opaque. If not given, the value 0.0 (opaque) is assumed.  <blockquote class=\"note\">NOTE&nbsp; The definition of 1 being transparent and 0 being opaque is the opposite of the definition in alpha channels, where 0.0 is completely transparent and 1.0 is completely opaque. This definition is due to upward compatibility to previous versions of this standard in different to the definition in <i>IfcIndexedColourMap</i>.</blockquote>")
	@Guid("3ced60f5-17d8-4093-a16a-d36cdad0806d")
	@JacksonXmlProperty(isAttribute=false, localName = "Transparency")
	private IfcNormalisedRatioMeasure transparency;


	public IfcSurfaceStyleShading()
	{
	}

	public IfcSurfaceStyleShading(IfcColourRgb surfaceColour)
	{
		this.surfaceColour = surfaceColour;
	}

	public IfcColourRgb getSurfaceColour() {
		return this.surfaceColour;
	}

	public void setSurfaceColour(IfcColourRgb surfaceColour) {
		this.surfaceColour = surfaceColour;
	}

	public IfcNormalisedRatioMeasure getTransparency() {
		return this.transparency;
	}

	public void setTransparency(IfcNormalisedRatioMeasure transparency) {
		this.transparency = transparency;
	}


}

