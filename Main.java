import Model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.firstName);
        student.firstName = "Alex";
        student.lastName = "Harlamov";
        student.age = 18;
        System.out.println(student.firstName);
        student.printInformation();
        System.out.println(student.getFullName("Mr "));
    }
}
