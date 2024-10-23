class A implements Runnable //another type to create thread
{
    public void run() 
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(10);  
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            }
        }

    }
}
class B implements Runnable //another type to create thread
{
    public void run()  
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(10);  
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }

    }
}
public class code 
{
    public static void main(String[] args)
    {
        Runnable obj1=new A(); //objects of class A and B
        Runnable obj2=new B();

        Thread t1=new Thread(obj1); //thread to use start() method
        Thread t2=new Thread(obj2);

        t1.start();  
        t2.start(); 
    

    }
    
}
