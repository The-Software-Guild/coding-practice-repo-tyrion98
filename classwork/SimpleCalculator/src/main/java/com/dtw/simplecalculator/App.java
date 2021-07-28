/**
 *@author DeJone' Williamson
 *email: tyrionw@gmail..com
 *date: 7/26/2021
 *purpose: My first Hello World program in an IDE
 */

package com.dtw.simplecalculator;

// imports
import java.util.Scanner;

// application class
public class App {
    

    // UI print
    public void printUI(){
    
        System.out.println("Calculator menu\n----------------------");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
         
    }
    
    // get user input
    public int getUserInput(){
    
        // user choice
        int userChoice;
        int x, y;
        Scanner sc = new Scanner(System.in);
        
        // ask for input
        userChoice = sc.nextInt();
        // check the choice
        if(userChoice == 5){
        
            System.out.println("Thank you for using my calculator!");
            System.exit(0);
        }
        
        // ask for two more numbers
        System.out.println("What's the first number you would like to use?");
        x = sc.nextInt();
        System.out.println("Second?");
        y = sc.nextInt();
        
        // call perform operation function
        this.performOperation(userChoice, x, y);
        
        // return 
        return userChoice;

    }
    
    // perform operation given the user input
    public void performOperation(int userInput, int numX, int numY){
    
        // new calculator object
        SimpleCalculator calc = new SimpleCalculator();
        System.out.print("Answer: ");
        // switch statement
        switch(userInput){
            
            // 1 - add
            case 1:
                System.out.println(calc.add(numX, numY));
                break;
                
            // 2 - subtract
            case 2:

                System.out.println(calc.subtract(numX, numY));
                break;
              
            // 3 - multiply
            case 3:

                System.out.println(calc.multiply(numX, numY));
                break;
                
            // 4 - divide
            case 4:

                System.out.println(calc.divide(numX, numY));
                break;           
        
        }
    
    }
    
}
