public class feature
{
    public static void main(String args[])
    {
        String day = "Sunday";
        switch(day)
        {
            case"Saturday","Sunday" -> System.out.println("6am");
            case "Monday" ->System.out.println("8am");
            default ->System.out.println("7am");
        }
    }

}
