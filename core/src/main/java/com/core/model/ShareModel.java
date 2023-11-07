package com.core.model;

import com.core.model.enums.Status;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Table("shares")
public class ShareModel implements Serializable {
    @Column("pk")
    @PrimaryKey
    private UUID pk;
    @Column("user_pk")
    private UUID userPk;
    @Column("description")
    private String description;
    @Column("startDate")
    private Date startDate;
    @Column("status")
    private Status status;

    public UUID getPk() {
        return pk;
    }

    public void setPk(UUID pk) {
        this.pk = pk;
    }

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
