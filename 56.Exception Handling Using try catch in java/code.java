public class code
{
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        
        try
        {
            j=8/i;
        }

        catch(Exception e)
        {
            System.out.println("Something went wrong"+e);
        }


        System.out.println(j);
        System.out.println("Bye"); //if we not handled the exception ,execution stops there this statement doesn,t print 

    }
}