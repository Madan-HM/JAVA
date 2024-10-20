abstract class Car       //abstract method must come under abstract class
{                        //there is no necssery to have abstract method in abstract class
    public abstract void drive(); // ; used for declareing the method 
                        //the car should be drive so car must have drive feature
   //{                  //here we dosen't know drive so nothing in there
                          
   //}
    public abstract void fly(); 
    public void playMusic()
    {
        System.out.println("play music");
    } 
}
abstract class WaganR extends Car  //if any abstract method not implement in subclass that subclass becomme abstract
                          //subclass of abstract class must use above abstract method
                          //here WaganR want that feature so it is implementing Drive method
{
     //implement the Drive method here
    public void drive() 
    {
        System.out.println("Driving");
    }
}
 class UpdatedWaganR extends WaganR   //concrate class
{
    public  void fly()
    {
        System.out.println("play Flying");

    }
    
}


public class code
{
    public static void main(String[] args)
    {
       Car obj=new UpdatedWaganR(); //we cant able create object for abstract class or method 
        obj.playMusic();            //so in reference to car obj we created object for non abstract class
        obj.drive();
        obj.fly();

    }
}