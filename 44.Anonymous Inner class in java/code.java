class A
{
    public void show()
    {
        System.out.println("in the A show");
    }

}
//class B extends A        //here we are method overriding
//{
    //public void show()
    //{
     //   System.out.println("in the B show");
   // }
//}

public class code 
{
    public static void main(String[] args)
    {
        A obj=new A()    //here there is no class , class name so it is anonymous inner class
        {
            public void show()
            {
                System.out.println("in the B show");
            }
        };
        obj.show();
        
      

    }
    
}
