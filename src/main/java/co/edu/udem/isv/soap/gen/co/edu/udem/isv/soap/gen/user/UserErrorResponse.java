package co.edu.udem.isv.soap.gen.co.edu.udem.isv.soap.gen.user;


import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userErrorResponse", propOrder = {
        "message",
        "status",
})
public final class UserErrorResponse {
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    protected String status;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMessage() {
        return message;
    }
    /**
     * Sets the value of the message property.
     *
     * @param message
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMessage(String message) {
        this.message = message;
    }
    /**
     * Gets the value of the phone status property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }
    /**
     * Sets the value of the status property.
     *
     * @param status
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String status) {
        this.status = status;
    }
}

