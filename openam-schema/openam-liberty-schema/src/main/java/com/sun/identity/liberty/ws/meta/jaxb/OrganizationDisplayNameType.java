//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.meta.jaxb;


/**
 * Java content class for organizationDisplayNameType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-arch-metadata.xsd line 82)
 * <p>
 * <pre>
 * &lt;complexType name="organizationDisplayNameType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang use="required""/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface OrganizationDisplayNameType {


    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String}
     */
    String getLang();

    /**
     * Sets the value of the lang property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setLang(String value);

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link String}
     */
    String getValue();

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setValue(String value);

}
