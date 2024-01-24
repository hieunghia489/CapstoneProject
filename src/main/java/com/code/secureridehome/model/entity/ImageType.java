package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "image_type")
public class ImageType {
    @Id
    @Column(name = "image_type_id")
    private Integer imageTypeId;

    @Column(name = "image_type_name")
    private String imageTypeName;

    public Integer getImageTypeId() {
        return this.imageTypeId;
    }

    public void setImageTypeId(Integer imageTypeId) {
        this.imageTypeId = imageTypeId;
    }

    public String getImageTypeName() {
        return this.imageTypeName;
    }

    public void setImageTypeName(String imageTypeName) {
        this.imageTypeName = imageTypeName;
    }
}
