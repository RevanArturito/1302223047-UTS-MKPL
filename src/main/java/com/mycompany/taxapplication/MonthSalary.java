/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxapplication;

/**
 *
 * @author User
 */
public class MonthSalary {
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;

    public MonthSalary(int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = annualDeductible;
    }
    
    public void setMonthlySalary(int grade, boolean isForeigner) {	
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
    
}
