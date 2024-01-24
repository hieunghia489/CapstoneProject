package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "passsenger_location")
public class PasssengerLocation {
    @Id
    @Column(name = "location_id")
    private Integer locationId;

    @Column(name = "passenger_id")
    private Integer passengerId;

    @Column(name = "address")
    private String address;

    public Integer getLocationId() {
        return this.locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getPassengerId() {
        return this.passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
