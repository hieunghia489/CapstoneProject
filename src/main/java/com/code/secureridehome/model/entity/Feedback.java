package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @Column(name = "feedback_id")
    private Integer feedbackId;

    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "driver_id")
    private Integer driverId;

    @Column(name = "content")
    private String content;

    public Integer getFeedbackId() {
        return this.feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Integer getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getDriverId() {
        return this.driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
