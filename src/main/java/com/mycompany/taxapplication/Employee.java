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
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

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
            int monthWorkingInYear;
            LocalDate date = LocalDate.now();
            if (date.getYear() == this.dateJoined.getYear()) {
                monthWorkingInYear = date.getMonthValue() - this.dateJoined.getMonthValue();
            }else {
                monthWorkingInYear = 12;
            }
            return TaxFunction.calculateTax(this.monthSalary.getMonthlySalary(), this.monthSalary.getOtherMonthlyIncome(), monthWorkingInYear, this.monthSalary.getAnnualDeductible(), this.spouse.getSpouseIdNumber().equals(""), this.spouse.getChildNumber());
	}
}