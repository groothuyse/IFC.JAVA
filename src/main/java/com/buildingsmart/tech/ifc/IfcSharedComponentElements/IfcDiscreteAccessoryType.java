// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("fdfd0f31-eb16-42ce-a2d2-b2fccafaab2b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDiscreteAccessoryType extends IfcElementComponentType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Subtype of discrete accessory")
	@Required()
	@Guid("33ce9836-a43e-4601-8cf5-efa4054adb49")
	private com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcDiscreteAccessoryTypeEnum predefinedType;


	public IfcDiscreteAccessoryType()
	{
	}

	public IfcDiscreteAccessoryType(String globalId, com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcDiscreteAccessoryTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcDiscreteAccessoryTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedComponentElements.IfcDiscreteAccessoryTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}
