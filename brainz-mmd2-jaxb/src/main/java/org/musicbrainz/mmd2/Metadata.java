
package org.musicbrainz.mmd2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


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
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}artist" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release-group" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}recording" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}label" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}work" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}artist-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release-group-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}recording-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}label-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}work-list" minOccurs="0"/>
 *         &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_metadata-element_extension"/>
 *       &lt;/sequence>
 *       &lt;attribute name="generator" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "artist",
    "release",
    "releaseGroup",
    "recording",
    "label",
    "work",
    "artistList",
    "releaseList",
    "releaseGroupList",
    "recordingList",
    "labelList",
    "workList",
    "any"
})
@XmlRootElement(name = "metadata")
public class Metadata {

    protected Artist artist;
    protected Release release;
    @XmlElement(name = "release-group")
    protected ReleaseGroup releaseGroup;
    protected Recording recording;
    protected Label label;
    protected Work work;
    @XmlElement(name = "artist-list")
    protected ArtistList artistList;
    @XmlElement(name = "release-list")
    protected ReleaseList releaseList;
    @XmlElement(name = "release-group-list")
    protected ReleaseGroupList releaseGroupList;
    @XmlElement(name = "recording-list")
    protected RecordingList recordingList;
    @XmlElement(name = "label-list")
    protected LabelList labelList;
    @XmlElement(name = "work-list")
    protected WorkList workList;
    @XmlAnyElement
    protected Element any;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String generator;
    @XmlAttribute
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;

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
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link Release }
     *     
     */
    public Release getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link Release }
     *     
     */
    public void setRelease(Release value) {
        this.release = value;
    }

    /**
     * Gets the value of the releaseGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseGroup }
     *     
     */
    public ReleaseGroup getReleaseGroup() {
        return releaseGroup;
    }

    /**
     * Sets the value of the releaseGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseGroup }
     *     
     */
    public void setReleaseGroup(ReleaseGroup value) {
        this.releaseGroup = value;
    }

    /**
     * Gets the value of the recording property.
     * 
     * @return
     *     possible object is
     *     {@link Recording }
     *     
     */
    public Recording getRecording() {
        return recording;
    }

    /**
     * Sets the value of the recording property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recording }
     *     
     */
    public void setRecording(Recording value) {
        this.recording = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
    }

    /**
     * Gets the value of the work property.
     * 
     * @return
     *     possible object is
     *     {@link Work }
     *     
     */
    public Work getWork() {
        return work;
    }

    /**
     * Sets the value of the work property.
     * 
     * @param value
     *     allowed object is
     *     {@link Work }
     *     
     */
    public void setWork(Work value) {
        this.work = value;
    }

    /**
     * Gets the value of the artistList property.
     * 
     * @return
     *     possible object is
     *     {@link ArtistList }
     *     
     */
    public ArtistList getArtistList() {
        return artistList;
    }

    /**
     * Sets the value of the artistList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArtistList }
     *     
     */
    public void setArtistList(ArtistList value) {
        this.artistList = value;
    }

    /**
     * Gets the value of the releaseList property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseList }
     *     
     */
    public ReleaseList getReleaseList() {
        return releaseList;
    }

    /**
     * Sets the value of the releaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseList }
     *     
     */
    public void setReleaseList(ReleaseList value) {
        this.releaseList = value;
    }

    /**
     * Gets the value of the releaseGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseGroupList }
     *     
     */
    public ReleaseGroupList getReleaseGroupList() {
        return releaseGroupList;
    }

    /**
     * Sets the value of the releaseGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseGroupList }
     *     
     */
    public void setReleaseGroupList(ReleaseGroupList value) {
        this.releaseGroupList = value;
    }

    /**
     * Gets the value of the recordingList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingList }
     *     
     */
    public RecordingList getRecordingList() {
        return recordingList;
    }

    /**
     * Sets the value of the recordingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingList }
     *     
     */
    public void setRecordingList(RecordingList value) {
        this.recordingList = value;
    }

    /**
     * Gets the value of the labelList property.
     * 
     * @return
     *     possible object is
     *     {@link LabelList }
     *     
     */
    public LabelList getLabelList() {
        return labelList;
    }

    /**
     * Sets the value of the labelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelList }
     *     
     */
    public void setLabelList(LabelList value) {
        this.labelList = value;
    }

    /**
     * Gets the value of the workList property.
     * 
     * @return
     *     possible object is
     *     {@link WorkList }
     *     
     */
    public WorkList getWorkList() {
        return workList;
    }

    /**
     * Sets the value of the workList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkList }
     *     
     */
    public void setWorkList(WorkList value) {
        this.workList = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

}
