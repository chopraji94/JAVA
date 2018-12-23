import java.util.Scanner;

public class stringuse{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String x = scan.nextLine();
        System.out.println(x);
        System.out.println(x.length());
        System.out.println(x.toUpperCase());
        System.out.println(x.replace('e','a'));
    }
}