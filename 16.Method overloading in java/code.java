class Computer
{
    public int add(int n1 , int n2 , int n3)
    {
        return n1 + n2 + n3;
    }
    public int add(int n1 , int n2 )
    {
        return n1 + n2;
    }
    public double add(double n1 , int n2 )
    {
        return n1 + n2;
    }
}




public class code
{
    public static void main(String a[])
    {
        Computer obj = new Computer();

        int r1 = obj.add(1,2,3);
        System.out.println(r1);

        int r2 = obj.add(1,2);
        System.out.println(r2);

        double r3 = obj.add(1,2);
        System.out.println(r3);

    


    }
}