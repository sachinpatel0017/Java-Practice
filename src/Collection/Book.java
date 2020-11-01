

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;


class Book{

    @Override
    public String toString() {
        return "{" + "name=" + name + ", author=" + author + ", prise=" + prise + "}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.author);
        hash = 41 * hash + this.prise;
        return hash;
    }

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
        final Book other = (Book) obj;
        if (this.prise != other.prise) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }

    public Book(String name, String author, int prise) {
        this.name = name;
        this.author = author;
        this.prise = prise;
    }
    String name,author;
    int prise;
}



class Library{
    private HashSet<Book> hs=new HashSet<>();
    public boolean addBook(Book b){
        boolean result=hs.add(b);
        return result;
    }
    public int getBookCount(){
        return hs.size();
    }
    public HashSet getAllBook(){
        return hs;
    }
}



 class HomeWork_LibraryManagement {
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
        
        System.out.println("number of books in Library is "+lb.getBookCount());
        System.out.println();
        System.out.println("All books in Library ");
        HashSet sh=lb.getAllBook();
        
        Iterator<Book> it=sh.iterator();
        Book x;
        while(it.hasNext()){
           x=it.next();
            System.out.println(x);
        }
    }
 }