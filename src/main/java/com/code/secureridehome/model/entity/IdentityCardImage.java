package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "identity_card_image")
public class IdentityCardImage {
    @Id
    @Column(name = "identity_card_image_id")
    private Integer identityCardImageId;

    @Column(name = "identity_card_no")
    private String identityCardNo;

    @Column(name = "url")
    private String url;

    @Column(name = "is_front")
    private Byte isFront;

    public Integer getIdentityCardImageId() {
        return this.identityCardImageId;
    }

    public void setIdentityCardImageId(Integer identityCardImageId) {
        this.identityCardImageId = identityCardImageId;
    }

    public String getIdentityCardNo() {
        return this.identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Byte getIsFront() {
        return this.isFront;
    }

    public void setIsFront(Byte isFront) {
        this.isFront = isFront;
    }
}
