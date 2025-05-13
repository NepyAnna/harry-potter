package org.example.models;

public class Student extends Character {
    private int years;

    public Student(String name, String house, int years) {
        super(name, house);
        this.years = years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String castSpell(String spell) {
        return "Student, " + this.getName() + " casts " + spell + "!";
    }
}
