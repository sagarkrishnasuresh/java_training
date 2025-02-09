package com.example.jsonexample.usingClass.nestedjson;

public class Address {
    private String city;
    private String zipCode;

    // Getters, Setters, and toString
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "', zipCode='" + zipCode + "'}";
    }
}

