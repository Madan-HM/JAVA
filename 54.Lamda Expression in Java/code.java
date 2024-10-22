interface A 
{
    void show();
}
public class code 
{
    public static void main(String[] args)
    {
       // A obj= () -> // instead of new A(); { public void show ,we use () ->this is lamda expression                      
                     //instead of { } we skip if there is only one statement
      A obj= () ->System.out.println("in the inner class show");
            
        obj.show();
    }
    
}
