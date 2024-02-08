//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package org.musicbrainz.mmd2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         <element ref="{http://musicbrainz.org/ns/mmd-2.0#}track-count" minOccurs="0"/>
 *         <element ref="{http://musicbrainz.org/ns/mmd-2.0#}medium" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_list-attributes"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trackCount",
    "medium",
    "count",
    "offset"
})
@XmlRootElement(name = "medium-list")
public class MediumList {

    @XmlElement(name = "track-count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger trackCount;
    protected List<Medium> medium;
    @XmlAttribute(name = "count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlAttribute(name = "offset")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger offset;

    /**
     * Gets the value of the trackCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrackCount() {
        return trackCount;
    }

    /**
     * Sets the value of the trackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrackCount(BigInteger value) {
        this.trackCount = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the medium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Medium }
     * 
     * 
     * @return
     *     The value of the medium property.
     */
    public List<Medium> getMedium() {
        if (medium == null) {
            medium = new ArrayList<>();
        }
        return this.medium;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffset(BigInteger value) {
        this.offset = value;
    }

}
