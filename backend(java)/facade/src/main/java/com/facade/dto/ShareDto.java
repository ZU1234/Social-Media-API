package com.facade.dto;

import com.core.model.enums.Status;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.util.Date;
import java.util.UUID;

public class ShareDto {
    private UUID userPk;
    private String description;
    private Date startDate;

    public UUID getUserPk() {
        return userPk;
    }

    public void setUserPk(UUID userPk) {
        this.userPk = userPk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
