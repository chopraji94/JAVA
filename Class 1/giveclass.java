import java.util.Scanner;

public class giveclass{

    public static void main(String args[])
    {
        Student mark = new Student();

        mark.id = 100;
        mark.age = 20;
        mark.marks = 100;
        System.out.println("Marks got " + mark.id + " " + mark.age+ " " + mark.marks);
    }
}
