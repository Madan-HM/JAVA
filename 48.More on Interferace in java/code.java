//class - class ->extends
//class - interface ->implements
//interface - interface ->extends

interface A  
{
    void show();
    void config();
}
interface X
{
    void run();
}
interface Y extends X
{
    void win();

}
class B implements A,Y   //class is implemented Y also so win method must be used in class
                         //Y extends X so inside X the run method must be used in class
{
    public void show()
    {
        System.out.println("in the show");
    }
    public void config()
    {
        System.out.println("in the config");
    }
    public void run()
    {
        System.out.println("i am running");
    }
    public void win()
    {
        System.out.println("winner");
    }
}
public class code 
{
    public static void main(String[] args)
    {
        A obj=new B();  //creating object  with refference to interface A 
        obj.config();
        obj.show();
        X obj1=new B();  //creating object  with refference to interface X 
        obj1.run();
        Y obj2=new B();  //creating object  with refference to interface Y 
        obj2.win();
    }
    
}
