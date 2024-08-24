public class question4 {
    static int sum(int n)
    {
        if (n==0)
        {
            return n;
        }
        else {
            if (n%2==0)
            {
                return n+sum(n-1);
            }
            else {
                return sum(n-1);
            }
        }
    }
    public static void main(String[] args)
    {
        //WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION.
        int totalOfSum=0;
        totalOfSum=sum(5);
        System.out.print("sum is "+totalOfSum);
    }
}
