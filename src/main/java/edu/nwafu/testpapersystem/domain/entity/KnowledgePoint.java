package edu.nwafu.testpapersystem.domain.entity;

import java.io.Serializable;

public class KnowledgePoint implements Serializable {
    
    private Integer id;

    
    private String name;

    
    private Integer courseId;

    
    private String chapter;

    
    private String remark;

    
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

    
    public String getChapter() {
        return chapter;
    }

    
    public void setChapter(String chapter) {
        this.chapter = chapter == null ? null : chapter.trim();
    }

    
    public String getRemark() {
        return remark;
    }

    
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}