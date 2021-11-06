package DSA_One;

public class Day9
{



    public static int matrixPaths(int rows,int cols)
    {
        if (rows==1||cols==1)
            return 1;
        return matrixPaths(rows,cols-1)+matrixPaths(rows-1,cols);
    }


    public static int josephusProblem(int n,int k)
    {
        if (n==1)
            return 0;
        return (josephusProblem(n-1,k)+k)%n;
    }



















    public static void main(String[] args)
    {
        System.out.println("Day 9");
        System.out.println("recursion problems");
        System.out.println();
        System.out.println(josephusProblem(7,2)+1);
    }
}





























































































































