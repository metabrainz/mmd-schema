//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.05 at 02:48:50 PM GMT 
//


package org.musicbrainz.mmd2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}artist"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release-group"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}recording"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}label"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}work"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}area"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}place"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}instrument"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}series"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}event"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_list-attributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "artistAndReleaseAndReleaseGroup"
})
@XmlRootElement(name = "entity-list")
public class EntityList {

    @XmlElements({
        @XmlElement(name = "release-group", type = ReleaseGroup.class),
        @XmlElement(name = "area", type = DefAreaElementInner.class),
        @XmlElement(name = "place", type = Place.class),
        @XmlElement(name = "instrument", type = Instrument.class),
        @XmlElement(name = "release", type = Release.class),
        @XmlElement(name = "series", type = Series.class),
        @XmlElement(name = "work", type = Work.class),
        @XmlElement(name = "event", type = Event.class),
        @XmlElement(name = "recording", type = Recording.class),
        @XmlElement(name = "label", type = Label.class),
        @XmlElement(name = "artist", type = Artist.class)
    })
    protected List<Object> artistAndReleaseAndReleaseGroup;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger offset;

    /**
     * Gets the value of the artistAndReleaseAndReleaseGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artistAndReleaseAndReleaseGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtistAndReleaseAndReleaseGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReleaseGroup }
     * {@link DefAreaElementInner }
     * {@link Place }
     * {@link Instrument }
     * {@link Release }
     * {@link Series }
     * {@link Work }
     * {@link Event }
     * {@link Recording }
     * {@link Label }
     * {@link Artist }
     * 
     * 
     */
    public List<Object> getArtistAndReleaseAndReleaseGroup() {
        if (artistAndReleaseAndReleaseGroup == null) {
            artistAndReleaseAndReleaseGroup = new ArrayList<Object>();
        }
        return this.artistAndReleaseAndReleaseGroup;
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
