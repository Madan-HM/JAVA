class Calc
{
    public int aDD(int a, int b)
    {
        return a+b;
    }
    public void text()
    {
        System.out.println("In the text method ");
    }
   
}
class AdvCalc extends Calc
{
    public int aDD(int a, int b) //this add method overriding that above add method we want this method and text method in super class.
    {
        return a+b+1;
    }
}
public class code 
{
    public static void main(String[] args)
    {
        AdvCalc obj=new AdvCalc();
        int r1 = obj.aDD(2, 03);
        System.out.println(r1);
        obj.text();


    }
    
}
