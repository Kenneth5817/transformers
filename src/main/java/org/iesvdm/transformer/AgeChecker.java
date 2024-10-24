package org.iesvdm.transformer;

public class AgeChecker {
    private String name;
    private int age;

    // Constructor
    public AgeChecker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Método para obtener la edad
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}
