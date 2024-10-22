//functional interface has only one method
@FunctionalInterface
interface A 
{
    void show();
    //void show1();
}
/*class B implements A
{
    public void show()
    {
    System.out.println("in the B show");
    }
}*/
public class code 
{
    public static void main(String[] args)
    {
        A obj=new A()  
        {
           public void show()
           {
           System.out.println("in the B show");
           }
        };
        obj.show();

    }
    
}
