package DSA_One;

public class Day4
{



    public static int countOfBits(int n)
    {
        return (int)(Math.log(n)/Math.log(2)+1);
    }



    public static void main(String[] args)
    {
        System.out.println("Day 4");
        System.out.println("XOR Problems");
        System.out.println();

//        algorithm to find the non repeating number in an array
//        XOR or 2 same number is 0
//        3 ^ 10 ^3 = 10  this happens as both the 3 git's cancelled

        int[] arr={5,4,1,4,3,5,1};
        int res=0;
        for (int i: arr)
            res=res^i;

        System.out.println(res);
        System.out.println();



//        algorithm to find the two non repeating numbers in an array



        int[] a1={2,2,1,1,4,7,5,5,9,9};
        res=0;
        for (int i:a1)
            res=res^i;
        int temp=res;
        int countOfFirstSetBit=0;
        for (int i=0;i<countOfBits(res);i++)
        {
            int mask=1<<i;
            if ((res&mask)!=0)
                countOfFirstSetBit=i;
        }
        for (int i:a1)
        {
            int val=i&(1<<countOfFirstSetBit);
            if(val!=0)
            {
                res=res^i;
            }
        }
        System.out.println(res);
        System.out.println(temp^res);
        System.out.println();


//        algorithm to find the number which occurs only once but others occurs "k" times


        int[] a2={2,2,1,1,2,10,1,1,2};
        int k=4;
        int[] bitCount=new int[31];
        int max=Integer.MIN_VALUE;
        for( int i:a2)
        {
            int noOfBits=countOfBits(i);
            max=Math.max(max,noOfBits);
            for (int j=0;j<noOfBits;j++)
            {
                int masked=i&(1<<j);
                if (masked!=0)
                    bitCount[j]++;
            }
        }
        for (int i=0;i<max;i++)
        {
            bitCount[i]=bitCount[i]%k;
        }

        int n=0;
        for (int i=0;i<max;i++)
        {
            if (bitCount[i]==1)
                n+=Math.pow(2,i);

        }
        System.out.println(n);


















































































    }
}























































































