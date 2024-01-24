package com.code.secureridehome.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "identity_card")
public class IdentityCard {
    @Id
    @Column(name = "identity_card_no")
    private String identityCardNo;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "place_of_origin")
    private String placeOfOrigin;

    @Column(name = "place_if_residence")
    private String placeIfResidence;

    @Column(name = "personal_identification")
    private String personalIdentification;

    @Column(name = "expired_date")
    private LocalDate expiredDate;

    @Column(name = "identity_card_status")
    private Byte identityCardStatus;

    public String getIdentityCardNo() {
        return this.identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPlaceOfOrigin() {
        return this.placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getPlaceIfResidence() {
        return this.placeIfResidence;
    }

    public void setPlaceIfResidence(String placeIfResidence) {
        this.placeIfResidence = placeIfResidence;
    }

    public String getPersonalIdentification() {
        return this.personalIdentification;
    }

    public void setPersonalIdentification(String personalIdentification) {
        this.personalIdentification = personalIdentification;
    }

    public LocalDate getExpiredDate() {
        return this.expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Byte getIdentityCardStatus() {
        return this.identityCardStatus;
    }

    public void setIdentityCardStatus(Byte identityCardStatus) {
        this.identityCardStatus = identityCardStatus;
    }
}
