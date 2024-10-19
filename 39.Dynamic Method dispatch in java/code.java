class A
{
    public void show()
    {
        System.out.println("in the show A");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in the show B");
    }
}
class C extends B
{
    public void show()
    {
        System.out.println("in the show C");
    }
    
}



public class code 
{
    public static void main(String[] args)
    {
        
        A obj=new A();
        obj.show();     // obj.show () call which method in which class called run-time polymorphism

        obj=new B();    //all these are called dynamic method dispatch 
        obj.show();     //reference in A and created the object of B

        obj=new C();    //no C in start because it is inherited
        obj.show();     //reference in A and created the object of B


    }
    
}
