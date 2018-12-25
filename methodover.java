import java.util.Scanner;

public class methodover{
    public static void main(String args[]){
        System.out.println(Add(1,2));
        System.out.println(Add(11.22,22.22));
        System.out.println(Add("Hello"," World"));
    }

    public static int Add(int a , int b)
    {
        return(a+b);
    }

    public static double Add(double a, double b)
    {
        return(a+b);
    }

    public static String Add(String a, String b)
    {
        return(a+b);
    }
}