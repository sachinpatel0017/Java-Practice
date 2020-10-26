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
public class Triangle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number of rows :\n");
        int rows = kb.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
