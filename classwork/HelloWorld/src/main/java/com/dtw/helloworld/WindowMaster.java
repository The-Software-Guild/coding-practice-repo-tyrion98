/**
 *@author DeJone' Williamson
 *email: tyrionw@gmail..com
 *date: 7/26/2021
 *purpose: My first Hello World program in an IDE
 */


package com.dtw.helloworld; 
// import scanner library
import java.util.Scanner;


public class WindowMaster {
    public static void main(String[] args) {
        
        // variable declarations
        float height, width;
        String stringHeight, stringWidth;
        float areaOfWindow, cost, perimeterOfWindow;

        // create a scanner
        Scanner sc = new Scanner(System.in);
        
        
        // ask for input from the user
        System.out.println("Please enter the window height: ");
        stringHeight = sc.nextLine();
        System.out.println("Please enter the window width: ");
        stringWidth = sc.nextLine();
        
        
        // convert the strings to numbers
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // calculate the area of the window
        areaOfWindow = height * width;
        
        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        // calculate the cost 
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        
        // display the results to the user 
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
    
    
}
