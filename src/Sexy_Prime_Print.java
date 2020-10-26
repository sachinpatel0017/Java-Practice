/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
import java.util.Arrays; 
import java.util.Collections; 
import java.util.Scanner;
public class Sexy_Prime_Print {
    // Java code to print sexy prime in a range.   
    // Print the sexy prime in a range 
    public static void sexyprime(int l, int r)  
    { 
        // Sieve Of Eratosthenes for generating 
        // prime number. 
        boolean [] prime= new boolean[r + 1]; 
          
        // memset(prime, true, sizeof(prime)); 
        Arrays.fill(prime, true); 
          
  
        for (int p = 2; p * p <= r; p++) 
        { 
            // If prime[p] is not changed,  
            // then it is a prime 
            if (prime[p] == true)  
            { 
                // Update all multiples of p 
                for (int i = p * 2; i <= r; i += p) 
                    prime[i] = false; 
            } 
        } 
  
        // From L to R - 6, checking if i, 
        // i + 6 are prime or not. 
        for (int i = l; i <= r - 6; i++)  
            if (prime[i] && prime[i + 6]) 
                System.out.print( "(" + i + ", "
                        + (i + 6) + ") ");  
    } 
  
    // Driver program to test above methods  
    public static void main(String[] args) 
    { 
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter min range \n");
        int L = kb.nextInt();
        System.out.println("Enter max range \n");
        int R = kb.nextInt(); 
        sexyprime(L, R); 
    } 
} 
  

