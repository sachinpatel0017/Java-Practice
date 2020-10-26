/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intermediate;

import java.util.*;

/**
 *
 * @author Sachin Patel
 */
public class array_list {
    public static void main(String []args){
        String []things ={"eggs","lasers","pie","hats"};

        List<String>list1=new ArrayList<String>();
        
        //add array items to list
        for(String x:things)
            list1.add(x);
         System.out.println("List 1 :- ");
        // print out list1
        
        for(int i=0;i<list1.size();i++){
            System.out.printf("%s ", list1.get(i));
        }
            
            String []morethings={"lasers","hats"};
            List<String>list2=new ArrayList<String>();
        
        //add array items to list
        for(String x:morethings)
            list2.add(x);
        System.out.println("\nList 2 :- ");
        //print out list2
        for(int i=0;i<list2.size();i++){
            System.out.printf("%s ", list2.get(i));
        }
        editList(list1,list2);
        System.out.println();
        System.out.println("After removing list 2 element from list 1 :-");
           // print out list1
        
        for(int i=0;i<list1.size();i++){
            System.out.printf("%s ", list1.get(i));
        }                         
    }
    
    public static void editList(Collection<String>l1,Collection<String>l2){
        Iterator<String>it=l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next()))
                it.remove();
        }
    }
}
