@FunctionalInterface
interface A 
{
    void show(int i,int j);
}
public class passinginti
{
    public static void main(String[] args)
    {  //we doesn't need to put type like int //if there is one variable no need to put brackets( )
        A obj= (i,j) -> System.out.println("in the inner class show "+i+" "+j); 
        obj.show(4,6);
    }
    
}
