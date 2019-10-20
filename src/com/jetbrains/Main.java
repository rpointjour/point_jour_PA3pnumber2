package com.jetbrains;

public class SavingsAccount() // Create method for SavingsAccount
        {

        }

//Constructor method
public class SavingsAccount(double savingBalance)
        {
        this.savingBalance=savingBalance;
        }

// Saving balance
public class double getSavingBalance()
        {
        return this.savingBalance;
        }

// Modify interest rate, and annual interest rate to a new value
public static void modifyInterestRate(double newInterestRate)
        {
        annualInterestRate=newInterestRate;
        }

//Method to calculate monthly interest
public static void calculateMonthlyInterest()
        {
        double monthlyI;
        monthlyI= (double)(this.savingBalance*annualInterestRate/12);
        this.savingBalance+=monthlyI;
        }


public static void main(String[] args) {

        // To test the class designed above
        //Instantiate 2 saving account objects saver1 and saver2
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount (2000.0);
        saver2= new SavingsAccount (3000.0);

        int total = 0;

        //Set the annual interest rate to 4%=0.04
        SavingsAccount.modifyInterestRate (0.04);
        System.out.println("Printing Balance for Saver 1");
        for(int i=0; i<12; i++) {
        //Calculate monthly interest
        saver1.calculateMonthlyInterest();
        //Print out the new balances for both savers
        System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.getSavingBalance()));
        }
        System.out.println("\nPrinting Balance for Saver 2\n");
        for(int i=0; i<12; i++) {
        //Calculate monthly interest
        saver2.calculateMonthlyInterest();
        System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.getSavingBalance()));
        }
        // Interest rate to 5%=0.05
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("After changing annual interest rate to 0.05 Printing Balance for Saver 1");
        for(int i=0; i<12; i++) {
        //Calculate monthly interest
        saver1.calculateMonthlyInterest();
        //Print  new balances for both savers
        System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.getSavingBalance()));
        }
        System.out.println("\nAfter changing annual interest rate to 0.05 Printing Balance for Saver 2\n");
        for(int i=0; i<12; i++) {
        //Calculate monthly interest
        saver2.calculateMonthlyInterest();
        System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.getSavingBalance()));
        }

        }
        }
