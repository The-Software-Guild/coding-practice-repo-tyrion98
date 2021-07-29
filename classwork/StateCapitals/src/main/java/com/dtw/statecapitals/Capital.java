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
import java.util.Set;
import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner;



public class Capital{

    // fields
    private String name;
    private String population;
    private String mileage;

    // constructor
    Capital(String name, String population, String mileage){

        this.name = name;
        this.population = population;
        this.mileage = mileage;


    }

    // get name
    public String getName(){

        return this.name;
    }

    // get population
    public String getPopulation(){

        return this.population;
    }

    // get mileage methods
    public String getMileage(){

        return this.mileage;
    }

}

