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
public class Perfect_number {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any number : \n");
        int num = kb.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            sum = sum+i;
        }
        if(sum==num)
            System.out.println("Enter number is perfect number...");
        else
            System.out.println("Enter number is not perfect");
    }
}
