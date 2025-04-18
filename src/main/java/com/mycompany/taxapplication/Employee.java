/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxapplication;

/**
 *
 * @author User
 */
import java.time.LocalDate;

public class Employee {

    private String employeeId;
    private Biodata biodata;
    private Spouse spouse;
    private LocalDate dateJoined;
    private MonthSalary monthSalary;
    private boolean isForeigner;
    private Gender gender;

    public Employee(String employeeId, Biodata biodata, LocalDate dateJoined, Spouse spouse, MonthSalary monthSalary, boolean isForeigner, Gender gender) {
        this.employeeId = employeeId;
        this.biodata = biodata;
        this.spouse = spouse;
        this.dateJoined = dateJoined;
        this.monthSalary = monthSalary;
        this.isForeigner = isForeigner;
        this.gender = gender;
    }

    public int getAnnualIncomeTax() {
        int workingMonths = calculateWorkingMonths();
        boolean isMarried = spouse != null;
        int numberOfChildren = spouse.getChildNumber();

        return TaxFunction.calculateTax(
            monthSalary.getMonthlySalary(),
            monthSalary.getOtherMonthlyIncome(),
            workingMonths,
            monthSalary.getAnnualDeductible(),
            isMarried,
            numberOfChildren
        );
    }
    
    private int calculateWorkingMonths() {
        LocalDate now = LocalDate.now();
        if (now.getYear() == dateJoined.getYear()) {
            return now.getMonthValue() - dateJoined.getMonthValue();
        }
        return 12;
    }
}
