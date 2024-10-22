@FunctionalInterface
interface A //lamda expression only works with functional interface
{
    int add(int i,int j);

}
public class code
{
    public static void main(String[] args)
    {
        A obj = (i,j) ->  i+j; //instead of return i+j; we use i+j;
        System.out.println(obj.add(2,3));
    }
}