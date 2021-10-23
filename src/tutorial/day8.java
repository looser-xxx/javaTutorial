package tutorial;

public class day8
{
    public static void main(String[] args)
    {
        System.out.println("day 8");
        System.out.println("nested if/else and logical operator");


        System.out.println();
        int number=45;
        if(number>=1 && number<=100)
            System.out.println("number is in range");

        System.out.println();
        int grade=10;
        if(grade==10|| grade==12)
            System.out.println("you can give board exams now");



        grade=11;
        if(!(grade==10|| grade==12))
            System.out.println("you can not give board exams now");


        System.out.println();
        int a=2;
        int b=3;
        int c=4;
        int result;

        if (a>b)
        {
            if(a>b)
                result=a;
            else
                result=c;
        }
        else
            if(b>c)
                result=b;
            else
                result=c;

        System.out.println(result);




















    }
}






























































































