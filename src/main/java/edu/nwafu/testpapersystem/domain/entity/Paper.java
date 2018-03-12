package edu.nwafu.testpapersystem.domain.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Paper implements Serializable {
    
    private Integer id;

    
    private String name;

    
    private Integer courseId;

    
    private Integer parameterId;

    
    private Integer creatorId;

    
    private Integer reviewerId;

    
    private Timestamp createTime;

    
    private Integer state;

    
    private static final long serialVersionUID = 1L;

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    
    public Integer getCourseId() {
        return courseId;
    }

    
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    
    public Integer getParameterId() {
        return parameterId;
    }

    
    public void setParameterId(Integer parameterId) {
        this.parameterId = parameterId;
    }

    
    public Integer getCreatorId() {
        return creatorId;
    }

    
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    
    public Integer getReviewerId() {
        return reviewerId;
    }

    
    public void setReviewerId(Integer reviewerId) {
        this.reviewerId = reviewerId;
    }

    
    public Timestamp getCreateTime() {
        return createTime;
    }

    
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    
    public Integer getState() {
        return state;
    }

    
    public void setState(Integer state) {
        this.state = state;
    }
}