
import java.util.ArrayList;
public class ExampleArrayList
{
public static void main(String arg[])
{
    ArrayList<String>months=new ArrayList<String>();
    months.add("January");
    months.add("February");
    months.add("March");
    months.add("April");
    System.out.println("You inser following months :");
    System.out.println( months);
    
    months.add(0,"Jan");
    String s=months.get(0);
    String p=months.get(2);
    System.out.println("data according to index you get:");
    System.out.println(s);
    System.out.println(p);
    System.out.println("After removing:");
      months.remove(0);
    System.out.println("Traversing using enhanced loop :");
    for(String data:months)
    {
        System.out.println(data);
    }
  
    
}
}

   