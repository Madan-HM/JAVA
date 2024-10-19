public class code 
{
    public static void main(String[] args)
    
    {
       AdvCalc obj=new AdvCalc();        //here we just create object for subclass

       int r1 = obj.aDD(2, 03);
       System.out.println("addtion ="+ r1);

       int r2 = obj.sUB(20, 10);
       System.out.println("substraction ="+ r2);

       

       int r3 = obj.dIV(15, 3);
       System.out.println("division ="+ r3);

       int r4 = obj.mUL(5, 2);
       System.out.println("multiplicaton ="+ r4);
    }
    
}
