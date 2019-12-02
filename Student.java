package Model;

import java.util.Scanner;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public Student() { // another
        Scanner sc = new Scanner(System.in);
        System.out.println("input firstName");
        this.firstName = sc.nextLine();
        System.out.println("input lastName");
        this.lastName = sc.nextLine();
        System.out.println("input age");
        this.age = sc.nextInt();
    }
    public void printInformation() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);

    }
    public String getFullName(String prefix) {
        return prefix + firstName + " " + lastName;
    }
}

