enum Laptop
{
    Macbook(1000),HP(2000),Dell,Wings(1300); //these are object we are passing value with the object
    private int Price;                                          //to fix showing error we should create constructor 
                                                               //through quick fix or manually      
    
    
    private Laptop()     // at last create this by not giving value to the Dell
    {
        Price=500;
    }

    private Laptop(int price) 
    {                        
        Price = price;
        System.out.println("the Laptop "+this.name());  //name is built in function
    }

    public int getPrice() {
       return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
    
  
                                                    
}


public class code 
{
    public static void main(String[] args)
    {
       for(Laptop lap:Laptop.values()) //values is built-in
       {
        System.out.println(lap+":"+lap.getPrice());
       }
    }
    
}
