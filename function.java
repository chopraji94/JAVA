import java.util.Scanner;

public class function{
    
    public static void main(String[] args)
    {
        myfun();
        parafun("Pranav");
        add(1,2);
        int r = addre(1,3);
        System.out.println(r);
    }

    public static void myfun()
    {
        System.out.println("In the function");
    }

    public static void parafun(String name)
    {
        System.out.println("Hello "+name);
    }

    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }

    public static int addre(int a,int b)
    {
        return(a+b);
    }
}