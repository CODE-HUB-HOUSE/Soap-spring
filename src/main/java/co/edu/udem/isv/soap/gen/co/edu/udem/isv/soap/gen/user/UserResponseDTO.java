package co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userResponseDTO", propOrder = {
        "name",
        "phoneNumber",
        "email",
        "tag"
})
public final class UserResponseDTO {
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String phoneNumber;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Tag tag;
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
     * @param name
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets the value of the phone number property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * Sets the value of the phoneNumber property.
     *
     * @param phoneNumber
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * @param email
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Gets the value of the tag property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public Tag getTag() {
        return tag;
    }
    /**
     * Sets the value of the tag property.
     *
     * @param tag
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
