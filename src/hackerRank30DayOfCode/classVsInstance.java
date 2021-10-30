package hackerRank30DayOfCode;

import java.io.*;

public class classVsInstance
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("sdf");
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine());
        for (int i=0;i<n;i++)
        {
            int input=Integer.parseInt(ob.readLine());
            if (input<0)
            {
                System.out.println("Age is not valid, setting age to 0.");
                input=0;
            }
            for (int j=0;j<2;j++)
            {
                if (input<13)
                {
                    System.out.println("You are young.");
                    input+=3;
                }
                else if (input<18)
                {
                    System.out.println("You are a teenager.");
                    input+=3;
                }
                else
                {
                    System.out.println("You are old.");
                    input+=3;
                }
            }
            System.out.println();
        }
    }
}




































































