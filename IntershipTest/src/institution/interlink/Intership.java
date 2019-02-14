package institution.interlink;

import institution.University;
import person.Student;

import java.util.List;

public class Intership {
    private String nameOfCourses;
   private University university;
   List<Student> students;

    public Intership(String nameOfCourses, University university) {
        this.nameOfCourses = nameOfCourses;
        this.university = university;
    }

    public  String addStudent(){
        String names="";
        for (int i = 0; i< university.getStudents().size();i++){
            if(university.getStudents().get(i).getKnowledge().getLevel()>university.getMiddleLevel()){
            names+=university.getStudents().get(i).getName()+"\n";}
        }
        return names;
    }


}
