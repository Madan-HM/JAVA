public class LogicalOperatar
{
    public static void main(String srgs[])
    {
        int x=7;
        int y=5;
        int a=5;
        int b=9;

        boolean result = x<y && a<b;
        System.out.println(result);

        boolean result2 = x<y || a<b;
        System.out.println(result2);

        boolean result3 = x>y || a<b ||a>1;
        System.out.println(result3);

        boolean result4 = a>b;
        System.out.println(!result4);

    }

}
