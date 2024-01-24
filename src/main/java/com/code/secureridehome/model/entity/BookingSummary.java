package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking_summary")
public class BookingSummary {
    @Id
    @Column(name = "summary_id")
    private Integer summaryId;

    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "final_drop_off_location")
    private String finalDropOffLocation;

    @Column(name = "final_drop_off_time")
    private LocalDateTime finalDropOffTime;

    @Column(name = "final_price")
    private Integer finalPrice;

    public Integer getSummaryId() {
        return this.summaryId;
    }

    public void setSummaryId(Integer summaryId) {
        this.summaryId = summaryId;
    }

    public Integer getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getFinalDropOffLocation() {
        return this.finalDropOffLocation;
    }

    public void setFinalDropOffLocation(String finalDropOffLocation) {
        this.finalDropOffLocation = finalDropOffLocation;
    }

    public LocalDateTime getFinalDropOffTime() {
        return this.finalDropOffTime;
    }

    public void setFinalDropOffTime(LocalDateTime finalDropOffTime) {
        this.finalDropOffTime = finalDropOffTime;
    }

    public Integer getFinalPrice() {
        return this.finalPrice;
    }

    public void setFinalPrice(Integer finalPrice) {
        this.finalPrice = finalPrice;
    }
}
