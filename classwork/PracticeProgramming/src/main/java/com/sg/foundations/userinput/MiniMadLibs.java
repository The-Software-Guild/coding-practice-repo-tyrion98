/**
 *@author DeJone' Williamson
 *email: tyrionw@gmail..com
 *date: 7/26/2021
 *purpose: My first Hello World program in an IDE
 */

package com.sg.foundations.userinput;

// import
import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args){
    
    int i, num;
    String input, noun, adj, nounT, adjT, nounP, another, one, verb, verbT;
    
    // print title of game
    System.out.println("Let's play MAD LIBS!");
    
    // create a scanner
    Scanner sc = new Scanner(System.in);
    
    System.out.println("I need a noun: ");
    input = sc.nextLine();
    noun = input;

    System.out.println("Now an adjective: ");
    input = sc.nextLine();
    adj = input;

    System.out.println("Another noun: ");
    input = sc.nextLine();
    nounT = input;

    System.out.println("And a number: ");
    input = sc.nextLine();
    num = Integer.parseInt(input);

            
    System.out.println("Another adjective: ");
    input = sc.nextLine();
    adjT = input;

    System.out.println("A plural noun: ");
    input = sc.nextLine();
    nounP = input;

    System.out.println("Another one: ");
    input = sc.nextLine();
    another = input;
   
    System.out.println("One more: ");
    input = sc.nextLine();
    one = input;
    
    System.out.println("A verb (infinitive form): ");
    input = sc.nextLine();
    verb = input;
    
    System.out.println("Same verb (past participle): ");
    input = sc.nextLine();
    verbT = input;

        
    // print title of game
    System.out.println("*** NOW LETS GET MAD (libs) ***");
    
    System.out.println(noun + ": the "+ adj + " frontier. "+ 
            "These are the voyages of the starship of " + nounT +
            ". Its " + String.valueOf(num) +"-year mission: to explore strange "+
            adjT + " kittens, to seek out " + adjT + " " + another + " and " + 
            adjT + " " + one + ", to boldly " + verb + " where no one has " + verbT +
            " before.");
    
    
    }
    
}
