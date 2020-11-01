
import java.util.HashSet;
import java.util.Iterator;


public class ExampleHashset {
    public static void main(String[] args) {
        
    
    HashSet <String> hs=new HashSet<String>();
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
