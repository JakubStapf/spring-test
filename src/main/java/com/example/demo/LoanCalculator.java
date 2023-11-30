package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class LoanCalculator {
    private static double calculateFixedInstallment(double kwotaKredytu, double oprocentowanie,
                                          int liczbaRat) {
        double q = 1 + (oprocentowanie / 12);
        return (kwotaKredytu * oprocentowanie) / (12 * (1 + Math.pow(q, -liczbaRat)));
    }
}
