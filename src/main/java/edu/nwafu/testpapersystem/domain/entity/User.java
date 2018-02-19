package edu.nwafu.testpapersystem.domain.entity;

import java.io.Serializable;

public class User implements Serializable {
    
    private Integer id;

    
    private String name;

    
    private Integer roleId;

    
    private String passwor;

    
    private String email;

    
    private String phone;

    
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

    
    public Integer getRoleId() {
        return roleId;
    }

    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    
    public String getPasswor() {
        return passwor;
    }

    
    public void setPasswor(String passwor) {
        this.passwor = passwor == null ? null : passwor.trim();
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    
    public String getPhone() {
        return phone;
    }

    
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}