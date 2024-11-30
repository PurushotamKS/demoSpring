package com.firstSpring.demoSpring;

public class Address {
    private String pin;
    private String district;

    Address(){

    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pin='" + pin + '\'' +
                ", district='" + district + '\'' +
                '}';
    }
}
