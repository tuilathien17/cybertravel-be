package com.cybergang.cybertravel.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    @Field("province_code")
    private int provinceCode;

    @Field("district_code")
    private int districtCode;

    @Field("ward_code")
    private int wardCode;

    @Field("exact_address")
    private String exactAddress;

    public Address(int provinceCode, int districtCode, int wardCode, String exactAddress) {
        this.provinceCode = provinceCode;
        this.districtCode = districtCode;
        this.wardCode = wardCode;
        this.exactAddress = exactAddress;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(int districtCode) {
        this.districtCode = districtCode;
    }

    public int getWardCode() {
        return wardCode;
    }

    public void setWardCode(int wardCode) {
        this.wardCode = wardCode;
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
                "provinceCode=" + provinceCode +
                ", districtCode=" + districtCode +
                ", wardCode=" + wardCode +
                ", exactAddress='" + exactAddress + '\'' +
                '}';
    }
}
