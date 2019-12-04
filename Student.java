package Model;

import java.util.Scanner;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public int birthday;
    public boolean[] homework;
    public static int students = 0;

    public Student() { // another
        Scanner sc = new Scanner(System.in);
        System.out.println("input firstName");
        this.firstName = sc.nextLine();
        System.out.println("input lastName");
        this.lastName = sc.nextLine();
        System.out.println("input age");
        this.age = sc.nextInt();
        homework = new boolean[10];
        students++;
    }

    public void printInformation() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFullName(String prefix) {
        return prefix + firstName + " " + lastName;
    }

    public void birthday() {
        age++;
    }

    public void doHomework(int i) {
        homework[i] = true;
    }

    public int[] getHomeworkDone() {
        int doneHomework = 0;
        for (int i = 0; i < homework.length; i++) {
            if (homework[i] == true) {
                System.out.println(homework[i]);
                doneHomework++;
            }
        }
        int[] getHomeworkDone = new int[doneHomework];
        int count = 0;
        for (int i = 0; i < homework.length; i++) {
            if (homework[i]) {
                getHomeworkDone[count] = i;
                count++;
            }
        }
        return getHomeworkDone;
    }

    static int getNumberOfStudent() {
        return students;
    }
}

