//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.09 at 10:36:36 PM CET 
//


package org.dhcpcluster.config.xml.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for stype-filter-string.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stype-filter-string">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *     &lt;enumeration value="exact"/>
 *     &lt;enumeration value="case-insensitive"/>
 *     &lt;enumeration value="regex"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum StypeFilterString {

    @XmlEnumValue("exact")
    EXACT("exact"),
    @XmlEnumValue("case-insensitive")
    CASE_INSENSITIVE("case-insensitive"),
    @XmlEnumValue("regex")
    REGEX("regex");
    private final String value;

    StypeFilterString(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StypeFilterString fromValue(String v) {
        for (StypeFilterString c: StypeFilterString.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
