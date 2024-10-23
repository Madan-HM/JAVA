
public class code 
{
    public static void main (String[] args)
    {
        int i=2;  //change value 0 to 2 we don't want this exception,To perfrom other exception
        int j=0;
        String str = null;

        int a[] = new int[5];
        try
        {
            j=8/i;  //if exception occur here it will jump out of loop it dose not look at other 
            System.out.println(str.length());
            System.out.println(a[5]);  
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide number by 0");

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Problem occer at Array");
        }
        catch(NullPointerException e)
        {
            System.out.println("problem occer at string");
        }

        catch(Exception e)               //always keep this method at last to handle unknow exceptions
        {                                  //if we keep at first it will handle all the exceptions 
            System.out.println("Something went wrong"+e); //importent to write e to know which exception
        }
        System.out.println(j);

    }
    
}
