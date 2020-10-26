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
public class Decimal_Binary {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a decimal number...\n");
        int dec_num = kb.nextInt();
        int quot,i=1,j;
        int bin_num[] =new int[100];
        quot=dec_num;
        while(quot!=0){
            bin_num[i++]=quot%2;
            quot=quot/2;
        }
        System.out.println("Binary number is : \n");
        for(j=i-1;j>0;j--){
            System.out.print(bin_num[j]);
        }
        System.out.println("\n");
        
    }
}