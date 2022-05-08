package com.cybergang.cybertravel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@Document("hotels")
public class Hotel {
    @Id
    private String id;

    @Field(name = "place_id", targetType = FieldType.OBJECT_ID)
    private String placeId;

    @TextIndexed
    @Field("name")
    private String name;

    @Field("address")
    private Address address;

    @Field("description")
    private Description description;

    @Field("image_url")
    private String imageUrl;

    @Field("contact")
    private String contact;

    @PersistenceConstructor
    public Hotel(String placeId, String name, Address address, Description description, String imageUrl, String contact) {
        this.placeId = placeId;
        this.name = name;
        this.address = address;
        this.description = description;
        this.imageUrl = imageUrl;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
