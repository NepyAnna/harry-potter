package org.example.models;

public class Professor extends Character implements Teachable{
    private String subject;

    public Professor(String name, String house, String subject) {
        super(name, house);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String castSpell(String spell) {
        return "Professor, " + this.getName() + " casts " + spell + "!";
    }

    @Override
    public String grade(Student student) {
        return "Professor " + this.getName() + " is grading " + student.getName() + " in " + this.getSubject() + ".";
    }
}
