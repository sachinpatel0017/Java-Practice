
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
public class Print_Unique_Digit {
    //Method to print unique digit numbers in range from l to r.
  static void printUnique(int l, int r)
  {
    
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
           
              System.out.print(i+ " ");
      }
     
    
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
