class Phone
{
    int price;
    String name;
    String brand;
    

    public void print()
    {
        System.out.println(name + ":"+ brand+ ":"+price);
    }
    static
    {
        System.out.println("this is a static block");
    }
}




public class practice 
{
    public static void main(String[] args)
    {
        Phone obj=new Phone();
        obj.name="v15";
        obj.brand="vivo";
        obj.price=70000;

        Phone obj1=new Phone();
        obj1.name="f12";
        obj1.brand="oppo";
        obj1.price=20000;
       
        obj.print();  //here we call the method 2time but it call static block one time 
        obj1.print();
       

    }
    
}
