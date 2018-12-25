import java.util.Scanner;

public class myclass{

    public static void main(String args[])
    {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        rec.setvar(5,5);
        tri.setvar(5,5);

        System.out.println("Area is: " + rec.area());
        System.out.println("Area is: " + tri.area());
    }
}