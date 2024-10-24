import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class code {
    public static void main(String[] args)
    {
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);  
        Stream<Integer> s1 = nums.stream();  //once we use the Stream we can not reuse the stream
        Stream<Integer> s2=s1.filter(n -> n%2==0); //so another stream is created
        Stream<Integer> s3=s2.map(n -> n*2);
        
        s3.forEach(n->System.out.println(n));

    }
    
}
