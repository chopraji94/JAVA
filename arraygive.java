import java.util.Scanner;


public class arraygive{

    public static void main(String args[])
    {
        int n;
        System.out.println("Enter the size of array");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int myarray[] = new int[s];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<s;i++)
        {
            myarray[i] = scan.nextInt();
        }

        for(int i=0;i<s;i++)
        {
            System.out.println(myarray[i]);
        }
    }
}