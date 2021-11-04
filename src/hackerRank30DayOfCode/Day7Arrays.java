package hackerRank30DayOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day7Arrays
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine());
        String[] input=ob.readLine().trim().split(" ");
        for (int i=input.length-1;i>=0;i--)
        {
            System.out.print(input[i]);
            if (i==0)
                break;
            else
                System.out.print(" ");
        }

    }
}
