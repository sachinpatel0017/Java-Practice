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
public class Palindrome {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number to check Palindrome : \n");
        int num = kb.nextInt();
        int org_num=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_num==rev)
        System.out.println("Enter number is Palindrome " + rev);
        else
            System.out.println("nOT pALINDROME");
    }
}
