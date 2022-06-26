package com.example.credit;

public class CreditPaymentService {


    public double calculate( double interestRate, int numberOfPayments, int loanAmount ) {

        double monthlyInterestRate = (interestRate / 12) / 100;

        double a = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments) ;
        double b = Math.pow(1 + monthlyInterestRate, numberOfPayments )  - 1;
        double annuityRatio = a/b;

        double monthlyPayment = loanAmount * annuityRatio;


        return monthlyPayment;
    }
}