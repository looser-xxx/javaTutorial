package tutorial;

public class day7
{
    public static void main(String[] args)
    {
        System.out.println("day 7");
        System.out.println("conditional Statements");


        System.out.println();
        int age=19;
        if(age>=18)
        {
            System.out.println("you can vote now.");
        }
        else
        {
            System.out.println("you can not vote now");
        }
        if(age > 10 && age<20)
        {
            System.out.println("the number is between 10 and 20");
        }


//        ternary operator

//        variable =(condition)? expressionTrue : expressionFalse;

        int a=12;
        int b=8;
        int maxOfBothNumbers = (a>b)? a:b;
        System.out.println("max Of Both Numbers is : "+maxOfBothNumbers);


    }
}




































































