package tutorial;

public class day19
{
    public static void main(String[] args)
    {
        System.out.println("day 19");
        System.out.println("String");


        System.out.println();
//        normal method of creating a String variable
        String name="looser";
        System.out.println(name);


        System.out.println();
//        class method of creating a String variable
        String anotherName =new String("Jhon");
        System.out.println(anotherName);


        System.out.println();
        String s="Anuj Kumar Sharma";
        System.out.println("length : "+s.length());
        System.out.println("character at index 3 is : "+s.charAt(3));
        System.out.println("substring between 5 and 12 is : "+s.substring(5,12));
        System.out.println(s.contains("Anuj"));
        String[] allWords=s.split(" ");
        for (String word:allWords)
            System.out.println(word);































    }
}
































































































