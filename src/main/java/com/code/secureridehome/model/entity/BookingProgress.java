package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking_progress")
public class BookingProgress {
    @Id
    @Column(name = "booking_progress_id")
    private Integer bookingProgressId;

    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "booking_step")
    private String bookingStep;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    public Integer getBookingProgressId() {
        return this.bookingProgressId;
    }

    public void setBookingProgressId(Integer bookingProgressId) {
        this.bookingProgressId = bookingProgressId;
    }

    public Integer getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingStep() {
        return this.bookingStep;
    }

    public void setBookingStep(String bookingStep) {
        this.bookingStep = bookingStep;
    }

    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
