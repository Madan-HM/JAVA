class Human
{
    private int age;        //these variables are secured can't able to access outside the class
    private String name;    //so,we accessing the data indirectly withoutside the class by binding
    
    public int getAge()
    {
        return age;
    } 
    public String getName()
    {
        return name;
    }
    public void setAge(int n) //we assinging the variables through methods
    {
        age=n;
    }
    public void setName(String s) //we assinging the variables through methods
    {
        name=s;
    }
}

public class practice {
    public static void main(String[] args)
    {
        Human obj=new Human();    
        obj.setAge(10);           //assign values
        obj.setName("manu");      //assign values

        System.out.println(obj.getName()+":"+obj.getAge());

    }
    
}
