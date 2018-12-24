import java.util.Scanner;

public class getset{

    public static void main(String args[]){

        student1 mark = new student1();

        mark.getid(1);
        mark.getmarks(100);

        System.out.println("Id for Mark =  " + mark.setid() + " with marks " + mark.setmarks());

        student1 tom = new student1();

        tom.getid(2);
        tom.getmarks(99);

        System.out.println("Id for Mark =  " + tom.setid() + " with marks " + tom.setmarks());
    }
}