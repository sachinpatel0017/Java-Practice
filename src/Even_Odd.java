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
public class Even_Odd {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter integer for check even or odd : \n");
        int a = kb.nextInt();
        if (a%2==0)
            System.out.println("Enter integer is even");
        else
            System.out.println("Enter integer is odd");
    }
}
