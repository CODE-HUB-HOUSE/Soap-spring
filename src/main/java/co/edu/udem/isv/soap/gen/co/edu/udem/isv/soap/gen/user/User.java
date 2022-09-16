//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.09.01 at 08:09:49 PM COT
//


package co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="user"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tag" type="{http://www.udem.edu.co/isv/soap/gen}tag"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
        "dni",
        "name",
        "phoneNumber",
        "email",
        "tag",
        "password"
})
public class User {

    @XmlElement(required = true)
    protected String dni;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String phoneNumber;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Tag tag;
    @XmlElement(required = true)
    protected String password;
    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone number property.
     *
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phone number property.
     *
     */
    public void setPopulation(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the tag property.
     *
     * @return
     *     possible object is
     *     {@link Tag }
     *
     */
    public Tag getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     *
     * @param value
     *     allowed object is
     *     {@link Tag }
     *
     */
    public void setTag(Tag value) {
        this.tag = value;
    }
    /**
     * Gets the value of the password property.
     *
     * @return
     *     possible object is
     *     {@link Tag }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }
    /**
     * Gets the value of the dni property.
     *
     * @return
     *     possible object is
     *     {@link Tag }
     *
     */
    public String getDNI() {
        return dni;
    }

    /**
     * Sets the value of the dni property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDNI(String value) {
        this.dni = value;
    }
}