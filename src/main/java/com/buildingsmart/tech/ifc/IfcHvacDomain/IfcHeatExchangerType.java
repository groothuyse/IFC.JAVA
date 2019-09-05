// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("b7c407fd-4201-4501-a40d-db22371e0cd8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcHeatExchangerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcEnergyConversionDeviceType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Defines the basic types of heat exchanger (e.g., plate, shell and tube, etc.).")
	@Required()
	@Guid("d9f9c23d-4ba6-4171-867c-a1831a73633f")
	private com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHeatExchangerTypeEnum predefinedType;


	public IfcHeatExchangerType()
	{
	}

	public IfcHeatExchangerType(String globalId, com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHeatExchangerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHeatExchangerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcHvacDomain.IfcHeatExchangerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}
