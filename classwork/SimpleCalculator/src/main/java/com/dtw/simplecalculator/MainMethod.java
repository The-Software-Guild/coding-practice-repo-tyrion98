/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtw.simplecalculator;

public class MainMethod {
    
    // main method that calls application's functions
    public static void main(String[] args){
    
        // variables
            int userInput = 0;
            int userNumOne, userNumTwo;
        while(userInput != 5){

            // call methods
            App app = new App();
            app.printUI();
            // ask for user input
            userInput = app.getUserInput();
            
        }
  
    }
}
