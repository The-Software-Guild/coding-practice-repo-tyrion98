/**
 *@author DeJone' Williamson
 *email: tyrionw@gmail..com
 *date: 7/26/2021
 *purpose: My first Hello World program in an IDE
 */

// import scanner
import java.util.Scanner;


public class Factorizer {
    
    
    public static void main(String[] args){
    
        // variable definitions
        int factorNum = 0, i = 0, sum = 0;
        int[] factors;
        String f = "";
        // create a scanner
        Scanner sc = new Scanner(System.in);
        
        // ask the user for the number the program will factor
        System.out.println("What number would you like to factor? ");
        // get input
        factorNum = sc.nextInt();
        
        // call the function that finds the factor of the given number
        factors = findFactor(factorNum);
        // join the list
        while(factors[i] != 0){
        
            f += factors[i];
            sum += factors[i];
            f += " ";
            
            i++;
        
        }
        // 6 is included in the factor list so have to subtract it from the sum
        sum -= factorNum;
        
        System.out.println("The factors of " + factorNum + " are " + f);
        System.out.println(factorNum + " has " + i + " factors.");
        
        if(factorNum == sum){
        
            System.out.println(factorNum + " is a perfect number");
        } else{
        
            System.out.println(factorNum + " is not a perfect number");
        }
        
        if(i <= 2){
        
            System.out.println(factorNum + " is a prime number");
        } else{
        
            System.out.println(factorNum + " is not a prime number");
        }

       
    }
    
    /* finds the factors of the given parameter
    returns a int array */
    public static int[] findFactor(int factorNum){
    
        // variable definitions
        int i, j = 0;
        int[] factors = new int[500];
        
        // for loop
        for(i = 1; i < factorNum+1; i++){
        
            // see if its a factor of factorNum
            if(factorNum % i == 0){
                // its a factor so store in list
                factors[j] = i;
                
                j++;
            }
  
        }
       
        // return factors
        return factors;
    }
    
    
}
