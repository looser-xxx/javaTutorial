package com.company;

public class Main
{
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
    public static void main(String[] args)
    {
        int n=3;

        int[] range=new int[32];

        long res=0;
        int count=31;
        for (int i=0;i<=31;i++)
        {
            int mask=1<<i;
            long masked=n&mask;
            if (masked!=0)
            {
                range[i]= 1;
            }
        }
        for (int i=0;i<32;i++)
        {
            if (range[i]==1)
                res+=Math.pow(2,count);
            count--;

        }
        System.out.println(res);
    }
}
























