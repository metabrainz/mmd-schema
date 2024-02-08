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
 * <p>Java class for def_direction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="def_direction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="both"/&gt;
 *     &lt;enumeration value="forward"/&gt;
 *     &lt;enumeration value="backward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "def_direction")
@XmlEnum
public enum DefDirection {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("forward")
    FORWARD("forward"),
    @XmlEnumValue("backward")
    BACKWARD("backward");
    private final String value;

    DefDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefDirection fromValue(String v) {
        for (DefDirection c: DefDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
