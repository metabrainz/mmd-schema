
package org.musicbrainz.mmd2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}title" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}position" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}format" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}disc-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}track-list"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "position",
    "format",
    "discList",
    "trackList"
})
@XmlRootElement(name = "medium")
public class Medium {

    protected String title;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger position;
    protected String format;
    @XmlElement(name = "disc-list")
    protected DiscList discList;
    @XmlElement(name = "track-list", required = true)
    protected TrackList trackList;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the discList property.
     * 
     * @return
     *     possible object is
     *     {@link DiscList }
     *     
     */
    public DiscList getDiscList() {
        return discList;
    }

    /**
     * Sets the value of the discList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscList }
     *     
     */
    public void setDiscList(DiscList value) {
        this.discList = value;
    }

    /**
     * Gets the value of the trackList property.
     * 
     * @return
     *     possible object is
     *     {@link TrackList }
     *     
     */
    public TrackList getTrackList() {
        return trackList;
    }

    /**
     * Sets the value of the trackList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackList }
     *     
     */
    public void setTrackList(TrackList value) {
        this.trackList = value;
    }

}
