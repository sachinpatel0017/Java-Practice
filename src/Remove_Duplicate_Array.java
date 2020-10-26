
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
public class Remove_Duplicate_Array {
    static int removeDuplicate(int arr[],int n)
    {
        if(n==0||n==1)
            return n;
        int j = 0;
        for(int i =0;i<n-1;i++)
            if(arr[i]!=arr[i+1])
            arr[j++]=arr[i];
        arr[j++]=arr[n-1];
        return j;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number of values : \n");
        int num = kb.nextInt();
        int []arr=new int[num];
        System.out.println("Enter values :\n");
        for(int k =0;k<arr.length;k++)
            arr[k]=kb.nextInt();
        //int arr[] = {1,2,2,3,4,4,4,5,5};
        System.out.println("After removing duplicate element :\n");
        int n=arr.length;
        n=removeDuplicate(arr,n);
        for(int i=0;i<n;i++)
            System.out.print(arr[i] +" ");
    }
}
