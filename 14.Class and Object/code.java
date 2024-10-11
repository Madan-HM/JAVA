//blue print or structure = class
class calculater
{
   //variables
   int num1; 
   int num2;
   int result;
   
   //methods
   public void perform()  //void is return type and public access modifier, perfrom() is method name
   {
         result = num1 + num2; //once we got values we add here.
   }

}


public class code
{
    public static void main(String[] args) //control comes here first.
    {
                                           //Calculater obj;  //reference.
       calculater obj = new calculater();  //here object created,new keyword is used to allocate the memory, how much memory needed defines by the construter calculater().
                                           //object knows something so,In class we need some veriables and object does something so in class we need some methods.
       obj.num1 = 3;    // to access the num1 in class calculater we write obj.
       obj.num2 = 5;

       obj.perform();  // it will call the method. the method add those values and assign to result.

       System.out.println(obj.result);
    }
}