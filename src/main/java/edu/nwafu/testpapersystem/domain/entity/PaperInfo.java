package edu.nwafu.testpapersystem.domain.entity;

import java.io.Serializable;

public class PaperInfo implements Serializable {
    
    private Integer id;

    
    private Integer paperId;

    
    private Integer serialNumber;

    
    private Integer typeId;

    
    private Integer questionId;

    
    private static final long serialVersionUID = 1L;

    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Integer getPaperId() {
        return paperId;
    }

    
    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    
    public Integer getSerialNumber() {
        return serialNumber;
    }

    
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    
    public Integer getTypeId() {
        return typeId;
    }

    
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    
    public Integer getQuestionId() {
        return questionId;
    }

    
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}