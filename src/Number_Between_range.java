
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
public class Number_Between_range {
    public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);
        System.out.println("Enter number of element :\n");
        int num = kb.nextInt();
        System.out.println("Enter min range :\n");
        int min = kb.nextInt();
        System.out.println("Enter max range :\n");
        int max = kb.nextInt();
        
        int arr[] = new int[num];
        System.out.println("Enter elements :\n");
        for(int i=0;i<=arr.length-1;i++)
            arr[i]=kb.nextInt();
        System.out.println("Element in given range \n ");
        for(int element : arr)
        {
            if(element>=min && element<=max)
                System.out.print(" " +element);
        }
    }
  
}
