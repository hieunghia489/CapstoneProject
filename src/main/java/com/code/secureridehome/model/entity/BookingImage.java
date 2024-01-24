package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking_image")
public class BookingImage {
    @Id
    @Column(name = "booking_image_id")
    private Integer bookingImageId;

    @Column(name = "image_type_id")
    private Integer imageTypeId;

    @Column(name = "url")
    private String url;

    @Column(name = "booking_id")
    private Integer bookingId;

    public Integer getBookingImageId() {
        return this.bookingImageId;
    }

    public void setBookingImageId(Integer bookingImageId) {
        this.bookingImageId = bookingImageId;
    }

    public Integer getImageTypeId() {
        return this.imageTypeId;
    }

    public void setImageTypeId(Integer imageTypeId) {
        this.imageTypeId = imageTypeId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }
}
