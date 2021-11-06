package InterviewBit;

public class AddOneToNumber
{
    public static long proMethod(int a,int b)
    {
        long res=1;
        while (b>0)
        {
            if((b&1)!=0)
                res*=a;
            a*=a;
            b=b>>1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] a={1,2,3};
        int c=2;
        int sum=1;
        for ( int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                sum+=a[i]*proMethod(10,c);
            }
            c--;
        }
        System.out.println(sum);
    }
}
















































