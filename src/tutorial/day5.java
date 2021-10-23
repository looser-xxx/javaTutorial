package tutorial;

public class day5
{
    public static void main(String[] args)
    {
        System.out.println("day 5");
        System.out.println("Operators in Java");

//        arithmetic operations in java follow the rules of BODMAS

        int a=2;
        int b=3;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
//        adding
        int sum=a+b;
        System.out.println(sum);

//        product
        int product=a*b;
        System.out.println(product);

//        dividing
        int dividing=b/a;
        System.out.println(dividing);

//        remainder
        int remainder=b%a;
        System.out.println(remainder);
        System.out.println();

//        ++ / -- operator
        System.out.println(a++);  //here first "a" is displayed and then value of "a" is changed
        System.out.println(++b);  //here the value of "b" is first changed then displayed
        // the -- operator does the same
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println();
//        bitwise operator
        a=5;
        b=6;
        int c = a & b;
        System.out.println(c);
        a=10;
        b=13;
        c=a|b;
        System.out.println(c);

//        shift operation
//        on doing right shift we delete the right most bit and shift the whole number twards right and replace the vacant left place wight 0
//        the bits are shifted n times where n is the value entered
//        1101 -> 0110 -> 0011 -> 0001 -> 0000 -> 0000
//        the same is the case with left shift, just the order is reversed

        c=b>>1;
        System.out.println(c);
        c=a<<1;
        System.out.println(c);



//        assignment operator
//        = is an assignment operator
//        +=, -= , etc. all are assignment operator (even bit operator can be written in this format)


//        comparison operators
//        these compare values of variables
//        <, > ,<= ,>= ,== ,!= ,etc.

        System.out.println();
        a=3;
        b=7;
        System.out.println(a>b);
        System.out.println(a!=b);






    }
}





































































