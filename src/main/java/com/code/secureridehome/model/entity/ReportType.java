package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "report_type")
public class ReportType {
    @Id
    @Column(name = "report_type_id")
    private Integer reportTypeId;

    @Column(name = "report_name")
    private String reportName;

    @Column(name = "description")
    private String description;

    public Integer getReportTypeId() {
        return this.reportTypeId;
    }

    public void setReportTypeId(Integer reportTypeId) {
        this.reportTypeId = reportTypeId;
    }

    public String getReportName() {
        return this.reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
