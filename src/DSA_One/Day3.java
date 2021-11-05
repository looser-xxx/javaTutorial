package DSA_One;

public class Day3
{
    public static void main(String[] args)
    {
        System.out.println("Day 3");
        System.out.println("Bit Masking");
        System.out.println();



//        to find whether the bit at "i" position first take 1 and left shift it i times
//        if on doing & operation if we obtain a non-zero number then the bit is 1 else it is 0


//        suppose we have to check if 5th(from right) bit is 1 or 0
//        initial number      100110101
//        take 1              000000001
//        initial number      100110101
//        1 << 4              000010000
//        do & operation      000010000
//
//            if the number is 0 then the bit is 0 else the bit is 1






//        to replace a bit from 0 to 1. take 1 and left shift it till the bit to be converted
//        then perform | operation and the bit would be converted to 1 from 0

//        suppose we have to change 4th(from right side) bit from 0 to 1
//        initial number  100110101
//        take 1          000000001
//        initial number  100110101
//        do 1 << 3       000001000
//        do | operation  100111101



//        to replace a bit from 1 to 0. take 1 and left shift it till the bit to be converted
//        then perform  ^ operation. the bits are inverted. then perform & operation and
//        the bit is converted to 0 from 1


//        suppose we have to change 5th(from right side) bit from 1 to 0
//        initial number    100110101
//        take 1            000000001
//        do 1 << 5         000010000
//        initial number    100110101
//        do ^ operation    111101111
//        do & operation    100100101




//        to find the number of bits that are different between 2 numbers
//                                     a=10110
//                                     b=11011
//        to do this do ^ and we get     01101
//        then count the number of 1 in the number



//        to find number of set bits(1) in a number
//        brute force method
//        check if the number is even(increase the counter) or odd.(by this we can know if the last bit is 1 or 0) till we get the number 0

        // this method as a time complexity depends on number of bits
//        1101  1
//        0110  1
//        0011  2
//        0001  3
//        0000


//        number of bis in a number "n" can be found by doing log(n) with base 2


//        to do the above process with lower time complexity
//            find the number of bit's in a number
//         perform the formula n&(n-1) till the number obtained is 0
//        the number of time the loop gets iterated is the number of sit bits in a number









    }

}











































































































