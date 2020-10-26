/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
public class Second_Largest {
    public static void main(String[] args) {
   int a[] = {1,5,8,3,2,4,6,7};
   int temp;
   for(int i=0;i<a.length;i++) {
       for(int j=i+1;j<a.length;j++){
           if(a[i]<a[j]){
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
       }
   }      
    }
        System.out.println("Second Largest element is : \n" +a[1]);
    }
}
