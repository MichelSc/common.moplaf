//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.21 at 04:45:12 PM CET 
//


package com.google.earth.kml._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unitsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fraction"/>
 *     &lt;enumeration value="pixels"/>
 *     &lt;enumeration value="insetPixels"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unitsEnum")
@XmlEnum
public enum UnitsEnum {

    @XmlEnumValue("fraction")
    FRACTION("fraction"),
    @XmlEnumValue("pixels")
    PIXELS("pixels"),
    @XmlEnumValue("insetPixels")
    INSET_PIXELS("insetPixels");
    private final String value;

    UnitsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnitsEnum fromValue(String v) {
        for (UnitsEnum c: UnitsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
