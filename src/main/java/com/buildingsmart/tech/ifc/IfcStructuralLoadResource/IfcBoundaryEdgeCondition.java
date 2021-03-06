// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.*;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryCondition;

@Guid("85e8748b-e47c-4c11-8221-841a47ee4045")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoundaryEdgeCondition extends IfcBoundaryCondition
{
	@Description("Translational stiffness value in x-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("c537cef2-d867-4d4a-b645-6fb7f9be5d3c")
	@JacksonXmlProperty(isAttribute=true, localName = "TranslationalStiffnessByLengthX")
	private IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthX;

	@Description("Translational stiffness value in y-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("8bb1166f-0cae-45c5-8ed1-aa0f0fe7d151")
	@JacksonXmlProperty(isAttribute=true, localName = "TranslationalStiffnessByLengthY")
	private IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthY;

	@Description("Translational stiffness value in z-direction of the coordinate system defined by the instance which uses this resource object.")
	@Guid("d890266c-3ca9-4602-814e-5a492138df03")
	@JacksonXmlProperty(isAttribute=true, localName = "TranslationalStiffnessByLengthZ")
	private IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthZ;

	@Description("Rotational stiffness value about the x-axis of the coordinate system defined by the instance which uses this resource object.")
	@Guid("652aaf78-6037-48c5-8be4-07a7c7a00c33")
	@JacksonXmlProperty(isAttribute=true, localName = "RotationalStiffnessByLengthX")
	private IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthX;

	@Description("Rotational stiffness value about the y-axis of the coordinate system defined by the instance which uses this resource object.")
	@Guid("2dd4f7da-1b7c-4e6b-8c65-0c3d9449a8eb")
	@JacksonXmlProperty(isAttribute=true, localName = "RotationalStiffnessByLengthY")
	private IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthY;

	@Description("Rotational stiffness value about the z-axis of the coordinate system defined by the instance which uses this resource object.")
	@Guid("3a97b6fa-656f-43d4-a0bb-9bb39568c488")
	@JacksonXmlProperty(isAttribute=true, localName = "RotationalStiffnessByLengthZ")
	private IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthZ;


	public IfcBoundaryEdgeCondition()
	{
	}

	public IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthX() {
		return this.translationalStiffnessByLengthX;
	}

	public void setTranslationalStiffnessByLengthX(IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthX) {
		this.translationalStiffnessByLengthX = translationalStiffnessByLengthX;
	}

	public IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthY() {
		return this.translationalStiffnessByLengthY;
	}

	public void setTranslationalStiffnessByLengthY(IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthY) {
		this.translationalStiffnessByLengthY = translationalStiffnessByLengthY;
	}

	public IfcModulusOfTranslationalSubgradeReactionSelect getTranslationalStiffnessByLengthZ() {
		return this.translationalStiffnessByLengthZ;
	}

	public void setTranslationalStiffnessByLengthZ(IfcModulusOfTranslationalSubgradeReactionSelect translationalStiffnessByLengthZ) {
		this.translationalStiffnessByLengthZ = translationalStiffnessByLengthZ;
	}

	public IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthX() {
		return this.rotationalStiffnessByLengthX;
	}

	public void setRotationalStiffnessByLengthX(IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthX) {
		this.rotationalStiffnessByLengthX = rotationalStiffnessByLengthX;
	}

	public IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthY() {
		return this.rotationalStiffnessByLengthY;
	}

	public void setRotationalStiffnessByLengthY(IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthY) {
		this.rotationalStiffnessByLengthY = rotationalStiffnessByLengthY;
	}

	public IfcModulusOfRotationalSubgradeReactionSelect getRotationalStiffnessByLengthZ() {
		return this.rotationalStiffnessByLengthZ;
	}

	public void setRotationalStiffnessByLengthZ(IfcModulusOfRotationalSubgradeReactionSelect rotationalStiffnessByLengthZ) {
		this.rotationalStiffnessByLengthZ = rotationalStiffnessByLengthZ;
	}


}

