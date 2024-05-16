package com.fsdm.pfe.delix.model;

import java.util.Date;

public class Area {


    private Long id;

    private String code;
    private String name;

    private String cityCode;

    private String postCode;

    public Area(Long id, String code, String name, String cityCode, String postCode) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.cityCode = cityCode;
        this.postCode = postCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}

