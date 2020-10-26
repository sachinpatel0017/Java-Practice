/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Star_Pattern;

import java.util.Scanner;

/**
 *
 * @author Sachin Patel
 */
public class Full_Pyramid {
    public static void main(String[] args) 
    {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :\n");
        n = sc.nextInt();
        for(i = 1; i <= n; ++i)
        {
           for(j=n;j>=1;j--)
           {
               if(j>i)
               {
                   System.out.print(" ");
               }
               else
                   System.out.print(" *");
           }
            System.out.println();
        }
    }
}
