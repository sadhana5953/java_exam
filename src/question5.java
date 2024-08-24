public class question5 {
    public static void main(String[] args)
    {
        int[][] arr=new int[9][12];

        for (int i=0;i<=9;i++)
        {
            for (int j=0;j<=12;j++)
            {
                if(i==9 || i==8&&j==1 || i==7&&j==2 || i==6&&j==3 || i==5&&j==4 || i==4&&j==5 || i==3&&j==6 || i==4&&j==7 )
                {
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
