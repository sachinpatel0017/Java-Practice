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
public class Quick_Sort {
    public static int partition(int []arr,int low,int high)
    {
        int pivot = arr[(low+high)/2];
        while(low<=high)
        {
            while(arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                int temp = arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    public static void quickSortRecursion(int []arr,int low,int high)
    {
        int pi = partition(arr,low,high);
        if(low<pi-1)
        {
            quickSortRecursion(arr,low,pi-1);
        }
        if(pi<high)
        {
            quickSortRecursion(arr,pi,high);
        }
    }
    public static void printArray(int []arr)
    {
        System.out.println("\nSorted array elements are :\n");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int []arr ={15,9,7,13,12,16,4,18,11};
        System.out.print("Arrays element are :\n");
        for(int k:arr)
        {
            System.out.print(k +" ");
        }
        int leng = arr.length;
     
        quickSortRecursion(arr, 0, leng-1);
        printArray(arr);
    }
}
