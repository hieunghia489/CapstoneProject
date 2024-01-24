package com.code.secureridehome.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @Column(name = "driver_id")
    private Integer driverId;

    @Column(name = "email")
    private String email;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "public_gender")
    private Byte publicGender;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "rating")
    private Float rating;

    @Column(name = "flag")
    private Byte flag;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "identity_card_no")
    private String identityCardNo;

    @Column(name = "prioritize")
    private Integer prioritize;

    @Column(name = "create_by")
    private Integer createBy;

    @Column(name = "is_booked")
    private Byte isBooked;

    @Column(name = "is_active")
    private Byte isActive;

    public Integer getDriverId() {
        return this.driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Byte getPublicGender() {
        return this.publicGender;
    }

    public void setPublicGender(Byte publicGender) {
        this.publicGender = publicGender;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Float getRating() {
        return this.rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Byte getFlag() {
        return this.flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }

    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public String getIdentityCardNo() {
        return this.identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public Integer getPrioritize() {
        return this.prioritize;
    }

    public void setPrioritize(Integer prioritize) {
        this.prioritize = prioritize;
    }

    public Integer getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Byte getIsBooked() {
        return this.isBooked;
    }

    public void setIsBooked(Byte isBooked) {
        this.isBooked = isBooked;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }
}
