class A extends Thread   //class A is not ordinary class it is a thread
{
    public void run() //when there is a thread there is a run()
    {
        for(int i=0;i<=200;i++)
        {
            System.out.println("hi");
        }

    }
}
class B extends Thread
{
    public void run()  //when there is a thread there is a run()
    {
        for(int i=0;i<=200;i++)
        {
            System.out.println("hello");
        }

    }
}
public class code 
{
    public static void main(String[] args)
    {
        A obj=new A();
        B obj1=new B();

        obj.start();  //start() built-in
        obj1.start(); //start() built-in
        //after calling methods they will simultaniously takes execution

    }
    
}
