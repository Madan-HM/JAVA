class Human
{
    private int age;
    private String name;//here we are not assigning values beacuse connectivity to database write in constructor

    public Human() //costructor name should same as class name and never reeturn anything
    {
        age= 11;
        name="manu";
        System.out.println("in constructor");
    }

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;

    }
    //public void setAge(int a)
    //{
        //age = a;
    //}
    //public void setName(String n)
    //{
      //  name = n;
    //}

}

public class code
{
    public static void main(String[] args)
    {
        Human obj=new Human();  //every time object is created it will call the constructor
        Human obj1=new Human(); //here object is created again it will constructor again
        System.out.println(obj.getName()+":"+obj.getAge());

        //obj.setAge(11);
        //obj.setName("manu");

        //System.out.println(obj.getName()+":"+obj.getAge());



    }
}