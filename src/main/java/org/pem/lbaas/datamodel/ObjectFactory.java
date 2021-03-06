//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.28 at 09:15:42 PM PDT 
//


package org.pem.lbaas.datamodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openstack.docs.atlas.api.v1 package. 
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

    private final static QName _LbaasException_QNAME = new QName("http://docs.openstack.org/atlas/api/v1.1", "lbaasException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openstack.docs.atlas.api.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeneralException }
     * 
     */
    public GeneralException createGeneralException() {
        return new GeneralException();
    }

    /**
     * Create an instance of {@link OverLimit }
     * 
     */
    public OverLimit createOverLimit() {
        return new OverLimit();
    }

    /**
     * Create an instance of {@link ItemNotFound }
     * 
     */
    public ItemNotFound createItemNotFound() {
        return new ItemNotFound();
    }

    /**
     * Create an instance of {@link OutOfVirtualIps }
     * 
     */
    public OutOfVirtualIps createOutOfVirtualIps() {
        return new OutOfVirtualIps();
    }

    /**
     * Create an instance of {@link ImmutableEntity }
     * 
     */
    public ImmutableEntity createImmutableEntity() {
        return new ImmutableEntity();
    }

    /**
     * Create an instance of {@link LoadBalancerException }
     * 
     */
    public LoadBalancerException createLoadBalancerException() {
        return new LoadBalancerException();
    }

    /**
     * Create an instance of {@link UnProcessableEntity }
     * 
     */
    public UnProcessableEntity createUnProcessableEntity() {
        return new UnProcessableEntity();
    }

    /**
     * Create an instance of {@link BadRequest }
     * 
     */
    public BadRequest createBadRequest() {
        return new BadRequest();
    }

    /**
     * Create an instance of {@link ServiceUnavailable }
     * 
     */
    public ServiceUnavailable createServiceUnavailable() {
        return new ServiceUnavailable();
    }

    /**
     * Create an instance of {@link Unauthorized }
     * 
     */
    public Unauthorized createUnauthorized() {
        return new Unauthorized();
    }

    /**
     * Create an instance of {@link LbaasException }
     * 
     */
    public LbaasException createLbaasException() {
        return new LbaasException();
    }

    /**
     * Create an instance of {@link ValidationErrors }
     * 
     */
    public ValidationErrors createValidationErrors() {
        return new ValidationErrors();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LbaasException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.openstack.org/atlas/api/v1.1", name = "lbaasException")
    public JAXBElement<LbaasException> createLbaasException(LbaasException value) {
        return new JAXBElement<LbaasException>(_LbaasException_QNAME, LbaasException.class, null, value);
    }

}
