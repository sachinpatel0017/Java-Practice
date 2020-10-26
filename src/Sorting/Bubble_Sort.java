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
public class Bubble_Sort {
    public static void main(String[] args) {
        int []a ={15,9,7,13,12,16,4,18,11};
        System.out.print("Arrays element are :\n");
        for(int k:a)
        {
            System.out.print(k +" ");
        }
        int temp;
        for(int i=0;i<a.length;i++)
        {
            int flag =0;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
            
        }
        System.out.println("\nSorted elements are :\n");
        for(int i=0;i<a.length;i++)
            {
                System.out.print(+a[i]+" ");
            }
    }
  
}
