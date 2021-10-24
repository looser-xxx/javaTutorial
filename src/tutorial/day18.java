package tutorial;

public class day18
{
    public static void main(String[] args)
    {
        System.out.println("day 18");
        System.out.println("sorting");


        System.out.println();
        System.out.println("bubble shot");
        int[] a={2,1,8,-3,6,4,12};
        int n=a.length;

        for(int i=0;i<n-1;i++)
        {
            boolean sorted=true;
            for(int j=0;j<n-i-1;j++)
                if(a[j+1]<a[j])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    sorted=false;
                }
            if (sorted)
                break;
        }

        for (int item:a)
            System.out.println(item);


        System.out.println();
        System.out.println("selection sort");
        int[] ar={2,1,-2,7,4,0};
        n=ar.length;
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

        for (int e:ar)
            System.out.println(e);



























    }
}




























































