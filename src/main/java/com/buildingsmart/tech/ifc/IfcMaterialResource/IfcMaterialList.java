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
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterial;

@Guid("e2c88e35-f4a8-464a-8816-1b1ae58202f5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialList implements IfcMaterialSelect
{
	@Description("Materials used in a composition of substances.")
	@Required()
	@Guid("f7c9c7a0-f7e3-4163-b9a3-36a6ead9e8a2")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcMaterial")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Materials")
	private List<IfcMaterial> materials;


	public IfcMaterialList()
	{
	}

	public IfcMaterialList(IfcMaterial[] materials)
	{
		this.materials = new ArrayList<>(Arrays.asList(materials));
	}

	public List<IfcMaterial> getMaterials() {
		return this.materials;
	}


}

