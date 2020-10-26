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
public class LCM {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter 1st number : \n");
        int a = kb.nextInt();
         System.out.println("Enter 2nd number : \n");
        int b = kb.nextInt();
        int x = a;
        int y = b;
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        int gcd = b;
        System.out.println("GCD or HCF of given numbers is :\n"+gcd);
        int LCM = x*y/gcd;
        System.out.println("LCM of given numbers is :\n"+LCM);
    }
}
