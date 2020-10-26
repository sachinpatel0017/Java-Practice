
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
public class Automorphic {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = kb.nextInt();
        int mult = num*num;
        int r = mult%10;
        mult=mult/10;
        int re = num%10;
        num=num/10;
        if(r==re)
            System.out.println("Yes it is automorphic number ");
        else
            System.out.println("Its not automorphic number ");
    }
}
