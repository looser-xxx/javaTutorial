package DSA_One;

public class Day7
{


    public static long normalMethod(int a,int b)
    {
        return (long) Math.pow(a,b);
    }
    public static long proMethod(int a,int b)
    {
        long res=1;
        while (b>0)
        {
            if((b&1)!=0)
                res*=a;
            a*=a;
            b=b>>1;
        }
        return res;
    }
    public static long ultraProMethod(int a,int b,int n)
    {
        long res=1;
        while (b>0)
        {
            if((b&1)!=0)
                res=(res*a%n)%n;
            a=(a%n*a%n)%n;
            b=b>>1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        System.out.println("Day 7");
        System.out.println();

//        calculating a to the power b

        int a;
        int b;
        int n;



        a=2;
        b=5;
        System.out.println("Normal Method");
        System.out.printf("%d raise to %d is equal to %d",a,b,normalMethod(a,b));
        System.out.println();
        System.out.println();




        a=3;
        b=5;
        System.out.println("Pro Method");
        System.out.printf("%d raise to %d is equal to %d",a,b,proMethod(a,b));
        System.out.println();
        System.out.println();




        a=3978432;
        b=5;
        n=1000000007;
        System.out.println("Ultra Pro Method");
        System.out.printf("%d raise to %d is equal to %d",a,b,ultraProMethod(a,b,n));
        System.out.println();






    }
}


































































