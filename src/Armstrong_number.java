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
public class Armstrong_number {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any number : \n");
        int num = kb.nextInt();
        int t1=num; int leng=0;
        while(t1!=0){
            leng=leng+1;
            t1=t1/10;
        }
        int t2=num; int rem; int arm=0;
        while(t2!=0)
        {
            rem=t2%10;
            int mult=1;
            for(int i= 1;i<=leng;i++){
                mult=mult*rem;
            }
            arm=arm+mult;
            t2=t2/10;
        }
        if(arm==num)
        {
            System.out.println("Enter number is Armstrong...");
        }
        else
        
                System.out.println("Not ARMstrong...");
    }
}
