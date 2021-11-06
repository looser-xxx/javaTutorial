package DSA_One;

public class Day8
{



    public static void printHello(int n)
    {
        if (n==0)
            return;
        printHello(n-1);
        System.out.println("Hello "+n);
    }


    public static int sumOfNaturalNumbers(int n)
    {
        if (n==1)
            return 1;
        return n+sumOfNaturalNumbers(n-1);
    }

    public static float raiseTo(int a,int b)
    {
        if (b==0)
            return 1;
        return a*raiseTo(a,b-1);
    }




    public static void main(String[] args)
    {
        System.out.println("Day 8");
        System.out.println("recursion");
        System.out.println();
        printHello(5);
        System.out.println();
        System.out.println(sumOfNaturalNumbers(5));
        System.out.println();
        System.out.println((int) raiseTo(2,2));
    }
}






















































































