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
public class Swap_num {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //System.out.println("Enter 1st number :\n");
        int a = kb.nextInt();
        //System.out.println("Enter 2nd number :\n");
        int b = kb.nextInt();
        int temp;
        temp=b;
        b=a;
        System.out.println("Swapping...\n" +temp +b);
    }
}
