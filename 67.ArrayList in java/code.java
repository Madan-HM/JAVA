import java.util.ArrayList; //we working on arraylist so imported this package
import java.util.List;     //we working on list also so imported this package

public class code
{
    public static void main(String[] args)
    {
        List<Integer> nums=new ArrayList<Integer>();  //List is main reference and ArrayList,LinkedList etc.. are subclasses.all are built-in
                                                      //here we created object for that
        nums.add(6);                  //we doesn't put  <Integer> there, nums.add(6) treated as objects
        nums.add(5);
        nums.add(8);
        nums.add(2);

        for(Object n:nums)   //enhance for loop which takes care of the execution of number one by one
        {
            
            System.out.println(n);
        }
        System.out.println(nums.get(1)); //gives value for the index
        System.out.println(nums.indexOf(8)); //gives index for values
    }
}