public class feature2 
{
    public static void main(String args[])
    {
        String day = "Sunday";
        String result = " " ;

        result = switch(day)
        {
            case "saturday","sunday" -> "6am";
            case "Monday"-> "8am";
            default -> "7am";
        };
        System.out.println(result);
    }
    
}
