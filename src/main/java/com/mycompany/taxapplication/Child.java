/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxapplication;

/**
 *
 * @author User
 */
public class Child {
    private String ChildName;
    private String ChildIdNumber;

    public Child(String ChildName, String ChildIdNumber) {
        this.ChildName = ChildName;
        this.ChildIdNumber = ChildIdNumber;
    }

    public String getChildName() {
        return ChildName;
    }

    public void setChildName(String ChildName) {
        this.ChildName = ChildName;
    }

    public String getChildIdNumber() {
        return ChildIdNumber;
    }

    public void setChildIdNumber(String ChildIdNumber) {
        this.ChildIdNumber = ChildIdNumber;
    }
    
    
}
