package com.code.secureridehome.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @Column(name = "passenger_id")
    private Integer passengerId;

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

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "flag")
    private Byte flag;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "identity_card_no")
    private String identityCardNo;

    public Integer getPassengerId() {
        return this.passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
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

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
}
