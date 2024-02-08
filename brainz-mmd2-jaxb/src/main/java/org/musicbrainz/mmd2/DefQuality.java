//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.13 at 07:03:03 PM IST 
//


package org.musicbrainz.mmd2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for def_quality.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="def_quality"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="low"/&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="high"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "def_quality")
@XmlEnum
public enum DefQuality {

    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("high")
    HIGH("high");
    private final String value;

    DefQuality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefQuality fromValue(String v) {
        for (DefQuality c: DefQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
