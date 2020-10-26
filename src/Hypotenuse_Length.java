
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
public class Hypotenuse_Length {
    public static void main(String[] args) {
        double h,b,p;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter base of the right angle triangle : \n");
        b = kb.nextDouble();
         System.out.println("Enter height of the right angle triangle : \n");
        p = kb.nextDouble();
        h = Math.sqrt((b*b)+(p*p));
        System.out.println("Hypotaneous of right angle triangle is : \n" +h);
    }
  
}
