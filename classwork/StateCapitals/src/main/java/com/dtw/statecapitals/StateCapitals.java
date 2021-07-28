/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dtw.statecapitals;

// import
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class StateCapitals {
    
    // hashmap,  key - string, value - string
    private Map<String, String> states;
    
    // constructor
    StateCapitals(){
    
        this.states = new HashMap<>();
    
    }
    
    // add states to hashmap
    public void addStates(){
    
        this.states.put("Virginia", "Richmond");
        this.states.put("Maryland", "Baltimore");
        this.states.put("Alabama", "Montgomery");
        this.states.put("Alaska", "Juneau");
        this.states.put("Arizona", "Phoenix");
    
    }
    
    // print states to screen
    public void printStates(){
    
        System.out.println("STATES:");
        System.out.println("=======");
        
        Set<String> keys = this.states.keySet();
          
        for(String state: keys){
        
            System.out.println(state);
        
        }
        System.out.println();
    
    }
    
    // print capitals to screen
    public void printCapitals(){
    
        System.out.println("CAPITALS:");
        System.out.println("========");
        
        Set<String> keys = this.states.keySet();
          
        for(String state: keys){
        
            System.out.println(this.states.get(state));
        
        }
        System.out.println();
    
    }
    
    // print states and capitals
    public void printBoth(){
    
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("=====================");
        
        Set<String> keys = this.states.keySet();
          
        for(String state: keys){
        
            System.out.println(state + " - " +  this.states.get(state));
        
        }
        System.out.println();
    
    }
    
    // main public
    public static void main(String[] args){
    
        StateCapitals sc = new StateCapitals();
        
        sc.addStates();
        sc.printStates();
        sc.printCapitals();
        sc.printBoth();
    
    
    }
}
