import java.util.Scanner;

public class Student{

    int age;
    static int noofstudent = 0;

    Student()
    {
        noofstudent++;
    }

    public static int getnostudent()
    {
        return (noofstudent);
    }

    public void getage(int age)
    {
        this.age = age;
    }

    public int setage()
    {
        return (age);
    }

}