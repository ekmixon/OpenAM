//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.idpp.jaxb;


/**
 * A type that may be used for status codes.
 * Java content class for StatusType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/lib-arch-iwsf-utility.xsd line 57)
 * <p>
 * <pre>
 * &lt;complexType name="StatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:id-sis-pp:2003-08}Status" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface StatusType {


    /**
     * Gets the value of the Status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.StatusElement}
     * {@link com.sun.identity.liberty.ws.idpp.jaxb.StatusType}
     *
     */
    java.util.List getStatus();

    /**
     * Gets the value of the ref property.
     *
     * @return
     *     possible object is
     *     {@link String}
     */
    String getRef();

    /**
     * Sets the value of the ref property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setRef(String value);

    /**
     * Gets the value of the comment property.
     *
     * @return
     *     possible object is
     *     {@link String}
     */
    String getComment();

    /**
     * Sets the value of the comment property.
     *
     * @param value
     *     allowed object is
     *     {@link String}
     */
    void setComment(String value);

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.namespace.QName}
     */
    javax.xml.namespace.QName getCode();

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.namespace.QName}
     */
    void setCode(javax.xml.namespace.QName value);

}
