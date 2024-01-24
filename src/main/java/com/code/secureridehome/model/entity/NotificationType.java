package com.code.secureridehome.model.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification_type")
public class NotificationType {
    @Id
    @Column(name = "notification_type_id")
    private Integer notificationTypeId;

    @Column(name = "notification_type_name")
    private String notificationTypeName;

    public Integer getNotificationTypeId() {
        return this.notificationTypeId;
    }

    public void setNotificationTypeId(Integer notificationTypeId) {
        this.notificationTypeId = notificationTypeId;
    }

    public String getNotificationTypeName() {
        return this.notificationTypeName;
    }

    public void setNotificationTypeName(String notificationTypeName) {
        this.notificationTypeName = notificationTypeName;
    }
}
