
import java.util.Iterator;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
public class ExampleTreeSet {
    public static void main(String[] args) {
         
    TreeSet <String> hs=new TreeSet<String>();
hs.add("January");
hs.add("February");
hs.add("March");
hs.add("April");
Iterator it=hs.iterator();
while(it.hasNext())
 {
            String s=(String)it.next();
            System.out.println(s);
 }
    }
    }

