/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taxapplication;

/**
 *
 * @author User
 */
public class TaxFunction {
    public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
        if (numberOfMonthWorking > 12) {
            throw new IllegalArgumentException("More than 12 month working per year");
        }

        int childrenCount = numberOfChildren > 3 ? TaxConstants.MAX_CHILDREN : numberOfChildren;

        int yearlyIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
        int nonTaxable = TaxConstants.NOT_MARRIED_TAX;

        if (isMarried) {
            nonTaxable += TaxConstants.CHILD_TAX + (childrenCount * TaxConstants.CHILD_TAX);
        }

        int taxableIncome = yearlyIncome - deductible - nonTaxable;
        return Math.max(0, (int)Math.round(taxableIncome * TaxConstants.TAX_RATE));
    }
}
