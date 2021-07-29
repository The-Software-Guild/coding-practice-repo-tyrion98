
/**
 *@author DeJone' Williamson
 *email: tyrionw@gmail.com
 *date: 7/29/2021
 *purpose: practice file IO and hash maps
 */


package com.dtw.statecapitals;

// import
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner;


class StateCapitalsApp{

    public static void main(String[] args){

        // variable declarations
        String fileLine;
        String[] lines;
        String state;
        List<String> stateInfo = new ArrayList<String>();
        int i = 0;    

        try{
            // use data unmarshalling strategy to load capital data in
            File stateCapitalFile = new File("MoreStateCapitals.txt");
            Scanner sc = new Scanner(stateCapitalFile);
            // declare hashmap
            Map<String, Capital> capitals = new HashMap<>();

            // read the file
            while(sc.hasNextLine()){

                // read file with scanner
                fileLine = sc.nextLine();
                // split the line
                lines = fileLine.split("::", 4);
                for(String s : lines){

                    // do this to not get population and mileage
                    stateInfo.add(s);
                    
                }

                // create capital object
                Capital c = new Capital(stateInfo.get(1), stateInfo.get(2), stateInfo.get(3));
                // add to hash map
                capitals.put(stateInfo.get(0), c);
                // clear after
                stateInfo.clear();

            }  

            // print out the number of state capitals that were loaded into the hashmap
            System.out.println(capitals.size() + " STATE/CAPITAL PAIRS LOADED \n=========================");

            // call function that prints out all the state and its capital names 
            printAllSCPairs(capitals);

            // call function that prompts the user to enter the population limit
            popLimit(capitals);

            // close scanner
            sc.close();

        } catch (FileNotFoundException e){

            System.out.println("File does not exist!");
            System.exit(0);

        
        }

    }

    // population prompter
    public static void popLimit(Map<String, Capital> capitals){

        // declarations
        Scanner sc = new Scanner(System.in);
        int userChoice;
        int population;

        // prompt
        System.out.println("\n\n Please enter the lower limit for capital city population: ");
        // store input
        userChoice = sc.nextInt();

        // print
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN " + userChoice+ ":");
        // go through capitals and print out the one with a population greater than or equal to that of the user input
        for(String state : capitals.keySet()){

            // check the population for each state
            population = Integer.parseInt(capitals.get(state).getPopulation());
            // if greater than or equal to the limit print it out 
            if(population >= userChoice){

                System.out.println(state + " - " + (capitals.get(state)).getName() + " | Pop: " 
            + (capitals.get(state)).getPopulation() + " | Area: " + (capitals.get(state)).getMileage() + " sq mi");
            }


        }


    }

    // call function that prints out all the state and its capital names 
    public static void printAllSCPairs(Map<String, Capital> capitals){

        // print out all the keys
        for(String k: capitals.keySet()){

            System.out.println(k + " - " + (capitals.get(k)).getName() + " | Pop: " 
            + (capitals.get(k)).getPopulation() + " | Area: " + (capitals.get(k)).getMileage() + " sq mi");

        }


    }

}