// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDecomposes;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElementSubtraction;

@Guid("5307e7a4-2270-4ad7-9e3c-ba76198cc09e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelVoidsElement extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelDecomposes
{
	@Description("Reference to element in which a void is created by associated feature subtraction element.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcBuildingElement</em> to <em>IfcElement</em> with upward compatibility for file based exchange.</blockquote>")
	@Required()
	@Guid("6088c92a-4578-4341-b20d-3690feb149af")
	@JsonIgnore
	private IfcElement relatingBuildingElement;

	@Description("Reference to the feature subtraction element which defines a void in the associated element.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcOpeningElement</em> to <em>IfcFeatureElementSubtraction</em> with upward compatibility for file based exchange.</blockquote>")
	@Required()
	@Guid("edbe00f6-c081-41e2-a32e-32ab51af7a0a")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatedOpeningElement")
	private IfcFeatureElementSubtraction relatedOpeningElement;


	public IfcRelVoidsElement()
	{
	}

	public IfcRelVoidsElement(String globalId, IfcElement relatingBuildingElement, IfcFeatureElementSubtraction relatedOpeningElement)
	{
		super(globalId);
		this.relatingBuildingElement = relatingBuildingElement;
		this.relatedOpeningElement = relatedOpeningElement;
	}

	public IfcElement getRelatingBuildingElement() {
		return this.relatingBuildingElement;
	}

	public void setRelatingBuildingElement(IfcElement relatingBuildingElement) {
		this.relatingBuildingElement = relatingBuildingElement;
	}

	public IfcFeatureElementSubtraction getRelatedOpeningElement() {
		return this.relatedOpeningElement;
	}

	public void setRelatedOpeningElement(IfcFeatureElementSubtraction relatedOpeningElement) {
		this.relatedOpeningElement = relatedOpeningElement;
	}


}

