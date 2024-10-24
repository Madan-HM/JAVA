import java.util.Set; //we working on Set so imported this package
import java.util.HashSet;     //we working on Hashset also so imported this package

public class hashset
{
    public static void main(String[] args)
    {
        Set<Integer> nums=new HashSet<Integer>();  //Set is main reference and HashSet,TreeSet etc.. are subclasses.all are built-in
                                                   //here we created object for that
        nums.add(6);                //we doesn't put  <Integer> there, nums.add(6) treated as objects
        nums.add(5);
        nums.add(8);
        nums.add(2);

        for(Object n:nums)   //enhance for loop which takes care of the execution of number one by one
        {
            
            System.out.println(n);
        }
    
    }
}//set will not give u the output value in the sorted format ,instead it give in randam format 