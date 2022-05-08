package com.cybergang.cybertravel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("places")
public class Place {
    @Id
    private String id;

    @TextIndexed
    @Field("name")
    private String name;

    @Field("address")
    private Address address;

    @Field("description")
    private Description description;

    @Field("image_url")
    private String imageUrl;

    @Field("trip_duration")
    private String tripDuration;

    @Field("feePerPerson")
    private long feePerPerson;

    public Place(String name, Address address, Description description, String imageUrl, String tripDuration, long feePerPerson) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.imageUrl = imageUrl;
        this.tripDuration = tripDuration;
        this.feePerPerson = feePerPerson;
    }

    public String getId() {
        return id;
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

    public String getTripDuration() {
        return tripDuration;
    }

    public void setTripDuration(String tripDuration) {
        this.tripDuration = tripDuration;
    }

    public long getFeePerPerson() {
        return feePerPerson;
    }

    public void setFeePerPerson(long feePerPerson) {
        this.feePerPerson = feePerPerson;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", description=" + description +
                ", imageUrl='" + imageUrl + '\'' +
                ", tripDuration='" + tripDuration + '\'' +
                ", feePerPerson=" + feePerPerson +
                '}';
    }
}
