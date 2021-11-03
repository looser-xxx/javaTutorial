package otherAlgoPracticeForNow;

import java.io.*;
import java.util.Arrays;

public class TwoPointersAlgo
{


    public static boolean twoSum(int[] a,int x)
    {
        x=x*-1;
        int i=0;
        int j=a.length-1;
        while (i<j)
        {
            int sum=a[i]+a[j];
            if (sum>x)
                j--;
            else
                if (sum<x)
                    i++;
            else
                return true;
        }
        return false;
    }



    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of array : ");
        int n=Integer.parseInt(ob.readLine());
        System.out.printf("enter %d numbers : ",n);
        System.out.println();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=Integer.parseInt(ob.readLine());
        Arrays.sort(arr);
        boolean finalResult=false;
        for (int j=0;j<n-2;j++)
        {
            if (twoSum(arr,arr[j]))
            {
                System.out.println("1");
                finalResult=true;
                break;
            }
        }
        if (!finalResult)
            System.out.println("0");
    }
}




















































