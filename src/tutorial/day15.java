package tutorial;

public class day15
{
    public static void main(String[] args)
    {
        System.out.println("day 15");
        System.out.println("while loop");


        System.out.println();
        System.out.println("sum of numbers");
        int n=127;
        int sum=0;
        while (n>0)
        {
            int r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.println(sum);


        System.out.println();
        System.out.println("palindrome number");
        n=121;
        int m=n;
        sum=0;
        while (n>0)
        {
            int r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        if (sum==m)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}






















































































