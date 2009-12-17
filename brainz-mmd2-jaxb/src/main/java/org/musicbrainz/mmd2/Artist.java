
package org.musicbrainz.mmd2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
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
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}name" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}sort-name" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}gender" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}disambiguation" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}life-span" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}alias-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}release-group-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}work-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}relation-list" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}tag-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}user-tag-list" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}rating" minOccurs="0"/>
 *         &lt;element ref="{http://musicbrainz.org/ns/mmd-2.0#}user-rating" minOccurs="0"/>
 *         &lt;group ref="{http://musicbrainz.org/ns/mmd-2.0#}def_artist-element_extension"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://musicbrainz.org/ns/mmd-2.0#}def_artist-attribute_extension"/>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "sortName",
    "gender",
    "country",
    "disambiguation",
    "lifeSpan",
    "aliasList",
    "releaseList",
    "releaseGroupList",
    "workList",
    "relationList",
    "tagList",
    "userTagList",
    "rating",
    "userRating",
    "defExtensionElement"
})
@XmlRootElement(name = "artist")
public class Artist {

    protected String name;
    @XmlElement(name = "sort-name")
    protected String sortName;
    protected String gender;
    protected String country;
    protected String disambiguation;
    @XmlElement(name = "life-span")
    protected LifeSpan lifeSpan;
    @XmlElement(name = "alias-list")
    protected AliasList aliasList;
    @XmlElement(name = "release-list")
    protected ReleaseList releaseList;
    @XmlElement(name = "release-group-list")
    protected ReleaseGroupList releaseGroupList;
    @XmlElement(name = "work-list")
    protected WorkList workList;
    @XmlElement(name = "relation-list")
    protected List<RelationList> relationList;
    @XmlElement(name = "tag-list")
    protected TagList tagList;
    @XmlElement(name = "user-tag-list")
    protected UserTagList userTagList;
    protected Rating rating;
    @XmlElement(name = "user-rating")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger userRating;
    @XmlAnyElement
    protected List<Element> defExtensionElement;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute
    @XmlSchemaType(name = "anyURI")
    protected String type;
    @XmlAttribute(namespace = "http://musicbrainz.org/ns/ext#-2.0")
    protected String score;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the sortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * Sets the value of the sortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortName(String value) {
        this.sortName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the disambiguation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisambiguation() {
        return disambiguation;
    }

    /**
     * Sets the value of the disambiguation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisambiguation(String value) {
        this.disambiguation = value;
    }

    /**
     * Gets the value of the lifeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link LifeSpan }
     *     
     */
    public LifeSpan getLifeSpan() {
        return lifeSpan;
    }

    /**
     * Sets the value of the lifeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeSpan }
     *     
     */
    public void setLifeSpan(LifeSpan value) {
        this.lifeSpan = value;
    }

    /**
     * Gets the value of the aliasList property.
     * 
     * @return
     *     possible object is
     *     {@link AliasList }
     *     
     */
    public AliasList getAliasList() {
        return aliasList;
    }

    /**
     * Sets the value of the aliasList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AliasList }
     *     
     */
    public void setAliasList(AliasList value) {
        this.aliasList = value;
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
     * Gets the value of the relationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationList }
     * 
     * 
     */
    public List<RelationList> getRelationList() {
        if (relationList == null) {
            relationList = new ArrayList<RelationList>();
        }
        return this.relationList;
    }

    /**
     * Gets the value of the tagList property.
     * 
     * @return
     *     possible object is
     *     {@link TagList }
     *     
     */
    public TagList getTagList() {
        return tagList;
    }

    /**
     * Sets the value of the tagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagList }
     *     
     */
    public void setTagList(TagList value) {
        this.tagList = value;
    }

    /**
     * Gets the value of the userTagList property.
     * 
     * @return
     *     possible object is
     *     {@link UserTagList }
     *     
     */
    public UserTagList getUserTagList() {
        return userTagList;
    }

    /**
     * Sets the value of the userTagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTagList }
     *     
     */
    public void setUserTagList(UserTagList value) {
        this.userTagList = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link Rating }
     *     
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating }
     *     
     */
    public void setRating(Rating value) {
        this.rating = value;
    }

    /**
     * Gets the value of the userRating property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserRating() {
        return userRating;
    }

    /**
     * Sets the value of the userRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserRating(BigInteger value) {
        this.userRating = value;
    }

    /**
     * Gets the value of the defExtensionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defExtensionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefExtensionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getDefExtensionElement() {
        if (defExtensionElement == null) {
            defExtensionElement = new ArrayList<Element>();
        }
        return this.defExtensionElement;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}