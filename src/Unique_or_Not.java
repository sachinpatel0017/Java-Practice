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
public class Unique_or_Not {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any number : \n");
        int n  = kb.nextInt();
        int temp = n;
        int[] a = new int[100];
        int i =0, count =0;
        while(n!=0)
        {
            int num = n%10;
            a[i] = num;
            i++;
            n = n/10;
        }
        for(int j=0; j<=i-1;j++)
        {
            for(int k = j+1;k<=i-1;k++)
            {
                if(a[j]==a[k])
                {
                    count++;
                }
            }
        }
        if(count>0)
        {
            System.out.println("Not Unique Number");
        }
        else
            System.out.println(temp + " is a Unique Number");
        
    }
}
