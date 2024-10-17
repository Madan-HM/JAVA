class Human
{
    private int age;               //here we binded the data with methods its secure because it can't able to access outside
    private String name;         //these variables accessable only inside the class
                                        //accessing the variable indirectly outside the class 
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int n)  //we assinging the variables through methods
    {
        age=n;
    }
    public void setName(String m) //we assinging the variables through methods
    {
        name=m;
    }
}

public class code
{
    public static void main(String[] args)
    {
        Human obj=new Human();
        
        obj.setAge(11);
        obj.setName("manu");

        System.out.println(obj.getAge() +":"+obj.getName());

    }
}