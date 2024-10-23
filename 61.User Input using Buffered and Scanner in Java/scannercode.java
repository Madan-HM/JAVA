import java.util.Scanner;      // in the util package
import java.io.IOException;
public class scannercode 
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter a number");

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        System.out.println(num);
    }
    
}
