package com.example.api.socialnetwork.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "[relation]")

public class Relation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long relationId;

    public Long getRelationId() {
        return relationId;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getRelationStatus() {
        return relationStatus;
    }

    public void setRelationStatus(String relationStatus) {
        this.relationStatus = relationStatus;
    }

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String relationStatus;


}
