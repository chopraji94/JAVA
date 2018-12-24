import java.util.Scanner;

public class Cube{
    int len;
    int bre;
    int heig;
    
    Cube()
    {
        len = 2;
        bre = 2;
        heig = 2;
    }

    public int getvolume()
    {
        return (len*bre*heig);
    }
}