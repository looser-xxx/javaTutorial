package tutorial;

import java.io.*;

public class day27
{
    static void arrayMethodForReversingStringByWords(String[] stringForArrayMethod)
    {
        System.out.println();
        System.out.println("this method only works if words are separated by blank spaces only");
        for (int i=stringForArrayMethod.length-1;i>=0;i--)
            if (i!=0)
                System.out.print(stringForArrayMethod[i]+" ");
            else
                System.out.println(stringForArrayMethod[i]);
    }

    static void standardMethodForReversingStringByWords(String s)
    {
        s=s.trim();
        StringBuilder tempString = new StringBuilder();
        StringBuilder finalString = new StringBuilder();
        boolean countForSpace=false;
        s+=" ";
        boolean wordCount=false;
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch==' ' || ch==',' || ch=='.')
            {
                if (!countForSpace)
                {
                    countForSpace=true;
                    if (wordCount)
                    {
                        tempString.append(" ");
                    }
                    wordCount=true;
                    finalString.insert(0, tempString);
                    tempString = new StringBuilder();
                }
            }
            else
            {
                countForSpace=false;
                tempString.append(ch);
            }
        }

        System.out.println(finalString);
    }


    public static void main(String[] args)throws IOException
    {
        System.out.println("day 27");
        System.out.println("reversing a string word by word");
        BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("Enter a string : ");
        String inputString=ob.readLine();

        arrayMethodForReversingStringByWords(inputString.split(" "));
        standardMethodForReversingStringByWords(inputString);

    }
}

































































