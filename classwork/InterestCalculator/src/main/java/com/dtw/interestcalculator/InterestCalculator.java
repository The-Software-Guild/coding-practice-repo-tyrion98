/**
 *@author DeJone' Williamson
 *email: tyrionw@gmail..com
 *date: 7/26/2021
 *purpose: My first Hello World program in an IDE
 */

package com.dtw.interestcalculator;

// import scanner
import java.util.Scanner;

public class InterestCalculator {
    
    public static void main(String[] args){
    
        // variable declarations
        Scanner sc = new Scanner(System.in);
        int invest, years, rate;
        
        
        // ask for input
        System.out.println("How much do you want to invest? ");
        invest = sc.nextInt();
        System.out.println("How many years are investing? ");
        years = sc.nextInt();
        System.out.println("What is the annual interest rate % growth? ");
        rate = sc.nextInt();
        
        System.out.println("\n");
        System.out.println("Calculating...");
        
        
        // main function for the calculating
        calculate(invest, years, rate);
        
    
    }
    
    // calculates the interest
    public static void calculate(int invest, int years, int rate){
    
        int year;
        double money = invest;
        double moneyFormat = 0.0;
        double c = 0.0;
        double newAmt = 0.0, newBal = 0.0, earned = 0.0;
        double quarterRate;
        // for loop
        for(year = 1; year < years + 1; year++){
        
            System.out.println("Year " + year + ":");
            moneyFormat = Math.round(money * 100) / 100;
            System.out.println("Began with $" + moneyFormat);
            
            c = money;
            // issue with formula will fix later
            for(int j = 0; j <= 4; j++){
            
                quarterRate = rate/4;
                newAmt = money * (1 + (quarterRate/ 100));
                // earned += (newAmt - money);
                money = newAmt;

            }
            
            newBal = money;
            earned = newBal - c;
            earned = Math.round(earned * 100) / 100;
            newBal = Math.round(newBal * 100) / 100;
            System.out.println("Earned: $" + earned);
            System.out.println("Ended with: $" + newBal);
            
            
            // for a cleaner look
            System.out.println("\n");
            
            
            
        }
    
    
    }
    
}
