package Model;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    boolean[] homework;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void getprintInformation() {
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

    public void setAge(int age) {
        if (age < 100 && age > 0) {
            System.out.println("Человек жив");
        } else if (age > 100 || age < 0) {
            System.out.println("Человек мертв");
        }
    }
    static int getNumberOfStudent() {
        return students;
    }
}

