class A extends Thread  
{
    public void run() 
    {
        for(int i=0;i<=200;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(10);  //Quick fix try catch block
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            }
        }

    }
}
class B extends Thread
{
    public void run()  
    {
        for(int i=0;i<=200;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(10);  //Quick fix try catch block
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
        A obj=new A();
        B obj1=new B();

        //System.out.println(obj.getPriority()); //there 1-10 ,1 is least and 10 is highest //get priority
        //obj.setPriority(Thread.MAX_PRIORITY); //send priority

        obj.start();  
        obj1.start(); 
    

    }
    
}
