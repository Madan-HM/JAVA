class computer
{
    public void playmusic()  //Method with void type and no return value;
    {
        System.out.println("Music is playing");

    }
    public String getmeapen(int cost)  //Method with string type and a return value
    {
        if(cost >= 10)
        {
            return " pen is  on the table";
        }
        else
        {
             return " pen is NOT on the table";
        }
    }
}


public class method
{
    public static void main(String[] args)
    {
        computer obj = new computer();
        obj.playmusic();

        String str = obj.getmeapen(2);
        System.out.println(str);

    }
}