package com.intercorp.retail.canonical;

import java.io.Serializable;

/**
 * @author Andrés Matos
 * @version 26/02/2018
 */
public class ParameterCanonical implements Serializable {

    private String code;
    private String description;
    private String value;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{\"ParameterCanonical\":{"
            + "\"code\":\"" + code + "\""
            + ", \"description\":\"" + description + "\""
            + ", \"value\":\"" + value + "\""
            + "}}";
    }
}
