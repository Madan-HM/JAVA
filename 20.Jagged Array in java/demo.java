public class demo
{
    public static void main(String[] args)
    {
        int num[][]=new int[3][];
        num[0] = new int[3];
        num[1] = new int[4];
        num[2] = new int[2];

        for(int i=0;i<num.length;i++)
        {
           for(int j=0;j<num[i].length;j++)
           {
            num[i][j]=(int)(Math.random()*10);
           }
        }
        for(int n[] : num)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}