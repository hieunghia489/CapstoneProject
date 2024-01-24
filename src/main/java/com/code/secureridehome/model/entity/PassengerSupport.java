package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "passenger_support")
public class PassengerSupport {
    @Id
    @Column(name = "passenger_support_id")
    private Integer passengerSupportId;

    @Column(name = "passenger_id")
    private Integer passengerId;

    @Column(name = "report_description")
    private String reportDescription;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "report_type_id")
    private Integer reportTypeId;

    @Column(name = "manager_id")
    private Integer managerId;

    @Column(name = "is_handled")
    private Byte isHandled;

    public Integer getPassengerSupportId() {
        return this.passengerSupportId;
    }

    public void setPassengerSupportId(Integer passengerSupportId) {
        this.passengerSupportId = passengerSupportId;
    }

    public Integer getPassengerId() {
        return this.passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public String getReportDescription() {
        return this.reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
    }

    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Integer getReportTypeId() {
        return this.reportTypeId;
    }

    public void setReportTypeId(Integer reportTypeId) {
        this.reportTypeId = reportTypeId;
    }

    public Integer getManagerId() {
        return this.managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Byte getIsHandled() {
        return this.isHandled;
    }

    public void setIsHandled(Byte isHandled) {
        this.isHandled = isHandled;
    }
}
