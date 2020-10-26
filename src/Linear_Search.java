
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
public class Linear_Search {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number of element :\n");
        int num = kb.nextInt();
        System.out.println("Enter elements : \n");
        int arr[] = new int[num];
        for(int i=0;i<=arr.length-1;i++)
            arr[i] = kb.nextInt();
        System.out.println("Enter value to search :\n");
        int search = kb.nextInt();
        for(int j =0;j<=arr.length-1;j++)
            if(arr[j]==search)
                System.out.println(+arr[j]+" is present at index : "+j);
    
       
    }
}
