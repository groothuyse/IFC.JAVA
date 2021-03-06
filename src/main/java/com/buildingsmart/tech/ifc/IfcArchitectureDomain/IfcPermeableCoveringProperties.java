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
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcPermeableCoveringOperationEnum;
import com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowPanelPositionEnum;

@Guid("86f03acb-40b6-4eb7-a6ab-18cd8f7ffd58")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPermeableCoveringProperties extends com.buildingsmart.tech.ifc.IfcKernel.IfcPreDefinedPropertySet
{
	@Description("Types of permeable covering operations. Also used to assign standard symbolic presentations according to national building standards.")
	@Required()
	@Guid("d25e0b5d-75ea-46c6-be93-b62ae8176148")
	@JacksonXmlProperty(isAttribute=true, localName = "OperationType")
	private IfcPermeableCoveringOperationEnum operationType;

	@Description("Position of this permeable covering panel within the overall window or door type.")
	@Required()
	@Guid("5a9b407a-77e2-4226-997d-13494bdf88da")
	@JacksonXmlProperty(isAttribute=true, localName = "PanelPosition")
	private IfcWindowPanelPositionEnum panelPosition;

	@Description("Depth of panel frame (used to include the permeable covering), measured from front face to back face horizontally (i.e. perpendicular to the window or door (elevation) plane.")
	@Guid("5c7ce082-5be9-41a8-8db7-aebe3981c7f7")
	@JacksonXmlProperty(isAttribute=false, localName = "FrameDepth")
	private IfcPositiveLengthMeasure frameDepth;

	@Description("Width of panel frame (used to include the permeable covering), measured from inside of panel (at permeable covering) to outside of panel (at lining), i.e. parallel to the window or door (elevation) plane.")
	@Guid("007a1b22-400e-417c-bd21-04defdf8d6a2")
	@JacksonXmlProperty(isAttribute=false, localName = "FrameThickness")
	private IfcPositiveLengthMeasure frameThickness;

	@Description("Optional link to a shape aspect definition, which points to the part of the geometric representation of the window style, which is used to represent the permeable covering.")
	@Guid("3abd4ff6-1434-4858-abfe-4011d23b9dd9")
	@JacksonXmlProperty(isAttribute=false, localName = "ShapeAspectStyle")
	private IfcShapeAspect shapeAspectStyle;


	public IfcPermeableCoveringProperties()
	{
	}

	public IfcPermeableCoveringProperties(String globalId, IfcPermeableCoveringOperationEnum operationType, IfcWindowPanelPositionEnum panelPosition)
	{
		super(globalId);
		this.operationType = operationType;
		this.panelPosition = panelPosition;
	}

	public IfcPermeableCoveringOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(IfcPermeableCoveringOperationEnum operationType) {
		this.operationType = operationType;
	}

	public IfcWindowPanelPositionEnum getPanelPosition() {
		return this.panelPosition;
	}

	public void setPanelPosition(IfcWindowPanelPositionEnum panelPosition) {
		this.panelPosition = panelPosition;
	}

	public IfcPositiveLengthMeasure getFrameDepth() {
		return this.frameDepth;
	}

	public void setFrameDepth(IfcPositiveLengthMeasure frameDepth) {
		this.frameDepth = frameDepth;
	}

	public IfcPositiveLengthMeasure getFrameThickness() {
		return this.frameThickness;
	}

	public void setFrameThickness(IfcPositiveLengthMeasure frameThickness) {
		this.frameThickness = frameThickness;
	}

	public IfcShapeAspect getShapeAspectStyle() {
		return this.shapeAspectStyle;
	}

	public void setShapeAspectStyle(IfcShapeAspect shapeAspectStyle) {
		this.shapeAspectStyle = shapeAspectStyle;
	}


}

