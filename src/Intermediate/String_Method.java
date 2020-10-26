/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intermediate;

/**
 *
 * @author Sachin Patel
 */
public class String_Method {
    public static void main(String[] args) {
        String name="SachinChandravanshi";
        String First_name="Sachin";
        String Last_name="Chandravanshi";
        System.out.println(name.indexOf('c')+ " is the index no. of 'c' in SachinChandravanshi");
        System.out.println(name.indexOf('i',5)+ " is the index no of 'i' after 5 letter in SachinChandravanshi");
        System.out.println(First_name.replace("Sachin", "Shubham") + " Sachin is replace by Shubham");
        System.out.println(First_name + Last_name);
    }
}
