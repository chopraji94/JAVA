import java.util.Scanner;



class threadhere{
    public static void main(String args[])
    {
        NewThread one = new NewThread("Threadone");
        NewThread two = new NewThread("Threadtwo");
        try
        {
            Thread.sleep(1000);
            one.threadSuspend();
            System.out.println("Thread one suspended");

            Thread.sleep(1000);
            one.threadResume();
            System.out.println("Thread one resumed");

            Thread.sleep(1000);
            two.threadSuspend();
            System.out.println("Thread two suspended");

            Thread.sleep(1000);
            one.threadResume();
            System.out.println("Thread two resumed");

        }catch(Exception e){
            System.out.println("Thread interrupt "+e);
        }

        try
        {
            System.out.println("Waiting for threads to finish");
            one.t.join();
            two.t.join();

        }catch(Exception e){
            System.out.println("Thread Intrupted "+e);
        }
    }
}