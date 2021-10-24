package tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day11
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("day 11");
        System.out.println("for loops");
        System.out.println();


        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("factorial of a number");
        System.out.println("Enter a number : ");
        int factorial=1;
        int n=Integer.parseInt(ob.readLine());
        for (int i=1;i<=n;i++)
            factorial*=i;
        System.out.println("Factorial of "+n+" is : "+factorial);


        System.out.println();
        System.out.println("Fibonacci series");
        System.out.println("Enter the value of n : ");
        n=Integer.parseInt(ob.readLine());
        int a=0;
        int b=1;
        System.out.println(a+" ");
        System.out.println(b+" ");

        for (int i=3;i<=n;i++)
        {
            int c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }


        System.out.println();
        System.out.println("prime number");
        n=Integer.parseInt(ob.readLine());
        int c=0;
        for(int i=1;i<n;i++)
        {
            if (n==1)
                break;
            if (n%i==0)
                    c++;
        }
        if (c>1)
            System.out.println("not prime");
        else
            System.out.println("prime");






        n=Integer.parseInt(ob.readLine());
        c=0;
        for(int i=1;i*i<=n;i++)
        {
            if (n==1)
                break;
            if (n%i==0)
                c++;
        }
        if (c>1)
            System.out.println("not prime");
        else
            System.out.println("prime");






        n= Integer.parseInt(ob.readLine());
        int fac= (int) Math.sqrt(n);
        int flag=0;
        for(int i=1;i<n;i++)
        {
            int facInLoop=n%i;
            if (1<facInLoop && facInLoop<fac)
            {
                flag=1;
                System.out.println("not prime");
                break;
            }
        }
        if (flag==0)
        {
            System.out.println("prime");
        }





        n=Integer.parseInt(ob.readLine());
        double sum=0.0;
        for (float i=1;i<=n;i++)
        {
            sum+=1/i;
        }
        System.out.println(sum);


















    }
}
































































































