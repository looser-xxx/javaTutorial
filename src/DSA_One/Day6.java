package DSA_One;

import java.util.Arrays;

public class Day6
{

    static int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args)
    {
        System.out.println("Day 6");
        System.out.println();


//        printing all the prime numbers in a given range

        int rangeOfPrime=40;
        boolean[] range=new boolean[rangeOfPrime+1];
        Arrays.fill(range,true);
        range[0]=false;
        range[1]=false;

        for (int i=2;i*i<=rangeOfPrime;i++)
        {
            for (int j=2*i;j<=rangeOfPrime;j+=i)
            {
                range[j]=false;
            }
        }
        for (int i=0;i<=rangeOfPrime;i++)
            if (range[i])
                System.out.println(i);


        System.out.println();
        int a=24;
        int b=60;
        System.out.printf("GCD of %d and %d is equal to %d.",a,b,gcd(a,b));
        System.out.println();






















































































    }
}














































































