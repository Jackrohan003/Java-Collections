/*HashSet Methods:
boolean add(Element  e): It adds the element e to the list.
void clear(): It removes all the elements from the list.
Object clone(): This method returns a shallow copy of the HashSet.
boolean contains(Object o): It checks whether the specified Object o is present in the list or not. If the object has been found it returns true else false.
boolean isEmpty(): Returns true if there is no element present in the Set.
int size(): It gives the number of elements of a Set.
boolean remove(Object o): It removes the specified Object o from the Set.

*/
import java.util.*;

class HashSetMethods {
  public static void main(String[] args) {
    
    HashSet<Integer> set = new HashSet<Integer>();
    
    set.add(9);
    set.add(3);
    set.add(1);

    //Remove the element (it return true if element exist and removed otherwise false)
    System.out.println(set.remove(8));
    System.out.println(set);

    //Check element is present or not (return true or false )
    System.out.println(set.contains(9));

     // Creating an Array
     Integer array[] = new Integer[set.size()];
     set.toArray(array);

      for(int i:array)
      System.out.println(i);

  }
}
