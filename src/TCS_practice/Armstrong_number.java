/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TCS_practice;

import java.util.Scanner;

/**
 *
 * @author Sachin Patel
 */
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter min range: ");
        int min = kb.nextInt();
        System.out.println("Enter max range: ");
        int max = kb.nextInt();
        System.out.println("Armstrong number in given range is : ");
        for(int num=min;num<=max;num++){
        int temp=num;
        int r;
        int sum=0;
        while(temp!=0)
        {
            r=temp%10;
            temp=temp/10;
            sum=sum+(r*r*r);
            if(sum==num)
            System.out.println(num);
        }
        
    }
        
  }
}
