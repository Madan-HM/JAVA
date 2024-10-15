public class assign
{
    public static void main(String[] args)
    {
        int num[][] = new int[3][4];

        num[0][0]=1;
        num[0][1]=1;
        num[0][2]=1;
        num[0][3]=1;
        num[1][0]=1;
        num[1][1]=1;
        num[1][2]=1;
        num[1][3]=1;
        num[2][0]=1;
        num[2][1]=1;
        num[2][2]=1;
        num[2][3]=1;
        


        for(int i=0; i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(num[i][j] + " ");

            }
            System.out.println();
        }
    }
    
}
