package InterviewBit;

import java.util.Arrays;

public class SearchInBionicArray
{
    public static int solve(int[] a, int k)
    {


        int[] b=new int[a.length];
        for (int i=0;i<a.length;i++)
            b[i]=a[i];
        Arrays.sort(a);
        int i=0;
        int l=a.length-1;
        int index=-1;
        while (i<=l)
        {
            int m=(i+l)/2;
            if (a[m]==k)
            {
                index=m;
                break;
            }
            if (a[m]>k)
                l=m-1;
            else
                i=m+1;


        }

        int finalIndex=index;

        if (index>0)
        {
            for (int d=0;d<b.length;d++)
                if (b[d]==k)
                {
                    finalIndex=d;
                    break;
                }
        }

        return finalIndex;
    }
    public static void main(String[] args)
    {

        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21};

        System.out.println(solve(a,1));














    }
}





















































