package edu.nwafu.testpapersystem.domain.entity;

import java.io.Serializable;

public class PaperParameter implements Serializable {
    
    private Integer id;

    
    private Integer paperId;

    
    private Integer typeId;

    
    private Integer questionCount;

    
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

    
    public Integer getTypeId() {
        return typeId;
    }

    
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    
    public Integer getQuestionCount() {
        return questionCount;
    }

    
    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }
}