package org.iesvdm.transformer;

//With this class we could check the age of a person
public class AgeChecker {
    private String name;
    private int age;

    // Constructor
    public AgeChecker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter to get the age of the person
    public int getAge() {
        return age;
    }

    //to String
    @Override
    public String toString() {
        return name;
    }
}
