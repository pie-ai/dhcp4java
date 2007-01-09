//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.09 at 09:55:34 PM CET 
//


package org.dhcpcluster.config.xml.data;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for type-option-inets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type-option-inets">
 *   &lt;complexContent>
 *     &lt;extension base="{}option-generic">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{}value-inet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type-option-inets", propOrder = {
    "valueInet"
})
public class TypeOptionInets
    extends OptionGeneric
{

    @XmlElement(name = "value-inet", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected List<InetAddress> valueInet;

    /**
     * Gets the value of the valueInet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueInet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueInet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<InetAddress> getValueInet() {
        if (valueInet == null) {
            valueInet = new ArrayList<InetAddress>();
        }
        return this.valueInet;
    }

}
