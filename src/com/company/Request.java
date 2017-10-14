package com.company;

public class Request {
    protected String city;
    protected String code;
    protected String units = "metric";

    public Request(String city, String code) {
        this.city = city;
        this.code = code;
    }

    public Request(String city, String code, String units) {
        this.city = city;
        this.code = code;
        this.units = units;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
