package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @Column(name = "transaction_id")
    private Integer transactionId;

    @Column(name = "booking_id")
    private Integer bookingId;

    @Column(name = "transaction_date")
    private LocalDateTime transactionDate;

    @Column(name = "total_payment")
    private Integer totalPayment;

    public Integer getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Integer getTotalPayment() {
        return this.totalPayment;
    }

    public void setTotalPayment(Integer totalPayment) {
        this.totalPayment = totalPayment;
    }
}
