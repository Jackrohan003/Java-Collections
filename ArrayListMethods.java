import java.io.*;
import java.util.*;

class ArrayListMethods{  
  public static void main(String args[]){  
     stringExample();
    } 
    
    public static void stringExample()
     {
       ArrayList<String> books = new ArrayList<>();
        
        //Adding element to the list (add Method)
        books.add("Java");
        books.add("C++");
        books.add("Data Structure");
        books.add("Unix");
        books.add("Discrete Maths");
        
        System.out.println(books);

        //Adding at the specific postion
        books.add(3,"Vb.net");      //this will add at 4th postion and index 3
        System.out.println(books);
        
        //Change an element at specific postion
        books.set(0,"Java With Data Structure");
        System.out.println(books);
        
     }    
}
