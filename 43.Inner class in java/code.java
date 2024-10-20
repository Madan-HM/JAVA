class A   
{
    public void show()
    {
        System.out.println("in the A show");

    }
    class B                     //for static class
    {
        public void show2()
        {
            System.out.println("in the show2");
        }
    }
}
public class code
{
    public static void main(String[] args)
    {
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();
                                        //A.B obj1=new A.B();
        obj1.show2();

    }
    
}
