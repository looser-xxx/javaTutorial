package tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class day4
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("day 4");
        System.out.println("Type Casting");

//        automatic type casting automatically casts variable if is stored to it's higher value



        byte x=4;
        int y=x;
        System.out.println(y);

//        explesit type casting is when we force the variable to get casted against it's memory capacity

        double myDouble =2.8462;
        int myInt=(int)myDouble;

//        flore value is displayed unless specified
        System.out.println(myDouble);
        System.out.println(myInt);

        System.out.println("Taking user input");
        System.out.println("Scanner");

        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number");
        int inputValueInt=sc.nextInt();
        System.out.println(inputValueInt);

        System.out.println("enter a double value");
        double inputValueDouble =sc.nextDouble();
        System.out.println(inputValueDouble);

//        here I am getting some error while taking string input
//        System.out.println("enter a string value");
//        String inputValueString = sc.nextLine();
//        System.out.println(inputValueString);



//        calculating simple interest
//
        int principle =sc.nextInt();
////        to initialise a flute value you either need to do explicit type casting or you have to write "f" at the end of the number as shown below
////        float rate =12.5f;
        float rate=sc.nextFloat();
        int time=sc.nextInt();
        float simpleInterest=principle*rate*time/100;
        System.out.println("simple interest is : "+simpleInterest);


//        using BufferedReader

        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        String thisIsInputString = ob.readLine();
        System.out.println(thisIsInputString);







    }
}



























































