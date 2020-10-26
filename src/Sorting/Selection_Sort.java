/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Sachin Patel
 */
public class Selection_Sort {
    public static void main(String[] args) {
       int []arr ={15,9,7,13,12,16,4,18,11};
        System.out.print("Arrays element are :\n");
        for(int k:arr)
        {
            System.out.print(k +" ");
        }
        int min,temp=0;
        for(int i=0;i<arr.length;i++)
        {
            min=i; 
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                 min=j;    
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
                 
        }
        System.out.println(" \nSorted elements are :\n");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
