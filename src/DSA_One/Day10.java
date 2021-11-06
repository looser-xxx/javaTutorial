package DSA_One;

import javax.swing.*;

public class Day10
{


    public static boolean isPalindrome(String s,int l,int r)
    {
        if(l>=r)
            return true;
        if (s.charAt(l)!=s.charAt(r))
            return false;
        return isPalindrome(s,l+1,r-1);
    }

    public static void powerSet(String s,int i,String cur)
    {
        if (i==s.length())
        {
            System.out.println(cur);
            return;
        }
        powerSet(s,i+1,cur+s.charAt(i));
        powerSet(s,i+1,cur);
    }
























    public static void main(String[] args)
    {
        System.out.println("Day 10");
        System.out.println("String Recursion");
        System.out.println();
        String s="pop";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}

























































































































