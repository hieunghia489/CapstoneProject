package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "payment_id")
    private Integer paymentId;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "payment_content")
    private String paymentContent;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    public Integer getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentContent() {
        return this.paymentContent;
    }

    public void setPaymentContent(String paymentContent) {
        this.paymentContent = paymentContent;
    }

    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
