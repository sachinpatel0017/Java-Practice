/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */

public class Fabonacci_num {
    public static void main(String[] args) {
        int a=0,b=1,c = 0;
        for(int i=1;i<=10;i++)
        { c=a+b;
        System.out.println(+c);
            a=b;
            b=c;}
        
    }
}
