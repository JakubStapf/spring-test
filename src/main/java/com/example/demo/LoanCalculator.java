package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class LoanCalculator {
    private static double calculateFixedInstallment(double loanAmount, double oprocentowanie,
                                          int liczbaRat) {
        double w = 1 + (oprocentowanie / 12);
        return (loanAmount * oprocentowanie) / (12 * (1 + Math.pow(w, -liczbaRat)));
    }
}
