abstract class A  
{
    public abstract void show1();
    public abstract void show2();
    
}


public class code
{
    public static void main(String[] args)
    {
        A obj=new A()  //here we are not creating the object for a abstract class 
        {              //instead creating object for anonymous inner class
            public void show1()
            {
                System.out.println("in the B show");
            }
            public void show2()
            {
                System.out.println("in the C show");
            }
        };
        obj.show1();
        obj.show2();

    }
}