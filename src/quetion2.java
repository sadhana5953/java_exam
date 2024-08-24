import java.util.Scanner;

public class quetion2 {
    public static void main(String[] args)
    {
        //WAP TO SORT ARRAY IN ASCENDING(LOW TO HIGH) ORDER IN JAVA.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        int z=0;

        for (int i=0;i<size;i++)
        {
            System.out.print("Enter arr["+i+"] : ");
            int x=scanner.nextInt();
            arr[i]=x;
        }

        for (int i=0;i<size;i++)
        {
            for (int j=0;j<i;j++)
            {
                if(arr[i]<arr[j])
                {
                    z=arr[i];
                    arr[i]=arr[j];
                    arr[j]=z;
                }
            }
        }

        for (int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
