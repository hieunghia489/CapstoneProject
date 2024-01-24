package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "driver_support")
public class DriverSupport {
    @Id
    @Column(name = "driver_support_id")
    private Integer driverSupportId;

    @Column(name = "driver_id")
    private Integer driverId;

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

    public Integer getDriverSupportId() {
        return this.driverSupportId;
    }

    public void setDriverSupportId(Integer driverSupportId) {
        this.driverSupportId = driverSupportId;
    }

    public Integer getDriverId() {
        return this.driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
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
