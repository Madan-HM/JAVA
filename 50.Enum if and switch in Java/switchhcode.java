enum Status
{
    Running,Failed,Pending,Success;
}
public class switchhcode
{
    public static void main(String[] args)
    {
        Status s=Status.Pending;
        switch(s)
        {
            case Running: System.out.println("operation is running");break;
            case Failed: System.out.println("operation is Failed");break;
            case Pending: System.out.println("operation is Pending");break;
            default: System.out.println("operation is Success");break;
        }
       
    }
    
}
