package com.cybergang.cybertravel.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Description {
    @Field("short_description")
    private String shortDescription;

    @Field("detail_description")
    private String detailDescription;

    public Description(String shortDescription, String detailDescription) {
        this.shortDescription = shortDescription;
        this.detailDescription = detailDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    @Override
    public String toString() {
        return "Description{" +
                "shortDescription='" + shortDescription + '\'' +
                ", detailDescription='" + detailDescription + '\'' +
                '}';
    }
}
