

import java.util.ArrayList;
import java.util.Objects;
import java.util.*;

/*
                DemoEmp vala;
 */
class DemoEmp implements Comparable{

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DemoEmp other = (DemoEmp) obj;
        if (this.age != other.age) {
            return false;
        }
        if (Double.doubleToLongBits(this.sal) != Double.doubleToLongBits(other.sal)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "{" + "age=" + age + ", name=" + name + ", sal=" + sal + '}';
    }

    public DemoEmp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }
    int age;
    String name;
    double sal;

    @Override
    public int compareTo(Object o) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       DemoEmp x=(DemoEmp)o;
       Double s=this.sal;
       int check=s.compareTo(x.sal);
       if(check >0){
            return 1;
       }
       else if(check<0){
           return -1;
       }
       else{
           String nm=this.name;
           return nm.compareTo(x.name);
       }
       
    }
}
class Demo{
    public static void main(String[] args) {
        ArrayList<DemoEmp> al=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        DemoEmp e1=new DemoEmp(20,"ykp",50000);
        DemoEmp e2=new DemoEmp(20,"a",50000);
        DemoEmp e3=new DemoEmp(20,"yash kumar pandey",60000);
        DemoEmp e4=new DemoEmp(20,"yash pandey",5700000);
        
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        //al.add(e5);
        
        System.out.println("Dispalying list data");
        for(DemoEmp e:al){
            System.out.println(e);
        }
       /* System.out.println("enter age , name ,sal to be deleted");
        int age=sc.nextInt();
        String c=sc.next();
        String name=sc.nextLine();
        double sal=sc.nextDouble();
        
        DemoEmp f=new DemoEmp(age,name,sal);
        System.out.println("Rmoved "+al.remove(f));
        
        for(DemoEmp e:al){
            System.out.println(e);
        }*/
       
        System.out.println("before sorting");
        System.out.println(al);
        //collections.sort(al);
        Collections.sort(al);
        System.out.println("after sorting ");
        System.out.println(al);
        
        
    }
}
