
public class code 
{
    public static void main(String[] args)
    {
        int i=10;
        int j=0;

        try
        {
            j=8/i;
            if(j==0)
              throw new ArithmeticException("dont want Zero");
        }
        catch(ArithmeticException e)
        {
            j=8/1;
            System.out.println("it is Default output "+e);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong "+e);
        } 
        System.out.println(j);
    }
    
}
