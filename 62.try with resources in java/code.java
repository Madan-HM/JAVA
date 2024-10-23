import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class code
{
    public static void main(String[] args) throws IOException
    {
        //here we use try and finally where resources are closed in finally
        BufferedReader bf=null;
        try
        {
            System.out.println("Enter your name");

            InputStreamReader in = new InputStreamReader(System.in);//create a new input StreamReader to read from System.in
            bf = new BufferedReader(in);//create a new Buffered reader to read the inputstream reader

            String str=bf.readLine();  //used to read a line of text from bufferedReader

            System.out.println("Name :"+str);
        }
        finally
        {
            if(bf!=null) //first bf value is null but in the try block it takes some value
            bf.close(); //finally used to close the resources regardless Exception occur or not
        }
    }
}