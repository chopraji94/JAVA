import java.util.Scanner;

public class operation{

    public static void main(String args[])
    {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Enter the first number");
        int x = scan1.nextInt();

        System.out.println("Enter the second number");
        int y = scan2.nextInt();

        int answer = x+y;
        int answer2 = x*y;
        System.out.println(answer2);
        System.out.println(answer);
    }
}