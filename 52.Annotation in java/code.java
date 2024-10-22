class A 
{
    public void show()    
    {
        System.out.println("in the A show");
    }
}
class B extends A
{
    @Override                    //annotation //below error is showing
    public void show()           //typed show to show1
    {
        System.out.println("in the B show");
    }
}
public class code {
    public static void main(String[] args)
    {
        A obj=new B();
        obj.show();


    }
    
}
