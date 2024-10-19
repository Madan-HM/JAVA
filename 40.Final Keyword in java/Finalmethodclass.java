 final class A          //here we finalize class A  stops inheritance
{
    public final void show()  //finalize method stops method overriding
    {
      
        System.out.println("in the show 1");
    }
}
class B extends A   //error
{
    public void show()
    {
        System.out.println("in the show 2");
    }
}

public class Finalmethodclass 
{
    public static void main(String[] args)
    {
       B obj=new B();

       obj.show();
    }
    
}
