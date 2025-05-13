package org.example.models;

public abstract class Character {
    private String name;
    private String house;

    public Character(String name, String house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String introduce() {
        return "My name is " + name + " from " + house + ".";
    }

    public abstract String castSpell(String spell);
}