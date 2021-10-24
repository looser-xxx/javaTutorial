package tutorial;

public class day14
{
    public static void main(String[] args)
    {
        System.out.println("day 14");
        System.out.println("questions");

        System.out.println();
        System.out.println("question 1");
        for(int i=0;i<4;i++)
        {
            for (int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }


        System.out.println();
        System.out.println("question 2");
        for(int i=3;i>=0;i--)
        {
            for (int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }


        System.out.println();
        System.out.println("question 3");
        for(int i=0;i<4;i++)
        {
            for(int k=3;k>  i;k--)
                System.out.print("  ");
            for(int j=0;j<=i;j++)
                System.out.print("*   ");
            System.out.println();
        }


        System.out.println();
        System.out.println("question 4");
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if (j==0 || j==i || i==9)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}












































































