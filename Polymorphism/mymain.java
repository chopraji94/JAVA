import java.util.Scanner;

public class mymain{

    public static void main(String args[])
    {
        Bank abc = new Bank_A();
        Bank def = new Bank_B();

        System.out.println(abc.getrate());
        System.out.println(def.getrate());
    }
}