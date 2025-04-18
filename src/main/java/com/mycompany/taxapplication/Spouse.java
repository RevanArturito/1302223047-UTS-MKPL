/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxapplication;

import java.util.List;

/**
 *
 * @author User
 */
public class Spouse {
    private String spouseName;
    private String spouseIdNumber;
    private List<Child> child;

    public Spouse(String spouseName, String spouseIdNumber, List<Child> child) {
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;
        this.child = child;
    }
    
    public void addChild(Child child) {
        this.child.add(child);
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    public void setSpouseIdNumber(String spouseIdNumber) {
        this.spouseIdNumber = spouseIdNumber;
    }
    
    public int getChildNumber() {
        return child.size();
    }
    
    
    
}
