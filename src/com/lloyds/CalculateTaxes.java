package com.lloyds;

public class CalculateTaxes {
    public static double calculateTaxes(double salary) {
        double totalTax = 0;
        double twentyPercent = 2999.8, fifteenPercent = 1499.85, tenPercent = 4999;

        if (salary > 15000) {
            totalTax += ((20000 - salary) * 0.1);
        }
        if (salary > 20000) {
            totalTax += ((30000 - salary) * 0.15);
            totalTax += tenPercent;
        }
        if (salary > 30000) {
            totalTax += ((45000 - salary) * 0.2);
            totalTax = totalTax + fifteenPercent + tenPercent;
        }
        if (salary > 45000) {
            totalTax += ((salary - 45000) * 0.25);
            totalTax = totalTax + twentyPercent + fifteenPercent + tenPercent;
        }

        return Math.round(totalTax * 100.0) / 100.0;
    }
}
