package main;

import institution.University;
import institution.interlink.Intership;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CHNY");
        // System.out.println(university.getNameUniversity());
        university.addStudents(new Student("Vasia", 1));
        university.addStudents(new Student("Vasia1", 2));
        university.addStudents(new Student("Vasia2",3));
        university.addStudents(new Student("Vasia3",4));
        university.addStudents(new Student("Vasia4",5));
        university.addStudents(new Student("Vasia5",6));



        Intership intership = new Intership("Interlink",university);
        System.out.println("List of intership's students:");
        System.out.println(intership.addStudent());
    }
}
