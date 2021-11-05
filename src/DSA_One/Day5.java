package DSA_One;

public class Day5
{
    public static void main(String[] args)
    {
        System.out.println("Day 5");
        System.out.println();
        System.out.println("Calculating factorial of a number.");
        
        int numberToFindFactorial=8;
        int factorialOfTheNumber=1;
        for (int i=1;i<=numberToFindFactorial;i++)
            factorialOfTheNumber*=i;
        System.out.println("factorial of "+numberToFindFactorial+" is equal to : "+factorialOfTheNumber);


        System.out.println();
        System.out.println("trailing zeroes in factorial");
        int n=18;
        int res=0;
        for (int i=5;i<n;i*=5)
            res+=n/i;
        System.out.printf("There are %d zero in factorial of %d",res,n);
        System.out.println();


















        
        
    }
}














































































