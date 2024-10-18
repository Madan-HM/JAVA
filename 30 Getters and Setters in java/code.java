class Human
{
    private int age;               
    private String name;


    //go to source action and select the generate getters and setters and select the variables
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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