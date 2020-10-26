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
public class Leap_year {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any year...\n");
        int year = kb.nextInt();
        int Leap=year%4;
        if(Leap==0){
            System.out.println("Entered year is,.,.,..LEAP YEAR");
        }
        else
            System.out.println("not Leap year");
    }
}
