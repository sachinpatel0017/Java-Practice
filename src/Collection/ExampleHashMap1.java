
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sachin Patel
 */
public class ExampleHashMap1 
{
    public static void main(String[] args)
    {
        HashMap<String,Long>teamSca=new HashMap<>();
        teamSca.put("Sachin",8518091215L);
        teamSca.put("Aftaab",7992202926L);
        teamSca.put("Arif",9755048140L);
        teamSca.put("Mohnish",8962336876L);
       // System.out.println(teamSca);
      /* Set<String> names=teamSca.keySet();
       Iterator<String>itr=names.iterator();
       while(itr.hasNext())
       {
           String s=itr.next();
           System.out.println(s);
       }*/
      Set<Map.Entry<String,Long>>allData=teamSca.entrySet();
       Iterator<Map.Entry<String,Long>>itr=allData.iterator();
       while(itr.hasNext())
       {
           Map.Entry<String,Long> e=itr.next();
           System.out.println("Name:"+e.getKey()+",phone="+e.getValue());
       }
       Scanner kb=new Scanner(System.in);
        System.out.println("Enter name to remove....");
     String  a=kb.nextLine();
       boolean result=teamSca.containsKey(a);
        System.out.println(result);
        boolean r=teamSca.containsValue(8518091215L);
        System.out.println(r);
        if(result==true)
        {
            teamSca.remove(a);
            System.out.println("The name is removed..");
        }
        else
        {
            System.out.println("Not found");
        }
        System.out.println(teamSca);
       
    
    }
    
}
