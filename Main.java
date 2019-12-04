import Model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.firstName);
        System.out.println(student.lastName);
        System.out.println(student.age);
        System.out.println(student.getFullName("Mr "));
        System.out.println(Student.students);
        student.doHomework(3);
        int [] homeWorkDone = student.getHomeworkDone();
        for(int i = 0; i < homeWorkDone.length; i++){
            System.out.println(homeWorkDone[i]);
        }

    }
}
