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
public class Strong_number {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter min range : ");
        int min = kb.nextInt();
        System.out.println("Enter max range : ");
        int max = kb.nextInt();
        int i,f,temp,sum,r;
        for(int num=min;num<=max;num++){
            temp = num;
            sum=0;
            while(temp!=0){
            i=1;
            f=1;
            r=temp%10;
            while(i<=r){
                f=f*i;
                i++;
                       }
            sum=sum+f;
            temp=temp/10;
            }
            if(sum==num)
                System.out.println(num);
        }
    }
}
