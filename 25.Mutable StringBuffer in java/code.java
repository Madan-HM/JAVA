public class code
{
    public static void main(String[]args)
    {
        StringBuffer sb = new StringBuffer("abc");

        System.out.println(sb.capacity());

        System.out.println(sb.length());

        System.out.println(sb.append("xyz"));

        System.out.println(sb.deleteCharAt(3));

        System.out.println(sb.insert( 1 , "mac"));

        String str =sb.toString();    //stores in str them print it
        System.out.println(str);

        


    }
}