import java.util.Map;
import java.util.HashMap;
public class code {
    public static void main(String[] args) {  //below put HashTable<> works  same as HashMap
        Map<String,Integer> Students=new HashMap<String,Integer>(); {  //it is a Syntax ,compulsary to put string,integer 

        Students.put( "abc",22);   //use put method which is already in the imported packages
        Students.put( "xyz",33);

        for(String n:Students.keySet())      //n fetch the single name form keySet  
        {
            System.out.println(n+":"+Students.get(n)); //here getting the value for that name
        }

        System.out.println(Students);  //print map itself means printing all the values
        System.out.println(Students.get("abc")); //getting the value  for key
        System.out.println(Students.keySet());   //print only keys
            
        }
    }
    
}
