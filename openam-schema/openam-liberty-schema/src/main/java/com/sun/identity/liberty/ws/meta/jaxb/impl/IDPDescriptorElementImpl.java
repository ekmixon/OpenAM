//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.meta.jaxb.impl;

public class IDPDescriptorElementImpl
    extends com.sun.identity.liberty.ws.meta.jaxb.impl.IDPDescriptorTypeImpl
    implements com.sun.identity.liberty.ws.meta.jaxb.IDPDescriptorElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static Class version = (com.sun.identity.liberty.ws.meta.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.meta.jaxb.IDPDescriptorElement.class);
    }

    public String ____jaxb_ri____getNamespaceURI() {
        return "urn:liberty:metadata:2003-08";
    }

    public String ____jaxb_ri____getLocalName() {
        return "IDPDescriptor";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.meta.jaxb.impl.IDPDescriptorElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:liberty:metadata:2003-08", "IDPDescriptor");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.meta.jaxb.IDPDescriptorElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dc"
+"om.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun.m"
+"sv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.Un"
+"aryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5"
+"\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\"q\u0000~\u0000(psq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~"
+"\u0000(psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000"
+"\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000(psr\u00002com.sun.msv.grammar.Expres"
+"sion$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\'\u0001q\u0000~\u00000sr\u0000 com"
+".sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.gram"
+"mar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression"
+"$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u00001q\u0000~\u00006sr\u0000#com.sun.msv"
+".grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang"
+"/String;L\u0000\fnamespaceURIq\u0000~\u00008xq\u0000~\u00003t\u0000:com.sun.identity.libert"
+"y.ws.meta.jaxb.KeyDescriptorElementt\u0000+http://java.sun.com/ja"
+"xb/xjc/dummy-elementssq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\"pps"
+"q\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u00000q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00007t\u00007com.sun.ident"
+"ity.liberty.ws.meta.jaxb.KeyDescriptorTypeq\u0000~\u0000;sq\u0000~\u0000\"ppsq\u0000~\u0000"
+"-q\u0000~\u0000(psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLor"
+"g/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun"
+"/msv/util/StringPair;xq\u0000~\u0000\u0004q\u0000~\u0000(psr\u0000\"com.sun.msv.datatype.xs"
+"d.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAt"
+"omicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u00008L\u0000\btypeNameq\u0000~\u00008L\u0000\nwhiteSpacet\u0000.Lco"
+"m/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w"
+"3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.Whi"
+"teSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype"
+".xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar"
+".Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000(psr\u0000\u001bcom."
+"sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u00008L\u0000\fnamesp"
+"aceURIq\u0000~\u00008xpq\u0000~\u0000Qq\u0000~\u0000Psq\u0000~\u00007t\u0000\u0004typet\u0000)http://www.w3.org/200"
+"1/XMLSchema-instanceq\u0000~\u00006sq\u0000~\u00007t\u0000\rKeyDescriptort\u0000\u001curn:libert"
+"y:metadata:2003-08q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000Fq\u0000"
+"~\u0000(psr\u0000#com.sun.msv.datatype.xsd.AnyURIType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000K"
+"q\u0000~\u0000Pt\u0000\u0006anyURIq\u0000~\u0000Tq\u0000~\u0000Vsq\u0000~\u0000Wq\u0000~\u0000eq\u0000~\u0000Psq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(p"
+"q\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\fSoapEndpointq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000\u0000"
+"q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u0000"
+"7t\u0000\u0016SingleLogoutServiceURLq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000"
+"~\u0000\u0007ppq\u0000~\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\u001cSingle"
+"LogoutServiceReturnURLq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007p"
+"pq\u0000~\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\u001fFederation"
+"TerminationServiceURLq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007pp"
+"q\u0000~\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000%FederationT"
+"erminationServiceReturnURLq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~"
+"\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000"
+"~\u00007t\u00000FederationTerminationNotificationProtocolProfileq\u0000~\u0000^q"
+"\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000bsq\u0000~\u0000\"ppsq"
+"\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\u001bSingleLogoutProtocolProfil"
+"eq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000bsq\u0000"
+"~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000%RegisterNameIdentif"
+"ierProtocolProfileq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppq\u0000~"
+"\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000 RegisterNameId"
+"entifierServiceURLq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppq\u0000~"
+"\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000&RegisterNameId"
+"entifierServiceReturnURLq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000\u0000"
+"q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000"
+"0q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00007t\u0000Fcom.sun.identity.liberty.ws.common.jaxb."
+"assertion.AuthorityBindingTypeq\u0000~\u0000;sq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000I"
+"q\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000$NameIdentifierMappingProtocolProfileq\u0000~\u0000^"
+"q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000bsq\u0000~\u0000\"pps"
+"q\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000&NameIdentifierMappingEncr"
+"yptionProfileq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp"
+"\u0000sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u00000q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00007t\u00006com"
+".sun.identity.liberty.ws.meta.jaxb.OrganizationTypeq\u0000~\u0000;sq\u0000~"
+"\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\fOrganizationq\u0000~\u0000^q\u0000~"
+"\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\"pp"
+"sq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u00000q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00007t\u00001com.sun.iden"
+"tity.liberty.ws.meta.jaxb.ContactTypeq\u0000~\u0000;sq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000"
+"(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\rContactPersonq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000"
+"~\u0000$q\u0000~\u0000(psq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(ps"
+"q\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u00000q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00007t\u0000Dcom.sun.identity.liberty."
+"ws.meta.jaxb.AdditionalMetadataLocationTypeq\u0000~\u0000;sq\u0000~\u0000\"ppsq\u0000~"
+"\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\u0016AdditionalMetaLocationq\u0000~\u0000^q"
+"\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000\"q\u0000~\u0000(psq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000"
+"~\u0000-q\u0000~\u0000(pq\u0000~\u00000q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00007t\u00006com.sun.identity.liberty.ws"
+".meta.jaxb.ExtensionElementq\u0000~\u0000;sq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000p"
+"p\u0000sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u00000q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00007t\u00003co"
+"m.sun.identity.liberty.ws.meta.jaxb.ExtensionTypeq\u0000~\u0000;sq\u0000~\u0000\""
+"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\tExtensionq\u0000~\u0000^q\u0000~\u00006sq\u0000"
+"~\u0000\"ppsq\u0000~\u0000\"q\u0000~\u0000(psq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000-q\u0000~\u0000"
+"(pq\u0000~\u00000q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00007t\u0000?com.sun.identity.liberty.ws.common"
+".jaxb.xmlsig.SignatureElementq\u0000~\u0000;sq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000"
+"\u0000pp\u0000sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000(psq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u00000q\u0000~\u00004q\u0000~\u00006sq\u0000~\u00007t\u0000<"
+"com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType"
+"q\u0000~\u0000;sq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\tSignaturet\u0000"
+"\"http://www.w3.org/2000/09/xmldsig#q\u0000~\u00006sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppq\u0000~"
+"\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\u0016SingleSignOnSe"
+"rviceURLq\u0000~\u0000^sq\u0000~\u0000$ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~"
+"\u0000(pq\u0000~\u0000Iq\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\u001bSingleSignOnProtocolProfileq\u0000~\u0000^s"
+"q\u0000~\u0000\"ppsq\u0000~\u0000\u0000q\u0000~\u0000(p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000bsq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq\u0000"
+"~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\u000fAuthnServiceURLq\u0000~\u0000^q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000"
+"(psq\u0000~\u0000Fppsr\u0000%com.sun.msv.datatype.xsd.DurationType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000Kq\u0000~\u0000Pt\u0000\bdurationq\u0000~\u0000Tq\u0000~\u0000Vsq\u0000~\u0000Wq\u0000~\u0001.q\u0000~\u0000Psq\u0000~\u00007t\u0000\rc"
+"acheDurationt\u0000\u0000q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(psq\u0000~\u0000Fppsr\u0000\u001fcom.sun."
+"msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.x"
+"sd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.datatype.xsd.TokenTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000Kq\u0000~\u0000Pt\u0000\u0002IDq\u0000~\u0000T\u0000q\u0000~\u0000Vsq\u0000~\u0000Wq\u0000~\u0001;q\u0000~"
+"\u0000Psq\u0000~\u00007t\u0000\u0002idq\u0000~\u00012q\u0000~\u00006sq\u0000~\u0000-ppsq\u0000~\u0000Fppsr\u0000*com.sun.msv.datat"
+"ype.xsd.DatatypeFactory$1\u00a1\u00f3\u000b\u00e3`rj\u000e\u0002\u0000\u0000xr\u0000\u001ecom.sun.msv.datatype"
+".xsd.Proxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bbaseTypet\u0000)Lcom/sun/msv/datatype/xsd"
+"/XSDatatypeImpl;xq\u0000~\u0000Mq\u0000~\u0000Pt\u0000\bNMTOKENSq\u0000~\u0000Tsr\u0000\'com.sun.msv.d"
+"atatype.xsd.MinLengthFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\tminLengthxr\u00009com.sun"
+".msv.datatype.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000"
+"\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000"
+"\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypeq\u0000~\u0001CL\u0000\fconcret"
+"eTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq"
+"\u0000~\u00008xq\u0000~\u0000Mppq\u0000~\u0000T\u0000\u0000sr\u0000!com.sun.msv.datatype.xsd.ListType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bitemTypeq\u0000~\u0001Cxq\u0000~\u0000Lppq\u0000~\u0000Tsr\u0000$com.sun.msv.datatype"
+".xsd.NmtokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00018q\u0000~\u0000Pt\u0000\u0007NMTOKENq\u0000~\u0000T\u0000q\u0000~\u0001Lt"
+"\u0000\tminLength\u0000\u0000\u0000\u0001q\u0000~\u0000Vpsq\u0000~\u00007t\u0000\u001aprotocolSupportEnumerationq\u0000~\u0001"
+"2sq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(psq\u0000~\u0000Fppsr\u0000%com.sun.msv.datatype.xsd.Da"
+"teTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateTimeBa"
+"seType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000Kq\u0000~\u0000Pt\u0000\bdateTimeq\u0000~\u0000Tq\u0000~\u0000Vsq\u0000~\u0000Wq\u0000~\u0001Y"
+"q\u0000~\u0000Psq\u0000~\u00007t\u0000\nvalidUntilq\u0000~\u00012q\u0000~\u00006sq\u0000~\u0000\"ppsq\u0000~\u0000-q\u0000~\u0000(pq\u0000~\u0000Iq"
+"\u0000~\u0000Yq\u0000~\u00006sq\u0000~\u00007t\u0000\rIDPDescriptorq\u0000~\u0000^sr\u0000\"com.sun.msv.grammar."
+"ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/"
+"ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expressi"
+"onPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006paren"
+"tt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000z\u0001pq\u0000~\u00013q\u0000~\u0000\u001dq\u0000"
+"~\u0000\fq\u0000~\u0000&q\u0000~\u0001\u001bq\u0000~\u0000\u00bcq\u0000~\u0000\u0088q\u0000~\u0000\u0090q\u0000~\u0000\u0098q\u0000~\u0001\tq\u0000~\u0000\u00f5q\u0000~\u0000\u00e1q\u0000~\u0000\u00d3q\u0000~\u0000\u00c5q\u0000"
+"~\u0000=q\u0000~\u0000\u00b0q\u0000~\u0000\u0012q\u0000~\u0001\u0000q\u0000~\u0000\u00ecq\u0000~\u0000!q\u0000~\u0000\u0013q\u0000~\u0000\u0014q\u0000~\u0000\u0011q\u0000~\u0000\u0016q\u0000~\u0000\u0018q\u0000~\u0000\u000eq\u0000"
+"~\u0000#q\u0000~\u0001Sq\u0000~\u0000\nq\u0000~\u0001\u0001q\u0000~\u0000\u00edq\u0000~\u0000)q\u0000~\u0001)q\u0000~\u0000\u00deq\u0000~\u0000\u00d0q\u0000~\u0000\u00adq\u0000~\u0000\u0019q\u0000~\u0001\u000bq\u0000"
+"~\u0001\u0003q\u0000~\u0000\u00f7q\u0000~\u0000\u00efq\u0000~\u0000\u00e3q\u0000~\u0000\u00d5q\u0000~\u0000\u00c7q\u0000~\u0000+q\u0000~\u0000?q\u0000~\u0000\u00b2q\u0000~\u0000\u00c3q\u0000~\u0000\u000fq\u0000~\u0000\u001bq\u0000"
+"~\u0000\tq\u0000~\u0000\u0010q\u0000~\u0000\u001aq\u0000~\u0000\u000bq\u0000~\u0001\fq\u0000~\u0001\u0004q\u0000~\u0000\u00f8q\u0000~\u0000\u00f0q\u0000~\u0000\u00e4q\u0000~\u0000\u00d6q\u0000~\u0000\u00c8q\u0000~\u0000,q\u0000"
+"~\u0000@q\u0000~\u0000\u00b3q\u0000~\u0001$q\u0000~\u0001\u001dq\u0000~\u0001\u0016q\u0000~\u0000\u00beq\u0000~\u0000aq\u0000~\u0000mq\u0000~\u0000tq\u0000~\u0000{q\u0000~\u0000\u0082q\u0000~\u0000\u008aq\u0000"
+"~\u0000\u0092q\u0000~\u0000\u009aq\u0000~\u0000\u00a1q\u0000~\u0000\u00a8q\u0000~\u0001%q\u0000~\u0001\u001eq\u0000~\u0001\u0017q\u0000~\u0001\u0010q\u0000~\u0000\u00fcq\u0000~\u0000\u00e8q\u0000~\u0000\u00daq\u0000~\u0000\u00ccq\u0000"
+"~\u0000\u00bfq\u0000~\u0000Dq\u0000~\u0000gq\u0000~\u0000nq\u0000~\u0000uq\u0000~\u0000|q\u0000~\u0000\u0083q\u0000~\u0000\u008bq\u0000~\u0000\u001cq\u0000~\u0000\u0093q\u0000~\u0000\u009bq\u0000~\u0000\u00a2q\u0000"
+"~\u0000\u00a9q\u0000~\u0000\u00b7q\u0000~\u0000\u001eq\u0000~\u0001]q\u0000~\u0000 q\u0000~\u0000\u00bbq\u0000~\u0000\u0087q\u0000~\u0000\u008fq\u0000~\u0000\u0097q\u0000~\u0000\u001fq\u0000~\u0000\u0015q\u0000~\u0000\rq\u0000"
+"~\u0001\"q\u0000~\u0000_q\u0000~\u0000kq\u0000~\u0000rq\u0000~\u0000yq\u0000~\u0000\u00dfq\u0000~\u0000\u00d1q\u0000~\u0000\u00aeq\u0000~\u0000\u0017q\u0000~\u0000\u0080q\u0000~\u0000\u009fq\u0000~\u0000\u00a6x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public Object owner() {
            return com.sun.identity.liberty.ws.meta.jaxb.impl.IDPDescriptorElementImpl.this;
        }

        public void enterElement(String ___uri, String ___local, String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("IDPDescriptor" == ___local)&&("urn:liberty:metadata:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(String ___uri, String ___local, String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("IDPDescriptor" == ___local)&&("urn:liberty:metadata:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(String ___uri, String ___local, String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("cacheDuration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.meta.jaxb.impl.IDPDescriptorTypeImpl)com.sun.identity.liberty.ws.meta.jaxb.impl.IDPDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("id" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.meta.jaxb.impl.IDPDescriptorTypeImpl)com.sun.identity.liberty.ws.meta.jaxb.impl.IDPDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("protocolSupportEnumeration" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.meta.jaxb.impl.IDPDescriptorTypeImpl)com.sun.identity.liberty.ws.meta.jaxb.impl.IDPDescriptorElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(String ___uri, String ___local, String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "cacheDuration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "protocolSupportEnumeration");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "cacheDuration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "protocolSupportEnumeration");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
