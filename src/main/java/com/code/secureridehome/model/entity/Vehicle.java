package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "vehicle_license_plate")
    private String vehicleLicensePlate;

    @Column(name = "passenger_id")
    private Integer passengerId;

    @Column(name = "vehicle_type_id")
    private Integer vehicleTypeId;

    @Column(name = "model")
    private String model;

    public String getVehicleLicensePlate() {
        return this.vehicleLicensePlate;
    }

    public void setVehicleLicensePlate(String vehicleLicensePlate) {
        this.vehicleLicensePlate = vehicleLicensePlate;
    }

    public Integer getPassengerId() {
        return this.passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public Integer getVehicleTypeId() {
        return this.vehicleTypeId;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
