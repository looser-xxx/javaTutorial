package tutorial;

import java.io.*;

public class day17
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("day 17");
        System.out.println("multidimensional array");




        System.out.println();
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows : ");
        int rows=Integer.parseInt(ob.readLine());
        System.out.println("enter the number of columns : ");
        int columns=Integer.parseInt(ob.readLine());

        int[][] a=new int[rows][columns];
        int[][] b=new int[rows][columns];
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
                a[i][j]=Integer.parseInt(ob.readLine());
        }
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
                b[i][j]=Integer.parseInt(ob.readLine());
        }

        int[][] c=new int[rows][columns];


        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
                c[i][j]=a[i][j]+b[i][j];
        }

        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<columns;j++)
                System.out.print(c[i][j]+" ");
            System.out.println();
        }


















    }
}








































































