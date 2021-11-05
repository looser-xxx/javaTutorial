package DSA_One;

public class Day2
{
    public static void main(String[] args)
    {
        System.out.println("Day 2");
        System.out.println("Bit Manipulation Algorithms Part 1");
        System.out.println();

//        bitwise operator
//            &  ==> when both are 1 then only 1
//            |  ==> when any one is 1 then 1
//            ^  ==> when both are different from only 1
//            ~  ==> this reverses the bits
//            >> ==> this shifts the bits towards right (it's basically dividing by 2)
//            << ==> this shifts the bits towards left  (it's basically multiplying by 2)


//        all the odd number's last digit in binary is 1
//        all the even number's last digit in binary is 0

//        if(n%2++0)  can be replaced by if(n&1==0)


//        for swapping any two numbers just do the following code
        int a=5;
        int b=7;
        System.out.printf("a= %d, b=%d",a,b);
        System.out.println();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.printf("a= %d, b=%d",a,b);












    }
}

































































