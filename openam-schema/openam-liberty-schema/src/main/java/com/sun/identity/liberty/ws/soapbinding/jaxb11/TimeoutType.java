//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.soapbinding.jaxb11;


/**
 * Java content class for TimeoutType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/liberty-idwsf-soap-binding-v1.1.xsd line 103)
 * <p>
 * <pre>
 * &lt;complexType name="TimeoutType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="maxProcessingTime" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute ref="{http://schemas.xmlsoap.org/soap/envelope/}actor"/>
 *       &lt;attribute ref="{http://schemas.xmlsoap.org/soap/envelope/}mustUnderstand"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TimeoutType {


    /**
     * Gets the value of the mustUnderstand property.
     * 
     */
    boolean isMustUnderstand();

    /**
     * Sets the value of the mustUnderstand property.
     * 
     */
    void setMustUnderstand(boolean value);

    /**
     * Gets the value of the actor property.
     * 
     * @return
     *     possible object is
     *     {@link String}
     */
    String getActor();

    /**
     * Sets the value of the actor property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setActor(String value);

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link String}
     */
    String getId();

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setId(String value);

    /**
     * Gets the value of the maxProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger}
     */
    java.math.BigInteger getMaxProcessingTime();

    /**
     * Sets the value of the maxProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger}
     */
    void setMaxProcessingTime(java.math.BigInteger value);

}
