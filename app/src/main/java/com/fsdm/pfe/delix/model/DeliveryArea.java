package com.fsdm.pfe.delix.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class DeliveryArea {


    private Long id;
    private String areaName;
    private Collection<Area> areas;

    private String areaCode;

    private List<MapsLocationPoint> areaVertices;

    public DeliveryArea(Long id, String areaName, Collection<Area> areas, String areaCode, List<MapsLocationPoint> areaVertices) {
        this.id = id;
        this.areaName = areaName;
        this.areas = areas;
        this.areaCode = areaCode;
        this.areaVertices = areaVertices;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Collection<Area> getAreas() {
        return areas;
    }

    public void setAreas(Collection<Area> areas) {
        this.areas = areas;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public List<MapsLocationPoint> getAreaVertices() {
        return areaVertices;
    }

    public void setAreaVertices(List<MapsLocationPoint> areaVertices) {
        this.areaVertices = areaVertices;
    }
}