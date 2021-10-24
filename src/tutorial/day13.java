package tutorial;

public class day13
{
    public static void main(String[] args)
    {
        System.out.println("day 13");
        System.out.println("question solving");


        System.out.println();
        System.out.println("question 1");
        for(int i=1;i<=11;i++)
        {
            for (int j=1;j<21;j++)
                System.out.print((i*j)+" ");
            System.out.println();
        }


        System.out.println();
        System.out.println("question 2");
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++)
                System.out.print("*  ");
            System.out.println();
        }


        System.out.println();
        System.out.println("question 3");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }


        System.out.println();
        System.out.println("question 4");
        for(int i=3;i>=0;i--)
        {
            for (int k=3;k>i;k--)
                System.out.print("  ");
            for (int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}





























































