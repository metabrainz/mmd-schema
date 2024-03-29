//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.musicbrainz.mmd2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://musicbrainz.org/ns/mmd-2.0#}name" minOccurs="0"/>
 *         <element ref="{http://musicbrainz.org/ns/mmd-2.0#}artist"/>
 *       </sequence>
 *       <attribute name="joinphrase" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "artist"
})
@XmlRootElement(name = "name-credit")
public class NameCredit {

    protected String name;
    @XmlElement(required = true)
    protected Artist artist;
    @XmlAttribute(name = "joinphrase")
    @XmlSchemaType(name = "anySimpleType")
    protected String joinphrase;

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
     * Gets the value of the artist property.
     * 
     * @return
     *     possible object is
     *     {@link Artist }
     *     
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * Sets the value of the artist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Artist }
     *     
     */
    public void setArtist(Artist value) {
        this.artist = value;
    }

    /**
     * Gets the value of the joinphrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinphrase() {
        return joinphrase;
    }

    /**
     * Sets the value of the joinphrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinphrase(String value) {
        this.joinphrase = value;
    }

}
