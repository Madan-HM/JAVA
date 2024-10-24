import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class code {
    public static void main(String[] args)
    {
        List<Integer> nums=Arrays.asList(2,4,5,3,1);  //by using Arrays.asList we can easily pass the values

        /*for(int n : nums)
        {
            System.out.println(n);
        }*/
        //instead of this we can use for each

        

        nums.forEach(n->System.out.println(n)); //it will give u one value that value stored in n

    }
    
}
