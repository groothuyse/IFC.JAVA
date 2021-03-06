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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcPresentationStyle;

@Guid("fe9ed6e7-c95b-4c4b-9f78-e0941123548b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
	@Description("A curve style font which is used to present a curve. It can either be a predefined curve font, or an explicitly defined curve font. Both may be scaled. If not given, then the curve font should be taken from the layer assignment with style, if that is not given either, then the default curve font applies.")
	@Guid("f67c03bb-edb7-437c-b3da-ab3832ca744f")
	@JacksonXmlProperty(isAttribute=true, localName = "CurveFont")
	private IfcCurveFontOrScaledCurveFontSelect curveFont;

	@Description("A positive length measure in units of the presentation area for the width of a presented curve. If not given, then the style should be taken from the layer assignment with style, if that is not given either, then the default style applies.")
	@Guid("1d39c1ea-e58e-493f-a214-70f70f2d7abe")
	@JacksonXmlProperty(isAttribute=true, localName = "CurveWidth")
	private IfcSizeSelect curveWidth;

	@Description("The colour of the visible part of the curve. If not given, then the colour should be taken from the layer assignment with style, if that is not given either, then the default colour applies.")
	@Guid("3cdb32db-97fc-4f30-bd9b-452208ed4e7f")
	@JacksonXmlProperty(isAttribute=true, localName = "CurveColour")
	private IfcColour curveColour;

	@Description("Indication whether the length measures provided for the presentation style are model based, or draughting based.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.  </blockquote>")
	@Guid("ad4d0857-1f5f-4aaa-a525-b05b55892d37")
	@JacksonXmlProperty(isAttribute=true, localName = "ModelOrDraughting")
	private Boolean modelOrDraughting;


	public IfcCurveStyle()
	{
	}

	public IfcCurveFontOrScaledCurveFontSelect getCurveFont() {
		return this.curveFont;
	}

	public void setCurveFont(IfcCurveFontOrScaledCurveFontSelect curveFont) {
		this.curveFont = curveFont;
	}

	public IfcSizeSelect getCurveWidth() {
		return this.curveWidth;
	}

	public void setCurveWidth(IfcSizeSelect curveWidth) {
		this.curveWidth = curveWidth;
	}

	public IfcColour getCurveColour() {
		return this.curveColour;
	}

	public void setCurveColour(IfcColour curveColour) {
		this.curveColour = curveColour;
	}

	public Boolean getModelOrDraughting() {
		return this.modelOrDraughting;
	}

	public void setModelOrDraughting(Boolean modelOrDraughting) {
		this.modelOrDraughting = modelOrDraughting;
	}


}

