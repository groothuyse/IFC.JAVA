// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

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
import com.buildingsmart.tech.ifc.IfcMaterialResource.*;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSetUsage;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialProfileSet;

@Guid("bbddf2c3-cd7d-4357-94ae-dc7c126b2265")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialProfileSetUsageTapering extends IfcMaterialProfileSetUsage
{
	@Description("The second <em>IfcMaterialProfileSet</em> set to which the usage is applied.")
	@Required()
	@Guid("479176ca-3f02-4f72-abfb-0aea05c25f1f")
	@JacksonXmlProperty(isAttribute=false, localName = "ForProfileEndSet")
	private IfcMaterialProfileSet forProfileEndSet;

	@Description("Index reference to a significant point in the second section profile. Describes how this section is aligned relative to the axis of the member it is associated with. This parametric specification of profile alignment can be provided redundantly to the explicit alignment defined by ForProfileSet.MaterialProfiles[*].Profile.")
	@Guid("c2cdcace-fd71-47d0-9de8-7f392c75629a")
	@JacksonXmlProperty(isAttribute=true, localName = "CardinalEndPoint")
	private int cardinalEndPoint;


	public IfcMaterialProfileSetUsageTapering()
	{
	}

	public IfcMaterialProfileSetUsageTapering(IfcMaterialProfileSet forProfileSet, IfcMaterialProfileSet forProfileEndSet)
	{
		super(forProfileSet);
		this.forProfileEndSet = forProfileEndSet;
	}

	public IfcMaterialProfileSet getForProfileEndSet() {
		return this.forProfileEndSet;
	}

	public void setForProfileEndSet(IfcMaterialProfileSet forProfileEndSet) {
		this.forProfileEndSet = forProfileEndSet;
	}

	public int getCardinalEndPoint() {
		return this.cardinalEndPoint;
	}

	public void setCardinalEndPoint(int cardinalEndPoint) {
		this.cardinalEndPoint = cardinalEndPoint;
	}


}

