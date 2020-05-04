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
        
        books.add(3,"Vb.net");          //this will add at 4th postion and index 3
        System.out.println(books);
        
        //Change an element at specific postion
        
        books.set(0,"Java With Data Structure");    // if index is not there then Exception will occur
        System.out.println(books);
        
        //Remove element from ArrayList
        
        books.remove("Vb.net");             //if specified element is not there then nothing will happen
        System.out.println(books);
        
        //Remove 3rd element 
        
        books.remove(2);       // 3rd postion 2nd index
        System.out.println(books);    
            
        //Iterating ArrayList Using For Each Method
        for(String str:books)
            System.out.print(str+" ");
        System.out.println();
        
          //Size of the ArrayList size() Method
          System.out.println(books.size());
        
        //Common For Loop for ArrayList
        
        for(int i=0;i<books.size();i++)
            System.out.println(books.get(i));
        
        //Sort the list using Collections class. This is part of java.util package 
    
        Collections.sort(books);
        System.out.println(books);
        
         //Check Wheather element is present or not
        
        System.out.println(books.contains("Unix"));
        System.out.println(books.contains("Algorithm"));
        
        
        //Sorting reverse Order
        
        Collections.sort(books,Collections.reverseOrder());
        System.out.println(books);
      
        
     }    
}
