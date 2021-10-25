package hackerRank30DayOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class printF
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String[] input=ob.readLine().split(" ");
            if (input[1].length()!=3)
            {
                int extra0ToBeAdded=3-input[1].length();
                for (int j=0;j<extra0ToBeAdded;j++)
                    input[1]="0"+input[1];
            }
            System.out.print(input[0]);
            for (int j=0;j<15-input[0].length();j++)
                System.out.print(" ");
            System.out.print(input[1]);
            System.out.println();
        }
        System.out.println("================================");
    }
}


























































