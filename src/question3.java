import java.util.Scanner;

public class question3 {
    public static void main(String[] args)
    {
        //WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        int prime=0;

        for (int i=0;i<size;i++)
        {
            System.out.print("Enter arr["+i+"] : ");
            int x=scanner.nextInt();
            arr[i]=x;
        }

        for (int i=0;i<size;i++)
        {
            if(arr[i]%i==0)
            {
                prime++;
            }
        }

    }
}
