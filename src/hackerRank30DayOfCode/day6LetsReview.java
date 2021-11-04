package hackerRank30DayOfCode;

import java.io.*;

public class day6LetsReview
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine());
        for (int i=0;i<n;i++)
        {
            String input=ob.readLine().trim();
            String evenString="",oddString="";
            for (int j=0;j<input.length();j++)
            {
                char ch=input.charAt(j);
                if (j%2==0)
                    evenString+=ch;
                else
                    oddString+=ch;
            }
            System.out.println(evenString+" "+oddString);
        }
    }
}
