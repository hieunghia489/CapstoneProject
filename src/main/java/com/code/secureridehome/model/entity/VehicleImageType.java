package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vehicle_image_type")
public class VehicleImageType {
    @Id
    @Column(name = "vehicle_image_type_id")
    private Integer vehicleImageTypeId;

    @Column(name = "vehicle_type_name")
    private String vehicleTypeName;

    public Integer getVehicleImageTypeId() {
        return this.vehicleImageTypeId;
    }

    public void setVehicleImageTypeId(Integer vehicleImageTypeId) {
        this.vehicleImageTypeId = vehicleImageTypeId;
    }

    public String getVehicleTypeName() {
        return this.vehicleTypeName;
    }

    public void setVehicleTypeName(String vehicleTypeName) {
        this.vehicleTypeName = vehicleTypeName;
    }
}
