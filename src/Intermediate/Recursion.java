/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intermediate;

import java.util.Scanner;

/**
 *
 * @author Sachin Patel
 */
public class Recursion {
    public static long fact(long n)
    {
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number \n");
        long n = kb.nextLong();
        System.out.println("Factorial of "+n +" is "+fact(n));
    }
}
