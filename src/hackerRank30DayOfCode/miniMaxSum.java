package hackerRank30DayOfCode;

import java.io.*;
import java.util.*;

public class miniMaxSum
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String[] s=ob.readLine().split(" ");
        int n=s.length;
        Arrays.sort(s);
        long x=0;
        long y=0;
        for(int i=0;i<4;i++){
            x+=Integer.parseInt(s[i]);
        }
        for(int i=1;i<5;i++){
            y+=Integer.parseInt(s[i]);
        }
        System.out.println(x+" "+y);
    }
}




































