/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any number for factorial : \n");
        int a = kb.nextInt();
        int fact = 1;
        for(int i=1;i<=a;i++)
        {
           fact = fact*i; 
        }
        System.out.println("Factorial of the number is :\n" +fact);
    }
}
