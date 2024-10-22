enum Status
{
    Running,Failed,Pending,Success;
}
public class ifelsecode 
{
    public static void main(String[] args)
    {
        Status s=Status.Pending;

        if(s==Status.Running)
        {
            System.out.println("operation is running");
        }
        else if(s==Status.Failed)
        {
            System.out.println("operation is Failed");
        }
        else if(s==Status.Pending)
        {
            System.out.println("operation is Pending");
        }
        else if(s==Status.Success)
        {
            System.out.println("operation is Completed");
        }

    }
    
}
