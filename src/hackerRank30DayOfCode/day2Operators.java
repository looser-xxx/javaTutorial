package hackerRank30DayOfCode;

import java.io.*;

public class day2Operators
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        double costOfMeal=Double.parseDouble(ob.readLine());
        int tipPercentage=Integer.parseInt(ob.readLine());
        int taxPercentage=Integer.parseInt(ob.readLine());
        double tipAmount=(double) costOfMeal/100*tipPercentage;
        double taxAmount=(double) costOfMeal/100*taxPercentage;
        int total= (int) Math.round(costOfMeal+taxAmount+tipAmount);
        System.out.println(total);
    }
}
