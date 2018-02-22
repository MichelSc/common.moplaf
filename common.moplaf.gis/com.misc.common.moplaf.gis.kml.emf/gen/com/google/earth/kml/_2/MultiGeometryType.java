//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.21 at 04:45:12 PM CET 
//


package com.google.earth.kml._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiGeometryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiGeometryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earth.google.com/kml/2.1}GeometryType">
 *       &lt;sequence>
 *         &lt;element ref="{http://earth.google.com/kml/2.1}Geometry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiGeometryType", propOrder = {
    "geometry"
})
public class MultiGeometryType
    extends GeometryType
{

    @XmlElementRef(name = "Geometry", namespace = "http://earth.google.com/kml/2.1", type = JAXBElement.class)
    protected List<JAXBElement<? extends GeometryType>> geometry;

    /**
     * Gets the value of the geometry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeometryType }{@code >}
     * {@link JAXBElement }{@code <}{@link PolygonType }{@code >}
     * {@link JAXBElement }{@code <}{@link PointType }{@code >}
     * {@link JAXBElement }{@code <}{@link LineStringType }{@code >}
     * {@link JAXBElement }{@code <}{@link ModelType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends GeometryType>> getGeometry() {
        if (geometry == null) {
            geometry = new ArrayList<JAXBElement<? extends GeometryType>>();
        }
        return this.geometry;
    }

}
