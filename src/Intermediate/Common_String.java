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
public class Common_String {
    public static void main(String[] args) {
        String []words = {"funk","chunk","ferry","baconator"};
        //StartsWith
        for(String w:words){
            if(w.startsWith("f"))
                System.out.println(w +" Starts with f");
        }
        //EndsWith
                for(String w:words){
            if(w.endsWith("k"))
                System.out.println(w +" ends with k");
        }
    }
}
