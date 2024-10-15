class calculater
{
    int num = 5;
    public int add(int n1, int n2)
    {
        System.out.println(num);
        return n1 + n2;
    }
}


public class code 
{
    public static void main(String[] args)
    {
        int data = 5;
        calculater obj= new calculater();
        calculater obj1 = new calculater();

        int r1 = obj.add(1,5);
        System.out.println(r1);

        System.out.println(obj.num);
        System.out.println(obj1.num);
        

    }
}