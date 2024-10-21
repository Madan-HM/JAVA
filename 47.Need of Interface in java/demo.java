interface Computer
{
    void code();      //all the methods should be used in implemented each class
    void fly();       //means every single sub class must have these methods
                      //used to achieve multiple inheritence in java
                //any class can extend only one class // but features of interface can be used by infite classes simultaniously
                      
}
class Laptop implements Computer{
    public void code()
    {
        System.out.println("coding in desktop");
    }
    public void fly()
    {
        System.out.println("flying in desktop");
        
    }
  
}
class Desktop implements Computer{
    public void code()
    {
        System.out.println("coding in laptop");
    }
    public void fly()
    {
        System.out.println("flying in laptop");
    }
}

public class demo
{
    public static void main(String[] args)
    {
        Computer obj=new Laptop();
        Computer obj1=new Desktop();
        obj.code();
        obj.fly();
        obj1.code();
        obj1.fly();
       
        

        

       
    }
}
