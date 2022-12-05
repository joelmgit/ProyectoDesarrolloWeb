/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author joelm
 */
@Entity
@Table(name = "statistics_user")
public class UserStats implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int relativeCount;
    private String roleName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getRelativeCount() {
        return relativeCount;
    }

    public void setRelativeCount(int relativeCount) {
        this.relativeCount = relativeCount;
    }

    public String getRoleName() {
        if(roleName.equals("ADMIN")){
            return "Administrador";
        }else{
            return "Usuario";
        }
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    
}
