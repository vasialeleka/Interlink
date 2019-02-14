package institution.interlink;

import institution.University;


public class Intership {
    private String nameOfCourses;
   private University university;


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
