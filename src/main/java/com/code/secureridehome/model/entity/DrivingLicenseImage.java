package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "driving_license_image")
public class DrivingLicenseImage {
    @Id
    @Column(name = "driving_lic_image_id")
    private Integer drivingLicImageId;

    @Column(name = "driving_lic_no")
    private Integer drivingLicNo;

    @Column(name = "is_front")
    private Byte isFront;

    @Column(name = "url")
    private String url;

    public Integer getDrivingLicImageId() {
        return this.drivingLicImageId;
    }

    public void setDrivingLicImageId(Integer drivingLicImageId) {
        this.drivingLicImageId = drivingLicImageId;
    }

    public Integer getDrivingLicNo() {
        return this.drivingLicNo;
    }

    public void setDrivingLicNo(Integer drivingLicNo) {
        this.drivingLicNo = drivingLicNo;
    }

    public Byte getIsFront() {
        return this.isFront;
    }

    public void setIsFront(Byte isFront) {
        this.isFront = isFront;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
