package otherAlgoPracticeForNow;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class HackerRankTeacherRatingProblem
{
    public static int minimumNumberOfCandies(int[] a)
    {
        int[] arr=new int[a.length];
        Arrays.fill(arr,1);

        for (int i=0;i<a.length-1;i++)
        {
            if (a[i+1]>a[i])
                arr[i+1]=1+arr[i];
        }
        for (int i=a.length-1;i>=1;i--)
        {
            if (a[i-1]>a[i]&& arr[i-1]<=arr[i])
                arr[i-1]=1+arr[i];
        }
        return IntStream.of(arr).sum();
    }













    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of students : ");
        int n=Integer.parseInt(ob.readLine());
        System.out.println("Enter rating of the students followed by pressing enter : ");
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=Integer.parseInt(ob.readLine());
        System.out.println(minimumNumberOfCandies(arr));
    }
}






















