import Model.Student;

import java.util.Scanner;

public class Group {
    public int id;
    public String progLang;
    static Group [] groups = new Group[2];
    Student [] students;

    public Group(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input progLang");
        this.progLang = sc.nextLine();
    }
    public void printInformationG(){
        System.out.println(progLang);
    }
    public void addStudent (Student student){
    }
}

