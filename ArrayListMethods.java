import java.io.*;
import java.util.*;

class ArrayListMethods{  
  public static void main(String args[]){  
     stringExample();
    } 
    
    public static void stringExample()
     {
     ArrayList<String> alist=new ArrayList<String>();  
     alist.add("Gregor Clegane");  
     alist.add("Khal Drogo");  
     alist.add("Cersei Lannister");  
     alist.add("Sandor Clegane"); 
     alist.add("Tyrion Lannister");
  
     //iterating ArrayList
     for(String str:alist)  
        System.out.println(str);  
     }    
}
