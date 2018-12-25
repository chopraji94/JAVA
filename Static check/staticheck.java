import java.util.Scanner;

public class staticheck{
    public static void main(String args[]){

        Student stud1 = new Student();
        Student stud2 = new Student();

        System.out.println("No of students are " + Student.getnostudent()); //The static method are to be used with class name and non static with instance name
    }
}