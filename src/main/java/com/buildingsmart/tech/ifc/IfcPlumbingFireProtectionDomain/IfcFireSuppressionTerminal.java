// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

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
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal;

@Guid("76f08081-e70c-4e67-92ab-25dc0bff38b2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFireSuppressionTerminal extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminal
{
	@Guid("6e81fc3f-ac7f-439a-90a9-1dda68ea6a99")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcFireSuppressionTerminalTypeEnum predefinedType;


	public IfcFireSuppressionTerminal()
	{
	}

	public IfcFireSuppressionTerminal(String globalId)
	{
		super(globalId);
	}

	public IfcFireSuppressionTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFireSuppressionTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

