
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */

public class Largest_Smallest_Array {
    public static void main(String[] args) {
        int a[] = {4,3,2,7,5,1,6};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            else if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Entered elemnts are :\n " +Arrays.toString(a));
        System.out.println("\n Maximum or largest element is :\n"+max);
        System.out.println("\n Minimum or Smallest element is : \n" +min);
    }
}
