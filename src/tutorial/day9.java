package tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day9
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("day 9");
        System.out.println("Switch Statement");


        System.out.println();
        int dayOfWeek=3;
        switch (dayOfWeek)
        {
            case 1:
                System.out.println("i'm on leave");
                break;
            case 2:
                System.out.println("I'm in office");
                break;
            case 3:
                System.out.println("I'm playing football");
                break;
            default:
                System.out.println("I don't know what day it is");
        }



//        creating a basic calculator
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of a : ");
        int a=Integer.parseInt(ob.readLine());
        System.out.println("Enter value of b : ");
        int b=Integer.parseInt(ob.readLine());
        System.out.println("Enter the operator : ");
        String s=ob.readLine();
        int result=0;

        switch (s)
        {
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
            default:
                System.out.println("not operable");
        }
        System.out.println(result);


















    }
}








































































