import java.util.*;

public class iterarlist{

    public static void main(String args[]){

        ArrayList<String> names = new ArrayList<String>();
        names.add("mark");
        names.add("Jhon");
        names.add("Ram");
        names.add("Sham");

        ListIterator<String> itr = names.listIterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("");System.out.println("");

        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }
    }
}