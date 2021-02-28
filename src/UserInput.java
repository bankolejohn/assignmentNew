import java.util.Scanner;
import java.util.*;

class Student {
    Scanner sc = new Scanner(System.in);
    int Total = 0, subjects;
    double avg =0;
    String name;
    int marks [];

    Student() {
        System.out.print(" Enter Student name: ");
        name = sc.next();;
        getDisMArks();

    }
    void getDisMArks() {
        marks = new int[5];
        System.out.print("Enter marks of Maths: ");
        marks[0]= sc.nextInt();
        System.out.print("Enter mark of English: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter mark of Physics: ");
        marks[2] = sc.nextInt();
        System.out.print("Enter mark of Chemistry: ");
        marks[3] = sc.nextInt();
        System.out.print("Enter mark of Biology: ");
        marks[4] = sc.nextInt();
        for(int i=0; i<5; i++) {
            Total += marks[i];
            avg = Total/ marks.length;
        }
        System.out.println("Total Mark of  " + name + " is " + Total);
        System.out.println("Average Mark of " +name+ " is " + avg);

    }
}

public class UserInput {
    public static void main(String[] args) {

        Student s[] = new Student[5];
        for(int i=0; i<5; i++) {
            s[i] = new Student();
        }



        // grade of student after getting average of six subjects 09062694143
       /* int marks[] = new int[6];
        int i;
        float total =0, avg;

        Scanner scanner = new Scanner(System.in);

        for(i=1; i< marks.length; i++) {
            System.out.println("Enter Marks of Subject"+(i)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];

        }*/



    }
}
