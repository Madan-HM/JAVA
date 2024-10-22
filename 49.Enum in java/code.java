//instead of creating object for your self we will create enum
enum Status                            
{                //basically Status is class here and below are objects
    Running, Failed ,Pending ,Sucess;  //numbering is 0,1,2,3
}
public class code
{
    public static void main(String[] args)
    {
        //Status s= Status.Running;
       // System.out.println(s);         //printing them

        //Status s= Status.Running;        
        //System.out.println(s.ordinal()); //printing order of them

        Status [] s=Status.values();
        for(Status m:s)                ///printing all of them
        {
            System.out.println(m +":"+m.ordinal());
        }


    }
}