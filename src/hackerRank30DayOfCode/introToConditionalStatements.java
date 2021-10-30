package hackerRank30DayOfCode;

import java.io.*;

public class introToConditionalStatements
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine().trim());

        if (n%2==0)
        {
            if (2<=n && n<=5)
                System.out.println("Not Weird");
            else
                if (6<=n && n<=20)
                    System.out.println("Weird");
                else
                    if (20<n)
                        System.out.println("Not Weird");
        }
        else
            System.out.println("Weird");
    }
}
