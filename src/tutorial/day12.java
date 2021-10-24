package tutorial;

public class day12
{
    public static void main(String[] args)
    {
        System.out.println("day 11");
        System.out.println("jump statements");

        System.out.println();
        System.out.println("break");
//        break terminates the loop and doesn't allow any code to be executed further in that particular loop
        int n=3;
        for(int i=0;i<12;i++)
        {
            System.out.println("first statement"+i);
            if (i==n)
                break;
            System.out.println("second statement");
        }


        System.out.println();
        System.out.println("continue");
//        continue skips to iterate the code next to it and moves to the next iteration in that particular loop

        for(int i=0;i<5;i++)
        {
            if(i==2)
                continue;
            System.out.println(i);
        }


        System.out.println();
        System.out.println("nested for loop");

        for (int j=1;j<=5;j++)
            for (int i=1;i<=10;i++)
                System.out.println(i);
    }
}
















































































