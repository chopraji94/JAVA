import java.util.Scanner;

public class trandca{

    public static void main(String args[]){

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Enter the first number :");
        int x = scan1.nextInt();
        System.out.println("Enter the second number :");
        int y = scan1.nextInt();

        int a[] = new int[2];
        try{
        //int r = x/y;
        System.out.println(a[3]);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("------------------");
    }
}