
package org.musicbrainz.mmd2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anyName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="anyName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "anyName")
@XmlEnum
public enum AnyName {

    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    AnyName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnyName fromValue(String v) {
        for (AnyName c: AnyName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
