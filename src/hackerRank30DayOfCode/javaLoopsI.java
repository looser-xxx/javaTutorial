package hackerRank30DayOfCode;

import java.io.*;

public class javaLoopsI
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(ob.readLine().trim());
        for(int i=1;i<=10;i++)
        {
            int multiple=N*i;
            System.out.printf("%d x %d = %d",N,i,multiple);
            System.out.println();
        }
    }
}
