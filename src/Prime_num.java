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
public class Prime_num {
    public static void main(String[] args) {
        int temp;
        boolean isPrime= true;
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter any number : \n");
        int num=kb.nextInt();
        kb.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
            if(isPrime)
                System.out.println(num + " is a prime number");
            else
                System.out.println(num + " is not prime number");
        
    }
}
