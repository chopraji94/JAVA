import java.util.Scanner;

public class condition{

    public static void main(String args[])
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = scan1.nextInt();
        if (x == 10)
        {
            System.out.println("Out");
        }
        else
        {
            System.out.println("Not Out");
        }
    }
}