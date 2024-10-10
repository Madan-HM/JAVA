public class feature3
{
    public static void main(String[] args)
    {
        String day = " Monday";
        String result = " ";

        result = switch(day)
        {
            case "saturday" ,"sunday": yield "6am";
            case "Monday": yield "8am";
            default : yield "7am";
        };
        System.out.println(result);
    }
    
}
