package hackerRank30DayOfCode;

import java.io.*;

public class aVeryBigSum
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine());
        String[] numbers=ob.readLine().split(" ");
        long sum=0;
        for (int i=0;i<n;i++)
            sum=sum+Integer.parseInt(numbers[i]);
        System.out.println(sum);
    }
}
