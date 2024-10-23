class A 
{
    public void show() throws  ClassNotFoundException  //throwing the exception here
    {                                                 
           Class.forName("class loaded");   //creating Exception here
    }
}
public class code {
    public static void main (String[] args)
    {                                        //create subclass and method, inside method create Exception and throw it          
        A obj=new A();
        try {
            obj.show();  //through Quick fix we put try and catch here
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
