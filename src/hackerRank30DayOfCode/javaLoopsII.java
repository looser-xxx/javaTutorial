package hackerRank30DayOfCode;

import java.io.*;

public class javaLoopsII
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int numberOfTestCases=Integer.parseInt(ob.readLine());
        for (int testCase=0;testCase<numberOfTestCases;testCase++)
        {
            String[] input=ob.readLine().split(" ");
            int a=Integer.parseInt(input[0]);
            int b=Integer.parseInt(input[1]);
            int n=Integer.parseInt(input[2]);
            int sum=a;
            for (int i=0;i<n;i++)
            {
                sum+=(int)Math.pow(2,i)*b;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
