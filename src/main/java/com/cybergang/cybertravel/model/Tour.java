package com.cybergang.cybertravel.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.util.List;

@Document("tours")
public class Tour {
    @Id
    private String id;

    @Field(name = "user_tourist", targetType = FieldType.OBJECT_ID)
    private List<String> userTourists;

    @Field("guest_tourist")
    private List<Guest> guestTourists;

    @Field("depart_date")
    private String departDate;

    @Field("departure")
    private String departure;

    @Field(name = "destination", targetType = FieldType.OBJECT_ID)
    private String destination;

    @Field(name = "hotel_id", targetType = FieldType.OBJECT_ID)
    private String hotelId;

    @Field("status")
    private String status;

    @Field("vehicle")
    private String vehicle;

    @Field("createAt")
    private String createAt;

    @Field("updateAt")
    private String updateAt;

    @PersistenceConstructor
    public Tour(List<String> userTourists, List<Guest> guestTourists, String departDate, String departure, String destination, String hotelId, String status, String vehicle) {
        this.userTourists = userTourists;
        this.guestTourists = guestTourists;
        this.departDate = departDate;
        this.departure = departure;
        this.destination = destination;
        this.hotelId = hotelId;
        this.status = status;
        this.vehicle = vehicle;
    }

    public String getId() {
        return id;
    }

    public List<String> getUserTourists() {
        return userTourists;
    }

    public void setUserTourists(List<String> userTourists) {
        this.userTourists = userTourists;
    }

    public List<Guest> getGuestTourists() {
        return guestTourists;
    }

    public void setGuestTourists(List<Guest> guestTourists) {
        this.guestTourists = guestTourists;
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id='" + id + '\'' +
                ", userTourists=" + userTourists +
                ", guestTourists=" + guestTourists +
                ", departDate='" + departDate + '\'' +
                ", departure='" + departure + '\'' +
                ", destination=" + destination +
                ", hotelId=" + hotelId +
                ", status='" + status + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
