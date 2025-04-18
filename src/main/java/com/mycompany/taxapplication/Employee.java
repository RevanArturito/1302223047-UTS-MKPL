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
	private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;
	private boolean isForeigner;     
	private Gender gender; 
	
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	
	
	public Employee(String employeeId, Biodata biodata, int yearJoined, int monthJoined, int dayJoined,Spouse spouse, boolean isForeigner, Gender gender) {
            this.employeeId = employeeId;
            this.biodata = biodata;
            this.spouse = spouse;
            this.yearJoined = yearJoined;
            this.monthJoined = monthJoined;
            this.dayJoined = dayJoined;
            this.isForeigner = isForeigner;
            this.gender = gender;
	}
	
	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	
//	public int getAnnualIncomeTax() {
//		
//		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
//		LocalDate date = LocalDate.now();
//		
//		if (date.getYear() == yearJoined) {
//			monthWorkingInYear = date.getMonthValue() - monthJoined;
//		}else {
//			monthWorkingInYear = 12;
//		}
//		
//		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, this.spouse.getSpouseIdNumber().equals(""), childIdNumbers.size());
//	}
}