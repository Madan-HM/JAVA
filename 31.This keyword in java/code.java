class Human
{
    private int age;               //instance variable 
    private String name;           //instance variable 


    
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) //method has stack with age inside
    {
        this.age = age;           //this keyword represent refers current object
        //this.age-here age is refers instance variable //age; is local variable the preference given to local variable
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }         
                                        
    
}

public class code
{
    public static void main(String[] args)
    {
        Human obj=new Human();  //obj in main stack and age , name in heap
        
        obj.setAge(11);
        obj.setName("manu");

        System.out.println(obj.getAge() +":"+obj.getName());

    }
}