package com.cybergang.cybertravel.model;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Field;

public class Guest {
    @TextIndexed
    @Field("full_name")
    private String fullName;

    @Field("address")
    private Address address;

    @Field("gender")
    private String gender;

    @Field("email")
    private String email;

    @Field("identification")
    private String identification;

    @Field("telephone")
    private String telephone;

    @PersistenceConstructor
    public Guest(String fullName, Address address, String gender, String email, String identification, String telephone) {
        this.fullName = fullName;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.identification = identification;
        this.telephone = telephone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "fullName='" + fullName + '\'' +
                ", address=" + address +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", identification='" + identification + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
