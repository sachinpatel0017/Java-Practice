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
public class Perfect_number_range {
    public static void main(String[] args) {
       int n,i,sum;  
       int min,max; 
       Scanner kb = new Scanner(System.in);
       System.out.println("Enter the minimum range: ");
       min=kb.nextInt();
       System.out.println("Enter the maximum range: ");
       max=kb.nextInt();
 
      System.out.println("Perfect number in given range is: ");
 
      for(n=min;n<=max;n++)
      {     
       i=1;  
       sum = 0; 
 
        while(i<n)
        {     
            if(n%i==0) 
             sum=sum+i;  
             i++;    
        } 
 
         if(sum==n) 
              System.out.println(n);
      } 
 
   
    
    }
}
