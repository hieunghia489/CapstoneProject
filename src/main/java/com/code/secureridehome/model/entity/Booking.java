package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "driver_id")
    private Integer driverId;

    @Column(name = "passenger_id")
    private Integer passengerId;

    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "vehicle_type_id")
    private Integer vehicleTypeId;

    @Column(name = "vehicle_license_plate")
    private String vehicleLicensePlate;

    @Column(name = "is_paid")
    private Byte isPaid;

    @Column(name = "pick_up_location")
    private String pickUpLocation;

    @Column(name = "drop_off_location")
    private String dropOffLocation;

    @Column(name = "pick_up_time")
    private LocalDateTime pickUpTime;

    @Column(name = "drop_off_time")
    private LocalDateTime dropOffTime;

    @Column(name = "total_price")
    private Integer totalPrice;

    @Column(name = "note")
    private String note;

    @Column(name = "current_status")
    private String currentStatus;

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setVehicleTypeId(Integer vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public void setVehicleLicensePlate(String vehicleLicensePlate) {
        this.vehicleLicensePlate = vehicleLicensePlate;
    }

    public void setIsPaid(Byte isPaid) {
        this.isPaid = isPaid;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public void setPickUpTime(LocalDateTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public void setDropOffTime(LocalDateTime dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
}
