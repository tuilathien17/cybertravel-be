package com.cybergang.cybertravel.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    @Field("province")
    private String province;

    @Field("district")
    private String district;

    @Field("ward")
    private String ward;

    @Field("exact_address")
    private String exactAddress;

    public Address(String province, String district, String ward, String exactAddress) {
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.exactAddress = exactAddress;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getExactAddress() {
        return exactAddress;
    }

    public void setExactAddress(String exactAddress) {
        this.exactAddress = exactAddress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", ward='" + ward + '\'' +
                ", exactAddress='" + exactAddress + '\'' +
                '}';
    }
}
