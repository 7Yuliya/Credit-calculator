package com.example.credit;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();
        double interestRate = 9.99;
        int numberOfPayments = 12;
        int loanAmount = 1_000_000;

        double myMonthlyPayment = service.calculate(interestRate, numberOfPayments, loanAmount );

        System.out.println( "Ежемесячный платёж:" + myMonthlyPayment + "р");
        System.out.println();
        double myMonthlyPayment1 = (service.calculate(9.99, 24, 1_000_000 ));
        System.out.println( "Ежемесячный платёж:" + myMonthlyPayment1 + "р");
        System.out.println();
        double myMonthlyPayment2 = (service.calculate(9.99, 36, 1_000_000 ));
        System.out.println( "Ежемесячный платёж:" + myMonthlyPayment2 + "р");

    }
}
