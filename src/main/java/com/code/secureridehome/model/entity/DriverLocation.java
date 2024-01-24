package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "driver_location")
public class DriverLocation {
    @Id
    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "driver_id")
    private Integer driverId;

    @Column(name = "address")
    private String address;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    public Integer getLocationId() {
        return this.locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getDriverId() {
        return this.driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
