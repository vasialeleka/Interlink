package institution;

import person.Student;


import java.util.ArrayList;
import java.util.List;

public class University {
    private String nameUniversity;
    private List<Student> students = new ArrayList<>();
    private double middleLevel;

    public University(String nameUniversity) {
        this.nameUniversity = nameUniversity;

    }


    public double getMiddleLevel() {

        return middleLevel;
    }


    public void addStudents(Student student) {
        double u = 0;
        int i = 0;
        for (; i < students.size(); i++) {
            u += students.get(i).getKnowledge().getLevel();
        }
        middleLevel = u / i;
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

}
