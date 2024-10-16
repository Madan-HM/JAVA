public class code 
{
    public static void main(String[] args)
    {
        //case1 - one object 
        String  name = "naveen";
        name = name  + "xyz";

        //case2 - two object in heap
        String str1 = "Naveen";
        String str2 = "Naveen";
        String str3 = str1 + str2;

        System.out.println(name);
        System.out.println(str3);
    }
    
}
