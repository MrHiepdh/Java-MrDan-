package Week7;

import java.util.*;

public class Student {
    String name;
    String gender;
    int age;
    double gpa;

    public void Student(String name, String gender, int age, double gpa) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Age : " + age);
        System.out.println("GPA : " + gpa);
    }
}

class run {
    public static void main(String[] args) {
        Student st1 = new Student();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        int age = sc.nextInt();
        double gpa = sc.nextDouble();
        st1.Student(name, gender, age, gpa);
        st1.display();
        sc.close();
    }
}
