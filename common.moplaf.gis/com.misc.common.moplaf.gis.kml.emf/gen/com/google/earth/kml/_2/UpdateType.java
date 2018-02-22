//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.21 at 04:45:12 PM CET 
//


package com.google.earth.kml._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetHref" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="Create" type="{http://earth.google.com/kml/2.1}CreateType" minOccurs="0"/>
 *           &lt;element name="Delete" type="{http://earth.google.com/kml/2.1}DeleteType" minOccurs="0"/>
 *           &lt;element name="Change" type="{http://earth.google.com/kml/2.1}ChangeType" minOccurs="0"/>
 *           &lt;element name="Replace" type="{http://earth.google.com/kml/2.1}ReplaceType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateType", propOrder = {
    "targetHref",
    "createOrDeleteOrChange"
})
public class UpdateType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String targetHref;
    @XmlElements({
        @XmlElement(name = "Create", type = CreateType.class),
        @XmlElement(name = "Delete", type = DeleteType.class),
        @XmlElement(name = "Change", type = ChangeType.class),
        @XmlElement(name = "Replace", type = ReplaceType.class)
    })
    protected List<Object> createOrDeleteOrChange;

    /**
     * Gets the value of the targetHref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetHref() {
        return targetHref;
    }

    /**
     * Sets the value of the targetHref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetHref(String value) {
        this.targetHref = value;
    }

    /**
     * Gets the value of the createOrDeleteOrChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createOrDeleteOrChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateOrDeleteOrChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateType }
     * {@link DeleteType }
     * {@link ChangeType }
     * {@link ReplaceType }
     * 
     * 
     */
    public List<Object> getCreateOrDeleteOrChange() {
        if (createOrDeleteOrChange == null) {
            createOrDeleteOrChange = new ArrayList<Object>();
        }
        return this.createOrDeleteOrChange;
    }

}
