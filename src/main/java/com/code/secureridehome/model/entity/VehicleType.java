package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vehicle_type")
public class VehicleType {
    @Id
    @Column(name = "vehicle_type_id")
    private Integer vehicleTypeId;

    @Column(name = "description")
    private String description;

    @Column(name = "seat")
    private Integer seat;

    @Column(name = "license_request")
    private String licenseRequest;

    @Column(name = "image")
    private String image;

    public Integer getVehicleTypeId() {
        return this.vehicleTypeId;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSeat() {
        return this.seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public String getLicenseRequest() {
        return this.licenseRequest;
    }

    public void setLicenseRequest(String licenseRequest) {
        this.licenseRequest = licenseRequest;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
