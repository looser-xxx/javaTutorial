package RecursionInOneShotLoveBabbar;

public class Main
{



    public static void count(int n)
    {
        if (n==0)
            return ;
        count(n-1);
        System.out.println(n);
    }


    public static int factorial(int n)
    {
        if (n==1)
            return 1;
        return n*factorial(n-1);
    }

    public static int fibonacci(int n)
    {
        int term=0;
        if (n==0||n==1)
            return n;
        return term;
    }











    public static void main(String[] args)
    {
        int n=5;
        System.out.println("Recursion");
        count(n);
        System.out.println();
        System.out.println(factorial(n));
    }
}



























































