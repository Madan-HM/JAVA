class A  // extends Object it is always there if we dosen't mention
{
    public A()
    {              
        super();   //it is always there if we dosen't mention
                   //it is invisible it always call the constructor of supper class
        System.out.println("In A");
    }
    public A(int a)
    {
        super();   //means call the constructor of supper class
        System.out.println("In A int ");
    }

}
class B extends A
{
    public B()
    {
        super();   //means call the constructor of supper class
        System.out.println("In B");
    }
    public B(int a)
    {
        this();         //it will call the constructor of the same class
        System.out.println("In B int ");
    }

}

public class code 
{
    public static void main(String[] args)
    {
       B obj= new B(3);

    }
    
}
