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
public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a binary number : \n");
        int a = kb.nextInt();
        int t = a;
        int i =0,d=0;
        while(t>0)
        {
         int r = t%10;
         t = t/10;
         d = d+r*(int)Math.pow(2, i++);
        }
        System.out.println("Decimal conversion of "+a+" is "+d);
    }
}
