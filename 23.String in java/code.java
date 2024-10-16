public class code 
{
    public static void main(String[] args)
    {
        String str = "naveen";                      //simple string also create object
        String str1 = new String("naveen"); //creating oject for a string
         
        String str3 = new String(" abc " + str1);     //concatination
        String str4 = new String(str3.concat(" xyz "));   //concatination
       

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str4.length());          //length of a string
        System.out.println(str4.charAt(7));   //finding index character
        


    }
    
}
