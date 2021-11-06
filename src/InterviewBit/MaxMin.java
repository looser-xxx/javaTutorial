package InterviewBit;

import java.util.Arrays;

public class MaxMin
{
    public static int solve(int[] a)
    {
        Arrays.sort(a);

        return a[0]+a[a.length-1];
    }
}

