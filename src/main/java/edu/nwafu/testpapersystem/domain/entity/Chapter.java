package edu.nwafu.testpapersystem.domain.entity;

import java.io.Serializable;

public class Chapter implements Serializable {
    
    private Integer id;

    
    private Integer courseId;

    
    private String name;

    
    private static final long serialVersionUID = 1L;

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Integer getCourseId() {
        return courseId;
    }

    
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}