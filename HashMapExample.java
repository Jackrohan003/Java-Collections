import java.util.*;
class HashMapExample
{
    
    public static void main(String args[])
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Rohan");
        map.put(2,"Smit");
        map.put(1,"Varun");//If key is same then it will override the value
        map.put(3,"Sidh");
        map.put(null,"Namu");//null is allowable as a key
        map.put(null,null);
   
         //Using Iterator 
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();  
        while(itr.hasNext()) 
        { 
             Map.Entry<Integer, String> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        }   
        
for( Map.Entry<Integer, String> entry : map.entrySet() ){
    System.out.println( entry.getKey() + " => " + entry.getValue() );
        
        //Java 8 and Above Lamda expression to print the Map
         map.entrySet().forEach(entry->{
             System.out.println(entry.getKey() + " " + entry.getValue());  
         });
        ///Java 8 
        map.forEach((key,value)->System.out.println("Key :"+key+" Value:"+value));
    
    //Printing Only keys-
    Set<Integer> setKeys = map.keySet();
        for(Integer key : setKeys){
             System.out.println( key );
             }
    Collection<String> values = map.values();
        for(String value : values){
               System.out.println( value ); 
            }  
  
  
  }

    
}
