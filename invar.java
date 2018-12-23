import java.util.Scanner;


public class invar{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int var = scan.nextInt();

        System.out.println("The number entered is: ");
        System.out.println(var);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("ENter the decimal number");
        double dou = scan1.nextDouble();

        System.out.println("Entered decimal number ");
        System.out.println(dou);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the string");

        String var1 = scan2.nextLine();
        System.out.println("Entered string ");
        System.out.println(var1);
    }
}