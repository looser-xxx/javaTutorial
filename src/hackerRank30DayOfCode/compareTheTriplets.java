package hackerRank30DayOfCode;

import java.io.*;

public class compareTheTriplets
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String[] s1=ob.readLine().split(" ");
        String[] s2=ob.readLine().split(" ");
        int Alice=0;
        int Bob=0;
        for (int i=0;i<3;i++)
        {
            if (Integer.parseInt(s1[i]) < Integer.parseInt(s2[i]))
                Bob++;
            else
                Alice++;
        }
        System.out.printf("%d %d",Alice,Bob);
    }
}
