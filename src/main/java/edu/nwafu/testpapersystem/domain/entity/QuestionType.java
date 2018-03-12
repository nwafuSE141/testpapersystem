package edu.nwafu.testpapersystem.domain.entity;

import java.io.Serializable;

public class QuestionType implements Serializable {
    
    private Integer id;

    
    private String name;

    
    private String table;

    
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

    
    public String getTable() {
        return table;
    }

    
    public void setTable(String table) {
        this.table = table == null ? null : table.trim();
    }
}