import java.util.ArrayList;

public class MyClass {

    public static void main(String args[]){

        ArrayList<Integer> mylist = new ArrayList<Integer>(5);
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);

        for (Integer x : mylist)
        {
            System.out.println(x);
        }

        System.out.println("Size = " + mylist.size());
        mylist.remove(2);

        for (Integer x : mylist)
        {
            System.out.println(x);
        }

        System.out.println("Size = " + mylist.size());

        mylist.set(0,200);

        for (Integer x : mylist)
        {
            System.out.println(x);
        }

        


    }
}