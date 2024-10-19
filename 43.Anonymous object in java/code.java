class A
{
    public A()
    {
        System.out.println(" method");
    }
    
    public void show()
    {
        System.out.println("in the show method");
    }
}




public class code 
{
    public static void main(String[] args)

    {
        new A();         //Anonymous object //there is no reference here stores in heap
        new A().show();  //to call the method
      

        
       
        
      
    }
    
}
