package hackerRank30DayOfCode;

import java.io.*;

public class day5Loops
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine());
        for (int i=1;i<11;i++)
        {
            System.out.printf("%d x %d = %d",n,i,n*i);
            System.out.println();
        }
    }
}
