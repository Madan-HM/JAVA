class computer
{
    public void playmusic()  //Method with void type and no return value;
    {
        System.out.println("Music is playing");

    }
    public String getmeapen(int abc)  //Method with string type and a return value
    {
        if(abc <=9)
        {
            return " pen is not on the table";
        }
        else
        {
             return " pen is on the table";
        }
    }
}


public class method
{
    public static void main(String[] args)
    {
        computer obj = new computer();
        obj.playmusic();

        String str = obj.getmeapen(10);
        System.out.println(str);

    }
}