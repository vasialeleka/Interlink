package person;

import person.consciousness.Knowledge;

public class Student {
    private  String name;
    private Knowledge knowledge;
    private int level;

    public Student(String name,int level) {
        this.name = name;
        this.level = level;
        knowledge = new Knowledge(level);

    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public String getName() {
        return name;
    }
}
