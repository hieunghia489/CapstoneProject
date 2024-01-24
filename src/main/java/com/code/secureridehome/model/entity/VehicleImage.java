package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vehicle_image")
public class VehicleImage {
    @Id
    @Column(name = "vehicle_image_id")
    private Integer vehicleImageId;

    @Column(name = "vehicle_license_plate")
    private String vehicleLicensePlate;

    @Column(name = "url")
    private String url;

    @Column(name = "vehicle_image_type_id")
    private Integer vehicleImageTypeId;

    public Integer getVehicleImageId() {
        return this.vehicleImageId;
    }

    public void setVehicleImageId(Integer vehicleImageId) {
        this.vehicleImageId = vehicleImageId;
    }

    public String getVehicleLicensePlate() {
        return this.vehicleLicensePlate;
    }

    public void setVehicleLicensePlate(String vehicleLicensePlate) {
        this.vehicleLicensePlate = vehicleLicensePlate;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getVehicleImageTypeId() {
        return this.vehicleImageTypeId;
    }

    public void setVehicleImageTypeId(Integer vehicleImageTypeId) {
        this.vehicleImageTypeId = vehicleImageTypeId;
    }
}
