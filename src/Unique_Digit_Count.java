/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
 

import java.util.Scanner;

public class Unique_Digit_Count {
    static void printUnique(int l, int r)
  {
    int count =0;
      //Start traversing the numbers..
      for(int i=l;i<=r;i++)
      {
          int num = i;
          boolean visited[]=new boolean[10];
          //Find digit and maintain its hash
          while(num!=0)
          {
              //if digit occurs more than 1 time then break
              if(visited[num%10])
                  break;
         
              visited[num%10]=true;
              num=num/10;
          }
          //num will be 0 only when above loop
          //doesn't get break means the number is unique so print it.
          if(num==0)
           
             count++;
      }
      if(count>0)
          System.out.println("\nCount of unique number is :\n"+count);
      else
          System.out.println("no unique number");
      
  }
  // Driver method
    public static void main(String[] args) {
        //int l=10,r=15;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter min range: \n");
        int l = kb.nextInt();
        System.out.println("Enter max range: \n");
        int r = kb.nextInt();
        printUnique(l,r);
    }
}
