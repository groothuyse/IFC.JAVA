// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

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
import com.buildingsmart.tech.ifc.IfcProfileResource.*;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileTypeEnum;

@Guid("f27d7589-d76f-4bdd-9102-d6fee84cd2a1")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCompositeProfileDef extends IfcProfileDef
{
	@Description("The profiles which are used to define the composite profile.")
	@Required()
	@Guid("b0a0408a-c633-4045-ac25-f4c080cd3c6b")
	@MinLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcProfileDef")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Profiles")
	private Set<IfcProfileDef> profiles;

	@Description("The name by which the composition may be referred to. The actual meaning of the name has to be defined in the context of applications.")
	@Guid("0f23f815-2fda-49a3-a4d6-a788b8a249ba")
	@JacksonXmlProperty(isAttribute=true, localName = "Label")
	private String label;


	public IfcCompositeProfileDef()
	{
	}

	public IfcCompositeProfileDef(IfcProfileTypeEnum profileType, IfcProfileDef[] profiles)
	{
		super(profileType);
		this.profiles = new HashSet<>(Arrays.asList(profiles));
	}

	public Set<IfcProfileDef> getProfiles() {
		return this.profiles;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


}

