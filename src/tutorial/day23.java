package tutorial;

public class day23
{
    public static void main(String[] args)
    {
        System.out.println("day 23");
        System.out.println();
        System.out.println(maxOf(34,54));
        System.out.println();
        System.out.println(maxOf(56,34,57));
    }
    static int maxOf(int a,int b)
    {
        return Math.max(a, b);
    }
//    methods can be overloaded by using different parameters
    static int maxOf(int a, int b, int c)
    {
        if (a>b)
            return Math.max(a,c);
        else
            return Math.max(b,c);
    }
}
