import java.util.Scanner;

public class question1 {
    public static void main(String[] args)
    {
        //WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        int max=0;

        for (int i=0;i<size;i++)
        {
            System.out.print("Enter arr["+i+"] : ");
            int x=scanner.nextInt();
            arr[i]=x;
        }

        for (int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.print("Largest number of array is "+max);
    }
}
