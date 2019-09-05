// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("5ba3d9c4-0d1c-4b36-8793-f7b820c9de94")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTextureVertex extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem
{
	@JacksonXmlProperty(isAttribute=true, localName = "Coordinates")
	@Description("The first Coordinate[1] is the S, the second Coordinate[2] is the T parameter value.")
	@Required()
	@MinLength(2)
	@MaxLength(2)
	@Guid("4d6ab645-16b0-46e8-be95-4e9421d52a42")
	private List<Double> coordinates = new ArrayList<Double>();


	public IfcTextureVertex()
	{
	}

	public IfcTextureVertex(Double[] coordinates)
	{
		this.coordinates = new ArrayList<>(Arrays.asList(coordinates));
	}

	public List<Double> getCoordinates() {
		return this.coordinates;
	}


}
