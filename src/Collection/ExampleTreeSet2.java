
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
public class ExampleTreeSet2 {
     public static void main(String[] args) {
          Book b1=new Book("Core Java","Dr R nageshwar Raw",500);
        Book b2=new Book("Advansed Java","Dr Sachin",5000);
        
        Book b3=new Book("Android","Dr Sachin Patel",7000);
        Book b4=new Book("C in depth","Dr Sachin Patel",1000);
        Book b5=new Book("Advansed Java","Dr Sachin",5000);
        
        Library lb=new Library();
        lb.addBook(b1);
        lb.addBook(b2);
        lb.addBook(b3);
        lb.addBook(b4);
        lb.addBook(b5);
         
    TreeSet <Book> hs=new TreeSet<Book>();
Iterator it=hs.iterator();
while(it.hasNext())
 {
            String s=(String)it.next();
            System.out.println(s);
 }
    }
    
}
