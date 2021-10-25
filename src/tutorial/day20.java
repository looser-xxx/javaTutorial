package tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day20
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("day 20");
        System.out.println("anagram");

        System.out.println();
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first string : ");
        String a=ob.readLine();
        System.out.println("Enter the second string : ");
        String b=ob.readLine();

        System.out.println();
        System.out.println("slow algo");
        int[] ar=new int[a.length()];
        for (int i=0;i<a.length();i++)
            ar[i]= a.charAt(i);

        int[] br=new int[b.length()];
        for (int i=0;i<b.length();i++)
            br[i]= b.charAt(i);

        int n=br.length;
        for (int i=0;i<n-1;i++)
        {
            int minInd=i;
            for (int j=i;j<n;j++)
            {
                if (ar[j]<ar[minInd])
                    minInd=j;
            }
            int temp=ar[i];
            ar[i]=ar[minInd];
            ar[minInd]=temp;
        }


        for (int i=0;i<n-1;i++)
        {
            int minInd=i;
            for (int j=i;j<n;j++)
            {
                if (br[j]<br[minInd])
                    minInd=j;
            }
            int temp=br[i];
            br[i]=br[minInd];
            br[minInd]=temp;
        }
        boolean flag=false;
        for (int i=0;i<n;i++)
        {
            if (ar[i]==br[i])
                flag=true;
            else
            {
                flag=false;
                break;
            }
        }
        if (flag)
            System.out.println("yes");
        else
            System.out.println("no");


        System.out.println();
        System.out.println("fast algo");

        int[] as=new int[256];

        for (int i=0;i<a.length();i++)
        {
            as[a.charAt(i)]++;
            as[b.charAt(i)]--;
        }
        flag=true;
        for (int i=0;i<256;i++)
            if (as[i]!=0)
            {
                flag=false;
                break;
            }
        if (flag)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}














































