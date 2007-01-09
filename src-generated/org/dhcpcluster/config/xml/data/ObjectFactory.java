//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.09 at 09:55:34 PM CET 
//


package org.dhcpcluster.config.xml.data;

import java.net.InetAddress;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dhcpcluster.config.xml.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OptionsTypeOptionBootSize_QNAME = new QName("", "option-boot-size");
    private final static QName _OptionsTypeOptionDomainName_QNAME = new QName("", "option-domain-name");
    private final static QName _OptionsTypeOptionTimeServers_QNAME = new QName("", "option-time-servers");
    private final static QName _OptionsTypeOptionHostName_QNAME = new QName("", "option-host-name");
    private final static QName _OptionsTypeOptionSubnetMask_QNAME = new QName("", "option-subnet-mask");
    private final static QName _OptionsTypeOptionDhcpMessage_QNAME = new QName("", "option-dhcp-message");
    private final static QName _OptionsTypeOptionTimeOffset_QNAME = new QName("", "option-time-offset");
    private final static QName _OptionsTypeOptionIpForwarding_QNAME = new QName("", "option-ip-forwarding");
    private final static QName _OptionsTypeOptionDhcpParameterRequestList_QNAME = new QName("", "option-dhcp-parameter-request-list");
    private final static QName _OptionsTypeOptionPathMtuPlateauTable_QNAME = new QName("", "option-path-mtu-plateau-table");
    private final static QName _OptionsTypeOptionRouters_QNAME = new QName("", "option-routers");
    private final static QName _Giaddr_QNAME = new QName("", "giaddr");
    private final static QName _ValueRaw64_QNAME = new QName("", "value-raw64");
    private final static QName _ValueRawhex_QNAME = new QName("", "value-rawhex");
    private final static QName _ValueInt_QNAME = new QName("", "value-int");
    private final static QName _ValueByte_QNAME = new QName("", "value-byte");
    private final static QName _Mirror_QNAME = new QName("", "mirror");
    private final static QName _ValueInet_QNAME = new QName("", "value-inet");
    private final static QName _ValueString_QNAME = new QName("", "value-string");
    private final static QName _ValueShort_QNAME = new QName("", "value-short");
    private final static QName _ValueStringElement_QNAME = new QName("", "value-string-element");
    private final static QName _Options_QNAME = new QName("", "options");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dhcpcluster.config.xml.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DhcpServer }
     * 
     */
    public DhcpServer createDhcpServer() {
        return new DhcpServer();
    }

    /**
     * Create an instance of {@link Giaddrs }
     * 
     */
    public Giaddrs createGiaddrs() {
        return new Giaddrs();
    }

    /**
     * Create an instance of {@link SubNodes }
     * 
     */
    public SubNodes createSubNodes() {
        return new SubNodes();
    }

    /**
     * Create an instance of {@link Subnet }
     * 
     */
    public Subnet createSubnet() {
        return new Subnet();
    }

    /**
     * Create an instance of {@link Filter.FilterAlwaysFalse }
     * 
     */
    public Filter.FilterAlwaysFalse createFilterFilterAlwaysFalse() {
        return new Filter.FilterAlwaysFalse();
    }

    /**
     * Create an instance of {@link EmptyType }
     * 
     */
    public EmptyType createEmptyType() {
        return new EmptyType();
    }

    /**
     * Create an instance of {@link Pools.Static }
     * 
     */
    public Pools.Static createPoolsStatic() {
        return new Pools.Static();
    }

    /**
     * Create an instance of {@link Filter.FilterAnd }
     * 
     */
    public Filter.FilterAnd createFilterFilterAnd() {
        return new Filter.FilterAnd();
    }

    /**
     * Create an instance of {@link DhcpServer.FrontEnd }
     * 
     */
    public DhcpServer.FrontEnd createDhcpServerFrontEnd() {
        return new DhcpServer.FrontEnd();
    }

    /**
     * Create an instance of {@link TypeOptionInet }
     * 
     */
    public TypeOptionInet createTypeOptionInet() {
        return new TypeOptionInet();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link DhcpServer.BackEnd }
     * 
     */
    public DhcpServer.BackEnd createDhcpServerBackEnd() {
        return new DhcpServer.BackEnd();
    }

    /**
     * Create an instance of {@link DhcpServer.Global.Classes }
     * 
     */
    public DhcpServer.Global.Classes createDhcpServerGlobalClasses() {
        return new DhcpServer.Global.Classes();
    }

    /**
     * Create an instance of {@link Filter.FilterOr }
     * 
     */
    public Filter.FilterOr createFilterFilterOr() {
        return new Filter.FilterOr();
    }

    /**
     * Create an instance of {@link TypeFilterRoot }
     * 
     */
    public TypeFilterRoot createTypeFilterRoot() {
        return new TypeFilterRoot();
    }

    /**
     * Create an instance of {@link TypeOptionInt }
     * 
     */
    public TypeOptionInt createTypeOptionInt() {
        return new TypeOptionInt();
    }

    /**
     * Create an instance of {@link Filter.FilterNot }
     * 
     */
    public Filter.FilterNot createFilterFilterNot() {
        return new Filter.FilterNot();
    }

    /**
     * Create an instance of {@link Filter.FilterAlwaysTrue }
     * 
     */
    public Filter.FilterAlwaysTrue createFilterFilterAlwaysTrue() {
        return new Filter.FilterAlwaysTrue();
    }

    /**
     * Create an instance of {@link DhcpServer.BackEnd.Jdbc }
     * 
     */
    public DhcpServer.BackEnd.Jdbc createDhcpServerBackEndJdbc() {
        return new DhcpServer.BackEnd.Jdbc();
    }

    /**
     * Create an instance of {@link TypeNodeSubnet }
     * 
     */
    public TypeNodeSubnet createTypeNodeSubnet() {
        return new TypeNodeSubnet();
    }

    /**
     * Create an instance of {@link Pools }
     * 
     */
    public Pools createPools() {
        return new Pools();
    }

    /**
     * Create an instance of {@link TypeNode }
     * 
     */
    public TypeNode createTypeNode() {
        return new TypeNode();
    }

    /**
     * Create an instance of {@link TypeOptionInets }
     * 
     */
    public TypeOptionInets createTypeOptionInets() {
        return new TypeOptionInets();
    }

    /**
     * Create an instance of {@link TypeOptionByte }
     * 
     */
    public TypeOptionByte createTypeOptionByte() {
        return new TypeOptionByte();
    }

    /**
     * Create an instance of {@link TypeOptionBytes }
     * 
     */
    public TypeOptionBytes createTypeOptionBytes() {
        return new TypeOptionBytes();
    }

    /**
     * Create an instance of {@link TypeSubnet }
     * 
     */
    public TypeSubnet createTypeSubnet() {
        return new TypeSubnet();
    }

    /**
     * Create an instance of {@link Filter.FilterStringOption }
     * 
     */
    public Filter.FilterStringOption createFilterFilterStringOption() {
        return new Filter.FilterStringOption();
    }

    /**
     * Create an instance of {@link DhcpServer.Topology }
     * 
     */
    public DhcpServer.Topology createDhcpServerTopology() {
        return new DhcpServer.Topology();
    }

    /**
     * Create an instance of {@link Pools.Range }
     * 
     */
    public Pools.Range createPoolsRange() {
        return new Pools.Range();
    }

    /**
     * Create an instance of {@link TypeOptionShort }
     * 
     */
    public TypeOptionShort createTypeOptionShort() {
        return new TypeOptionShort();
    }

    /**
     * Create an instance of {@link DhcpServer.Global }
     * 
     */
    public DhcpServer.Global createDhcpServerGlobal() {
        return new DhcpServer.Global();
    }

    /**
     * Create an instance of {@link DhcpServer.Global.Policy }
     * 
     */
    public DhcpServer.Global.Policy createDhcpServerGlobalPolicy() {
        return new DhcpServer.Global.Policy();
    }

    /**
     * Create an instance of {@link OptionsType }
     * 
     */
    public OptionsType createOptionsType() {
        return new OptionsType();
    }

    /**
     * Create an instance of {@link DhcpServer.FrontEnd.Threads }
     * 
     */
    public DhcpServer.FrontEnd.Threads createDhcpServerFrontEndThreads() {
        return new DhcpServer.FrontEnd.Threads();
    }

    /**
     * Create an instance of {@link Lease }
     * 
     */
    public Lease createLease() {
        return new Lease();
    }

    /**
     * Create an instance of {@link DhcpServer.Global.Classes.Class }
     * 
     */
    public DhcpServer.Global.Classes.Class createDhcpServerGlobalClassesClass() {
        return new DhcpServer.Global.Classes.Class();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link Filter.FilterNumOption }
     * 
     */
    public Filter.FilterNumOption createFilterFilterNumOption() {
        return new Filter.FilterNumOption();
    }

    /**
     * Create an instance of {@link DhcpServer.Global.Server }
     * 
     */
    public DhcpServer.Global.Server createDhcpServerGlobalServer() {
        return new DhcpServer.Global.Server();
    }

    /**
     * Create an instance of {@link TypeOptionString }
     * 
     */
    public TypeOptionString createTypeOptionString() {
        return new TypeOptionString();
    }

    /**
     * Create an instance of {@link DhcpServer.FrontEnd.Listen }
     * 
     */
    public DhcpServer.FrontEnd.Listen createDhcpServerFrontEndListen() {
        return new DhcpServer.FrontEnd.Listen();
    }

    /**
     * Create an instance of {@link TypeOptionShorts }
     * 
     */
    public TypeOptionShorts createTypeOptionShorts() {
        return new TypeOptionShorts();
    }

    /**
     * Create an instance of {@link Filter }
     * 
     */
    public Filter createFilter() {
        return new Filter();
    }

    /**
     * Create an instance of {@link OptionGeneric }
     * 
     */
    public OptionGeneric createOptionGeneric() {
        return new OptionGeneric();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionShort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-boot-size", scope = OptionsType.class)
    public JAXBElement<TypeOptionShort> createOptionsTypeOptionBootSize(TypeOptionShort value) {
        return new JAXBElement<TypeOptionShort>(_OptionsTypeOptionBootSize_QNAME, TypeOptionShort.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-domain-name", scope = OptionsType.class)
    public JAXBElement<TypeOptionString> createOptionsTypeOptionDomainName(TypeOptionString value) {
        return new JAXBElement<TypeOptionString>(_OptionsTypeOptionDomainName_QNAME, TypeOptionString.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionInets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-time-servers", scope = OptionsType.class)
    public JAXBElement<TypeOptionInets> createOptionsTypeOptionTimeServers(TypeOptionInets value) {
        return new JAXBElement<TypeOptionInets>(_OptionsTypeOptionTimeServers_QNAME, TypeOptionInets.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-host-name", scope = OptionsType.class)
    public JAXBElement<TypeOptionString> createOptionsTypeOptionHostName(TypeOptionString value) {
        return new JAXBElement<TypeOptionString>(_OptionsTypeOptionHostName_QNAME, TypeOptionString.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionInet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-subnet-mask", scope = OptionsType.class)
    public JAXBElement<TypeOptionInet> createOptionsTypeOptionSubnetMask(TypeOptionInet value) {
        return new JAXBElement<TypeOptionInet>(_OptionsTypeOptionSubnetMask_QNAME, TypeOptionInet.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-dhcp-message", scope = OptionsType.class)
    public JAXBElement<TypeOptionString> createOptionsTypeOptionDhcpMessage(TypeOptionString value) {
        return new JAXBElement<TypeOptionString>(_OptionsTypeOptionDhcpMessage_QNAME, TypeOptionString.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-time-offset", scope = OptionsType.class)
    public JAXBElement<TypeOptionInt> createOptionsTypeOptionTimeOffset(TypeOptionInt value) {
        return new JAXBElement<TypeOptionInt>(_OptionsTypeOptionTimeOffset_QNAME, TypeOptionInt.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionByte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-ip-forwarding", scope = OptionsType.class)
    public JAXBElement<TypeOptionByte> createOptionsTypeOptionIpForwarding(TypeOptionByte value) {
        return new JAXBElement<TypeOptionByte>(_OptionsTypeOptionIpForwarding_QNAME, TypeOptionByte.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionBytes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-dhcp-parameter-request-list", scope = OptionsType.class)
    public JAXBElement<TypeOptionBytes> createOptionsTypeOptionDhcpParameterRequestList(TypeOptionBytes value) {
        return new JAXBElement<TypeOptionBytes>(_OptionsTypeOptionDhcpParameterRequestList_QNAME, TypeOptionBytes.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionShorts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-path-mtu-plateau-table", scope = OptionsType.class)
    public JAXBElement<TypeOptionShorts> createOptionsTypeOptionPathMtuPlateauTable(TypeOptionShorts value) {
        return new JAXBElement<TypeOptionShorts>(_OptionsTypeOptionPathMtuPlateauTable_QNAME, TypeOptionShorts.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOptionInets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "option-routers", scope = OptionsType.class)
    public JAXBElement<TypeOptionInets> createOptionsTypeOptionRouters(TypeOptionInets value) {
        return new JAXBElement<TypeOptionInets>(_OptionsTypeOptionRouters_QNAME, TypeOptionInets.class, OptionsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "giaddr")
    public JAXBElement<String> createGiaddr(String value) {
        return new JAXBElement<String>(_Giaddr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-raw64")
    public JAXBElement<byte[]> createValueRaw64(byte[] value) {
        return new JAXBElement<byte[]>(_ValueRaw64_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-rawhex")
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createValueRawhex(byte[] value) {
        return new JAXBElement<byte[]>(_ValueRawhex_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-int")
    public JAXBElement<Integer> createValueInt(Integer value) {
        return new JAXBElement<Integer>(_ValueInt_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-byte")
    @XmlJavaTypeAdapter(Adapter2 .class)
    public JAXBElement<Byte> createValueByte(Byte value) {
        return new JAXBElement<Byte>(_ValueByte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mirror")
    public JAXBElement<EmptyType> createMirror(EmptyType value) {
        return new JAXBElement<EmptyType>(_Mirror_QNAME, EmptyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InetAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-inet")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<InetAddress> createValueInet(InetAddress value) {
        return new JAXBElement<InetAddress>(_ValueInet_QNAME, InetAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-string")
    public JAXBElement<String> createValueString(String value) {
        return new JAXBElement<String>(_ValueString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-short")
    @XmlJavaTypeAdapter(Adapter3 .class)
    public JAXBElement<Short> createValueShort(Short value) {
        return new JAXBElement<Short>(_ValueShort_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value-string-element")
    public JAXBElement<String> createValueStringElement(String value) {
        return new JAXBElement<String>(_ValueStringElement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "options")
    public JAXBElement<OptionsType> createOptions(OptionsType value) {
        return new JAXBElement<OptionsType>(_Options_QNAME, OptionsType.class, null, value);
    }

}
