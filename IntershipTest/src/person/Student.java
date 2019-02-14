package person;

import person.consciousness.Knowledge;

public class Student {
    private String name;
    private Knowledge knowledge;


    public Student(String name, int level) {
        this.name = name;
        knowledge = new Knowledge(level);

    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public String getName() {
        return name;
    }
}
