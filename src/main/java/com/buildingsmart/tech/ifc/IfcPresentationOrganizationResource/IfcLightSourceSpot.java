// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightSourcePositional;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcColourRgb;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianPoint;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveLengthMeasure;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositivePlaneAngleMeasure;

@Guid("54e0dd6d-b578-4c5b-bc42-41673af4fd84")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLightSourceSpot extends IfcLightSourcePositional
{
	@Description("Definition from ISO/CD 10303-46:1992: This is the direction of the axis of the cone of the light source specified in the coordinate space of the representation being projected..  Definition from VRML97 - ISO/IEC 14772-1:1997: The direction field specifies the direction vector of the light's central axis defined in the local coordinate system.")
	@Required()
	@Guid("d9869222-c492-48b1-97b8-646a9e1e60f9")
	@JacksonXmlProperty(isAttribute=false, localName = "Orientation")
	private IfcDirection orientation;

	@Description("Definition from ISO/CD 10303-46:1992: This real is the exponent on the cosine of the angle between the line that starts at the position of the spot light source and is in the direction of the orientation of the spot light source and a line that starts at the position of the spot light source and goes through a point on the surface being shaded.  NOTE&nbsp; This attribute does not exists in ISO/IEC 14772-1:1997.")
	@Guid("faca732f-be60-468f-82dd-cf078ecb985b")
	@JacksonXmlProperty(isAttribute=true, localName = "ConcentrationExponent")
	private double concentrationExponent;

	@Description("Definition from ISO/CD 10303-46:1992: This planar angle measure is the angle between the line that starts at the position of the spot light source and is in the direction of the spot light source and any line on the boundary of the cone of influence.  Definition from VRML97 - ISO/IEC 14772-1:1997: The cutOffAngle (name of spread angle in VRML) field specifies the outer bound of the solid angle. The light source does not emit light outside of this solid angle.")
	@Required()
	@Guid("3abd8fa5-f5cb-4075-a2f2-2f6396defd8f")
	@JacksonXmlProperty(isAttribute=false, localName = "SpreadAngle")
	private IfcPositivePlaneAngleMeasure spreadAngle;

	@Description("Definition from VRML97 - ISO/IEC 14772-1:1997: The beamWidth field specifies an inner solid angle in which the light source emits light at uniform full intensity. The light source's emission intensity drops off from the inner solid angle (beamWidthAngle) to the outer solid angle (spreadAngle).")
	@Required()
	@Guid("d1bbe032-d2ef-436a-98fa-1380e580ff1c")
	@JacksonXmlProperty(isAttribute=false, localName = "BeamWidthAngle")
	private IfcPositivePlaneAngleMeasure beamWidthAngle;


	public IfcLightSourceSpot()
	{
	}

	public IfcLightSourceSpot(IfcColourRgb lightColour, IfcCartesianPoint position, IfcPositiveLengthMeasure radius, double constantAttenuation, double distanceAttenuation, double quadricAttenuation, IfcDirection orientation, IfcPositivePlaneAngleMeasure spreadAngle, IfcPositivePlaneAngleMeasure beamWidthAngle)
	{
		super(lightColour, position, radius, constantAttenuation, distanceAttenuation, quadricAttenuation);
		this.orientation = orientation;
		this.spreadAngle = spreadAngle;
		this.beamWidthAngle = beamWidthAngle;
	}

	public IfcDirection getOrientation() {
		return this.orientation;
	}

	public void setOrientation(IfcDirection orientation) {
		this.orientation = orientation;
	}

	public double getConcentrationExponent() {
		return this.concentrationExponent;
	}

	public void setConcentrationExponent(double concentrationExponent) {
		this.concentrationExponent = concentrationExponent;
	}

	public IfcPositivePlaneAngleMeasure getSpreadAngle() {
		return this.spreadAngle;
	}

	public void setSpreadAngle(IfcPositivePlaneAngleMeasure spreadAngle) {
		this.spreadAngle = spreadAngle;
	}

	public IfcPositivePlaneAngleMeasure getBeamWidthAngle() {
		return this.beamWidthAngle;
	}

	public void setBeamWidthAngle(IfcPositivePlaneAngleMeasure beamWidthAngle) {
		this.beamWidthAngle = beamWidthAngle;
	}


}

