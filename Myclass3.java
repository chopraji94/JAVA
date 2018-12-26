import java.util.*;

public class Myclass3{

    public static void main(String args[]){

        HashSet<String> name = new HashSet<String>();
        name.add("mark");
        name.add("tom");
        name.add("Jacky");
        name.add("Jacky");

        Iterator<String> itr = name.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}