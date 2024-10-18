class Human
{
    private int age;
    private String name;

    public Human()  //default constructor //go to source code and select the constructer and select the parameter
    {
        age= 11;
        name="manu";
        System.out.println("in constructor");
    }
    public Human(int a ,String n) //double parameterized constuctor
    {
        age= a;
        name= n;
    }
    public Human(String n) //single parameterized constuctor
    {
        age= 15;
        name= n;
    }


    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;

    }
  

}

public class code
{
    public static void main(String[] args)
    {
        Human obj=new Human();  
        Human obj1=new Human(19 ,"anil"); 
        Human obj2=new Human("ankith");
        System.out.println(obj.getName()+":"+obj.getAge());
        System.out.println(obj1.getName()+":"+obj1.getAge());
        System.out.println(obj2.getName()+":"+obj2.getAge());




    }
}