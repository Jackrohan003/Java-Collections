import java.util.LinkedList;
public class RemoveFromLinkedList {
 
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Add elements to LinkedList
    linkedlist.add("Cobol");
    linkedlist.add("JCL");
    linkedlist.add("C++");
    linkedlist.add("C#");
    linkedlist.add("Java");
 
    // Displaying Elements before replace
    System.out.println("LinkedList Elements:");
    for(String str: linkedlist){
       System.out.println(str);
    }
 
    // Removing 3rd element
    Object e1 = linkedlist.remove(2);
    System.out.println("\nElement "+ e1+ " removed from the list\n");

    // LinkedList elements after remove
    System.out.println("After removal:");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
   
   // Removing First element
    Object firstElement = linkedlist.removeFirst();
    System.out.println("\nElement removed: "+ firstElement);
 
    // Removing last Element
    Object lastElement = linkedlist.removeLast();
    System.out.println("Element removed: "+ lastElement);
 
    // LinkedList elements after remove
    System.out.println("\nList Elements after Remove:");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
   
   
   
   
   
   
 }
}import java.util.LinkedList;
public class RemoveFromLinkedList {
 
 public static void main(String[] args) {
 
    // Create a LinkedList
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    // Add elements to LinkedList
    linkedlist.add("Cobol");
    linkedlist.add("JCL");
    linkedlist.add("C++");
    linkedlist.add("C#");
    linkedlist.add("Java");
 
    // Displaying Elements before replace
    System.out.println("LinkedList Elements:");
    for(String str: linkedlist){
       System.out.println(str);
    }
 
    // Removing 3rd element
    Object e1 = linkedlist.remove(2);
    System.out.println("\nElement "+ e1+ " removed from the list\n");

    // LinkedList elements after remove
    System.out.println("After removal:");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
   
   // Removing First element
    Object firstElement = linkedlist.removeFirst();
    System.out.println("\nElement removed: "+ firstElement);
 
    // Removing last Element
    Object lastElement = linkedlist.removeLast();
    System.out.println("Element removed: "+ lastElement);
 
    // LinkedList elements after remove
    System.out.println("\nList Elements after Remove:");
    for(String str2: linkedlist){
       System.out.println(str2);
    }
   
   
   
   
   
   
 }
}
