import java.util.Scanner;

public class switching{

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int x = scan.nextInt();

        switch(x)
        {
            case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Bye");
            break;
            default:
            System.out.println("No");
            break;
        }

    }
}