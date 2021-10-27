package hackerRank30DayOfCode;

import java.io.*;

public class day1DataTypes
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        int intInput=Integer.parseInt(ob.readLine());
        double doubleInput=Double.parseDouble(ob.readLine());
        String stringInput=ob.readLine();
        int i=4;
        double d=4.0;
        String s="HackerRank ";
        System.out.println(i+intInput);
        System.out.println(d+doubleInput);
        System.out.println(s+stringInput);
    }
}
