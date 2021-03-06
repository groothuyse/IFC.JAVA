// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcArchitectureDomain;

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
import com.buildingsmart.tech.ifc.IfcRepresentationResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet;

@Guid("710a01e4-3b28-429a-8170-ab82c20ec8df")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDoorLiningProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@Description("Depth of the door lining, measured perpendicular to the plane of the door lining. If omitted (and with a given value to lining thickness) it indicates an adjustable depth (i.e. a depth that adjusts to the thickness of the wall into which the occurrence of this door style is inserted).")
	@Guid("40c38c4f-81b1-4400-b64b-981586e14b6c")
	@JacksonXmlProperty(isAttribute=false, localName = "LiningDepth")
	private IfcPositiveLengthMeasure liningDepth;

	@Description("Thickness of the door lining as explained in the figure above. If <em>LiningThickness</em> value is 0. (zero) it denotes a door without a lining (all other lining parameters shall be set to NIL in this case). If the <em>LiningThickness</em> is NIL it denotes that the value is not available.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Data type modified to be <em>IfcNonNegativeLengthMeasure</em>.  </blockquote>")
	@Guid("53c5f2d9-ac1d-45b6-a1ce-12397e8ad5bf")
	@JacksonXmlProperty(isAttribute=false, localName = "LiningThickness")
	private IfcNonNegativeLengthMeasure liningThickness;

	@Description("Depth (dimension in plane perpendicular to door leaf) of the door threshold. Only given if the door lining includes a threshold. If omitted (and with a given value to threshold thickness) it indicates an adjustable depth (i.e. a depth that adjusts to the thickness of the wall into which the occurrence of this door style is inserted).")
	@Guid("db0a7c60-4300-4d24-988d-0983bdfce5ce")
	@JacksonXmlProperty(isAttribute=false, localName = "ThresholdDepth")
	private IfcPositiveLengthMeasure thresholdDepth;

	@Description("Thickness of the door threshold as explained in the figure above. If <em>ThresholdThickness</em> value is 0. (zero) it denotes a door without a threshold (<em>ThresholdDepth</em> shall be set to NIL in this case). If the <em>ThresholdThickness</em> is NIL it denotes that the information about a threshold is not available.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Data type modified to be <em>IfcNonNegativeLengthMeasure</em>.  </blockquote>")
	@Guid("5361bc7f-6510-42a5-aebc-488f63e93876")
	@JacksonXmlProperty(isAttribute=false, localName = "ThresholdThickness")
	private IfcNonNegativeLengthMeasure thresholdThickness;

	@Description("Thickness (width in plane parallel to door leaf) of the transom (if provided - that is, if the <em>TransomOffset</em> attribute is set), which divides the door leaf from a glazing (or window) above.  If the <em>TransomThickness</em> is set to zero (and the <em>TransomOffset</em> set to a positive length), then the door is divided vertically into a leaf and transom window area without a physical frame.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Data type changed to <em>IfcNonNegativeLengthMeasure</em>.</blockquote>")
	@Guid("17b1f23a-20d2-439d-924c-049868c9df8d")
	@JacksonXmlProperty(isAttribute=false, localName = "TransomThickness")
	private IfcNonNegativeLengthMeasure transomThickness;

	@Description("Offset of the transom (if given) which divides the door leaf from a glazing (or window) above. The offset is given from the bottom of the door opening.")
	@Guid("3921b7e9-37c7-459e-b04c-20f4f8daee97")
	@JacksonXmlProperty(isAttribute=true, localName = "TransomOffset")
	private double transomOffset;

	@Description("Offset (dimension in plane perpendicular to door leaf) of the door lining. The offset is given as distance to the x axis of the local placement.")
	@Guid("df3922e6-190a-4aa5-8180-6ac391098b67")
	@JacksonXmlProperty(isAttribute=true, localName = "LiningOffset")
	private double liningOffset;

	@Description("Offset (dimension in plane perpendicular to door leaf) of the door threshold. The offset is given as distance to the x axis of the local placement. Only given if the door lining includes a threshold and the parameter is known.")
	@Guid("a9e439f0-15a1-4053-87bb-d7b1e206080d")
	@JacksonXmlProperty(isAttribute=true, localName = "ThresholdOffset")
	private double thresholdOffset;

	@Description("Thickness of the casing (dimension in plane of the door leaf). If given it is applied equally to all four sides of the adjacent wall.")
	@Guid("f35d56da-5b60-4e7e-92ca-34f4845b3e1e")
	@JacksonXmlProperty(isAttribute=false, localName = "CasingThickness")
	private IfcPositiveLengthMeasure casingThickness;

	@Description("Depth of the casing (dimension in plane perpendicular to door leaf). If given it is applied equally to all four sides of the adjacent wall.")
	@Guid("a77d2518-2e6f-4a33-a7b0-e9c0c1475308")
	@JacksonXmlProperty(isAttribute=false, localName = "CasingDepth")
	private IfcPositiveLengthMeasure casingDepth;

	@Description("Pointer to the shape aspect, if given. The shape aspect reflects the part of the door shape, which represents the door lining.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute is deprecated and shall no longer be used, i.e. the value shall be NIL ($).</blockquote>")
	@Guid("778cc896-d1c6-4a41-88f0-6fec03ecaac7")
	@JacksonXmlProperty(isAttribute=false, localName = "ShapeAspectStyle")
	private IfcShapeAspect shapeAspectStyle;

	@Description("Offset between the lining and the window panel measured along the x-axis of the local placement.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the entity definition.</blockquote>")
	@Guid("4acf9654-3895-4418-a56d-8b283d40a96d")
	@JacksonXmlProperty(isAttribute=true, localName = "LiningToPanelOffsetX")
	private double liningToPanelOffsetX;

	@Description("Offset between the lining and the door panel measured along the y-axis of the local placement.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute added at the end of the entity definition.</blockquote>")
	@Guid("5cb494dc-61b8-47af-a7fe-8e3c90ba2465")
	@JacksonXmlProperty(isAttribute=true, localName = "LiningToPanelOffsetY")
	private double liningToPanelOffsetY;


	public IfcDoorLiningProperties()
	{
	}

	public IfcDoorLiningProperties(String globalId)
	{
		super(globalId);
	}

	public IfcPositiveLengthMeasure getLiningDepth() {
		return this.liningDepth;
	}

	public void setLiningDepth(IfcPositiveLengthMeasure liningDepth) {
		this.liningDepth = liningDepth;
	}

	public IfcNonNegativeLengthMeasure getLiningThickness() {
		return this.liningThickness;
	}

	public void setLiningThickness(IfcNonNegativeLengthMeasure liningThickness) {
		this.liningThickness = liningThickness;
	}

	public IfcPositiveLengthMeasure getThresholdDepth() {
		return this.thresholdDepth;
	}

	public void setThresholdDepth(IfcPositiveLengthMeasure thresholdDepth) {
		this.thresholdDepth = thresholdDepth;
	}

	public IfcNonNegativeLengthMeasure getThresholdThickness() {
		return this.thresholdThickness;
	}

	public void setThresholdThickness(IfcNonNegativeLengthMeasure thresholdThickness) {
		this.thresholdThickness = thresholdThickness;
	}

	public IfcNonNegativeLengthMeasure getTransomThickness() {
		return this.transomThickness;
	}

	public void setTransomThickness(IfcNonNegativeLengthMeasure transomThickness) {
		this.transomThickness = transomThickness;
	}

	public double getTransomOffset() {
		return this.transomOffset;
	}

	public void setTransomOffset(double transomOffset) {
		this.transomOffset = transomOffset;
	}

	public double getLiningOffset() {
		return this.liningOffset;
	}

	public void setLiningOffset(double liningOffset) {
		this.liningOffset = liningOffset;
	}

	public double getThresholdOffset() {
		return this.thresholdOffset;
	}

	public void setThresholdOffset(double thresholdOffset) {
		this.thresholdOffset = thresholdOffset;
	}

	public IfcPositiveLengthMeasure getCasingThickness() {
		return this.casingThickness;
	}

	public void setCasingThickness(IfcPositiveLengthMeasure casingThickness) {
		this.casingThickness = casingThickness;
	}

	public IfcPositiveLengthMeasure getCasingDepth() {
		return this.casingDepth;
	}

	public void setCasingDepth(IfcPositiveLengthMeasure casingDepth) {
		this.casingDepth = casingDepth;
	}

	public IfcShapeAspect getShapeAspectStyle() {
		return this.shapeAspectStyle;
	}

	public void setShapeAspectStyle(IfcShapeAspect shapeAspectStyle) {
		this.shapeAspectStyle = shapeAspectStyle;
	}

	public double getLiningToPanelOffsetX() {
		return this.liningToPanelOffsetX;
	}

	public void setLiningToPanelOffsetX(double liningToPanelOffsetX) {
		this.liningToPanelOffsetX = liningToPanelOffsetX;
	}

	public double getLiningToPanelOffsetY() {
		return this.liningToPanelOffsetY;
	}

	public void setLiningToPanelOffsetY(double liningToPanelOffsetY) {
		this.liningToPanelOffsetY = liningToPanelOffsetY;
	}


}

