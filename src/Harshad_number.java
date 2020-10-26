
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 * Harshad Number is an integer that is divisible by the sum of its digits.
 */
public class Harshad_number {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("min range : ");
        int min = kb.nextInt();
        System.out.println("max range : ");
        int max = kb.nextInt();
        System.out.println("Harshad number in a given range : ");
        for(int num = min;num<=max;num++){
            int r,d,sum=0;
            int temp = num;
            while(temp!=0)
            {
                r=temp%10;
                temp=temp/10;
                sum=sum+r;
            }
            if(num%sum==0)
                System.out.println(num);
        }
    }
  
}
