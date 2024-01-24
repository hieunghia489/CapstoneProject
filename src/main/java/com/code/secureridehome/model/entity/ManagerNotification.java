package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "manager_notification")
public class ManagerNotification {
    @Id
    @Column(name = "notification_id")
    private Integer notificationId;

    @Column(name = "manager_id")
    private Integer managerId;

    @Column(name = "notification_content")
    private String notificationContent;

    @Column(name = "notification_title")
    private String notificationTitle;

    @Column(name = "notification_type_id")
    private Integer notificationTypeId;

    @Column(name = "is_read")
    private Byte isRead;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    public Integer getNotificationId() {
        return this.notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public Integer getManagerId() {
        return this.managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getNotificationContent() {
        return this.notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public String getNotificationTitle() {
        return this.notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public Integer getNotificationTypeId() {
        return this.notificationTypeId;
    }

    public void setNotificationTypeId(Integer notificationTypeId) {
        this.notificationTypeId = notificationTypeId;
    }

    public Byte getIsRead() {
        return this.isRead;
    }

    public void setIsRead(Byte isRead) {
        this.isRead = isRead;
    }

    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
