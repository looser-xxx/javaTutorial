package tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day16
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("day 16");
        System.out.println("arrays");







        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of students : ");
        int n=Integer.parseInt(ob.readLine());

        int[] marks=new int[n];
        System.out.println("Enter the marks now : ");
        for(int i=0;i<n;i++)
            marks[i]=Integer.parseInt(ob.readLine());
        int averageMarks=0;
        for (int i=0;i<n;i++)
            averageMarks+=marks[i];
        System.out.println("average marks is : "+averageMarks/n);




    }
}





















































































