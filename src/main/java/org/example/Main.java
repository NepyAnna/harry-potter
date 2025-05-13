package org.example;

import org.example.models.Character;
import org.example.models.Professor;
import org.example.models.Student;

public class Main {
    public static void main(String[] args) {
        Student harry = new Student("Harry Potter", "Gryffindor", 5);
        Professor snape = new Professor("Severus Snape", "Slytherin", "Potions");

        System.out.println(harry.introduce());
        System.out.println(snape.introduce());
        System.out.println(harry.castSpell("Luxguardian"));
        System.out.println(snape.castSpell("Tenebris Anima"));
        System.out.println(snape.grade(harry));
        System.out.println(harry.practice("Expelliarmus"));
    }
}