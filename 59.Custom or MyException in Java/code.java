class MyException extends Exception
{
    public  MyException(String str)
    {
        super(str);
    }

}
public class code
{
    public static void main(String[] args)
    {
        int i=10;
        int j=0;

        try{
            j=8/i;
            if(j==0)
              throw new MyException("dont want zero ");
        }
        catch(MyException e)
        {
            j=8; //if j=0 we want to print 8
            System.out.println("Something went wrong "+e);
        }
        System.out.println(j);
    }
}