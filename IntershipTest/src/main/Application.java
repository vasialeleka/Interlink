package main;

import institution.University;
import institution.interlink.Intership;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CHNY");
        for (int i = 0; i<50 ;i++){  university.addStudents(new Student("Student"+i, i));}





        Intership intership = new Intership("Interlink",university);
        System.out.println("List of intership's students:");
        System.out.println(intership.addStudent());
    }
}
