package com.code.secureridehome.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class PassengerRegister {
    private String email;
    private String fullname;
    private Date dob;
    private int gender;
    private boolean publicGender;
    private String phoneNumber;
    private String avatarUrl;

    public PassengerRegister(String email, String fullname, Date dob, int gender, boolean publicGender, String phoneNumber, String avatarUrl) {
        this.email = email;
        this.fullname = fullname;
        this.dob = dob;
        this.gender = gender;
        this.publicGender = publicGender;
        this.phoneNumber = phoneNumber;
        this.avatarUrl = avatarUrl;
    }

    public PassengerRegister() {
    }

}
