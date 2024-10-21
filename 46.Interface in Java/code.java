interface  A       //when we have a abstract class which has only have abstract methods
{                  //instead using that we use interface //it is not a class
    void show();   // by default every method has public abstract hence not need to write
    void config();

    int age=23;      //all the variables inside the interface are final and static
}
class B implements A
{
    public void show()
    {
        System.out.println("in the show");
    }
    public void config()
    {
        System.out.println("in  the config");
    }
}

public class code 
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.show();
        obj.config();

        System.out.println(A.age); //since they are static we can able to print directly using interface name

    }
    
}
