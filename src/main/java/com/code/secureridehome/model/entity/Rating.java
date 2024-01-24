package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rating")
public class Rating {
    @Id
    @Column(name = "rating_it")
    private Integer ratingIt;

    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "passenger_id")
    private Integer passengerId;

    @Column(name = "content")
    private String content;

    @Column(name = "rate")
    private Integer rate;

    public Integer getRatingIt() {
        return this.ratingIt;
    }

    public void setRatingIt(Integer ratingIt) {
        this.ratingIt = ratingIt;
    }

    public Integer getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getPassengerId() {
        return this.passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRate() {
        return this.rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
