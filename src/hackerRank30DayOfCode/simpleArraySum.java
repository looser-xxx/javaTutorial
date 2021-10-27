package hackerRank30DayOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class simpleArraySum
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine());
        String[] s=ob.readLine().split(" ");
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=Integer.parseInt(s[i]);
        System.out.println(sum);
    }
}
