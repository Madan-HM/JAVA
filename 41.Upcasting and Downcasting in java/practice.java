class A  
{
    public void show1()
    {
        System.out.println("in the A");
    }
}
class B extends A{
    public void show2()
    {
        System.out.println("in the B");
    }
}


public class practice {
    public static void main(String[] args)
    {
        A obj=(A)new B();  // A obj=is just reference .(A)new B();here we created the object for B and typecasted to A  
                           ////object is of B but refered to A
                           //sending the child class and type casted with A which is parent class
                           //Upcasting
        //obj.show();      //can't able to call show() because we created the object for A only it doesn't know B exists 
        obj.show1();


                         // by using the same object above their  we created the object of B and typecasted to A 
        B obj1=(B)obj;   //we typecasting the object  from A to B
        obj1.show2();    //Downcasting 

        
    }
}
