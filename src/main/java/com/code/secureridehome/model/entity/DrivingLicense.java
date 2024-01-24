package com.code.secureridehome.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "driving_license")
public class DrivingLicense {
    @Id
    @Column(name = "driving_lic_no")
    private Integer drivingLicNo;

    @Column(name = "driver_id")
    private Integer driverId;

    @Column(name = "lecense_class")
    private String lecenseClass;

    @Column(name = "expired_date")
    private LocalDate expiredDate;

    @Column(name = "driving_lic_status")
    private Byte drivingLicStatus;

    public Integer getDrivingLicNo() {
        return this.drivingLicNo;
    }

    public void setDrivingLicNo(Integer drivingLicNo) {
        this.drivingLicNo = drivingLicNo;
    }

    public Integer getDriverId() {
        return this.driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getLecenseClass() {
        return this.lecenseClass;
    }

    public void setLecenseClass(String lecenseClass) {
        this.lecenseClass = lecenseClass;
    }

    public LocalDate getExpiredDate() {
        return this.expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Byte getDrivingLicStatus() {
        return this.drivingLicStatus;
    }

    public void setDrivingLicStatus(Byte drivingLicStatus) {
        this.drivingLicStatus = drivingLicStatus;
    }
}
