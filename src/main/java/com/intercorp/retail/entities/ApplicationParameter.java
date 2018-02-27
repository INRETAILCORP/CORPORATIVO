package com.intercorp.retail.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Andrés Matos
 * @version 26/02/2018
 */
@Entity
public class ApplicationParameter {

    @Id
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
        return "{\"ApplicationParameter\":{"
            + "\"code\":\"" + code + "\""
            + ", \"description\":\"" + description + "\""
            + ", \"value\":\"" + value + "\""
            + "}}";
    }
}
