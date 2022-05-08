package com.cybergang.cybertravel.model;

import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Document("users")
public class User {
    @Id
    private String id;

    @TextIndexed
    @Field("full_name")
    private String fullName;

    @Field("address")
    private Address address;

    @Field("gender")
    private String gender;

    @Indexed(unique = true)
    @Field("email")
    private String email;

    @Indexed(unique = true)
    @Field("identification")
    private String identification;

    @Field("telephone")
    private String telephone;

    @Field("password")
    private String password;

    @PersistenceConstructor
    public User(String fullName, Address address, String gender, String email, String identification, String telephone, String password) {
        this.fullName = fullName;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.identification = identification;
        this.telephone = telephone;
        this.password = passwordEncoder().encode(password);
    }

    public String getId() {
        return id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = passwordEncoder().encode(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "Id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address=" + address +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", identification='" + identification + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password +
                '}';
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
