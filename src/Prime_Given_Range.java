
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
public class Prime_Given_Range {
    public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);
        System.out.println("Enter min range :\n");
        int min = kb.nextInt();
        System.out.println("Enter max range :\n");
        int max = kb.nextInt();
        
        while (min < max)
       {       
        int flag=0;   
        for(int i = 2; i <= min/2; ++i)
        {
            if(min % i == 0)
            {
                flag = 1;
                break;
             }
        }
            if (flag == 0)
        System.out.print(min + " ");
            ++min;
        }
    }
  
}
