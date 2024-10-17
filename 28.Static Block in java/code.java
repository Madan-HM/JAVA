class Phone
{
    String brand;
    int price;
    static String name; //making this name variable common fo all

    public void print()
    {
        System.out.println(brand + " : " + price + " : " + name );
    }
    static             //it calls static block only one time and calls first
    {
        System.out.println("this is static block");
    }
}


public class code 
{
    public static void main(String[] args)
    {
        Phone obj1 = new Phone();

        obj1.brand = "oppo";
        obj1.price = 20000;
        Phone.name = "f-series";  //here we type Phone.name instead of obj1.name beacase it is static 
        
        Phone obj2 = new Phone();

        obj2.brand = "vivo";
        obj2.price = 40000;
        Phone.name = "z-series";

        obj1.print();
        obj2.print();

        
       



    }
    
}
