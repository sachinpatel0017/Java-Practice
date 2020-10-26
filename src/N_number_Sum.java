/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
public class N_number_Sum {
    public static void main(String[] args) {
        int i,s=0;
        for(i=0;i<args.length;i++)
        {
            s = s +Integer.parseInt(args[i]);
        }
        System.out.println("Sum =" +s);
    }
}
