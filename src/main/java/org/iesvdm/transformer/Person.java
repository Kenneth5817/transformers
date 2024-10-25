package org.iesvdm.transformer;

//Class person
public class Person {
    //Will have a name and an age
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getters and setters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //toString
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
