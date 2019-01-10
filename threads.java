import java.util.Scanner;

class threads{
    public static void main(String args[])
    {
        Thread t = new Thread();

        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Printing "+i);
                t.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}