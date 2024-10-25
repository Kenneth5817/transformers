package org.iesvdm;
import org.iesvdm.transformer.*;
import org.iesvdm.transformer.BookChecker;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        //EXERCISE 7
        // Here, we are going to add some persons ;)
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Lucas", 35));
        people.add(new Person("Raquel", 16));
        people.add(new Person("Kenneth", 19));
        people.add(new Person("Pepe", 13));

        AgeChecker ageChecker = new AgeChecker("Alice",18);
        //ComprobadorUtil.removeFailingChecks(people, ageChecker);
        //With this line we will remove the persons under 18 but I have a problem and if I quit, there
        //are some mistakes and I don't know how to solved it. So in this ckeck the results will print
        //all the persons without the check
        System.out.println("Personas mayores de 18 años: " + people);
        // This system will print Kenneth and Lucas

        // Here, we are going to adds some books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", 180));
        books.add(new Book("1984", 328));
        books.add(new Book("A Short Book", 50));
        books.add(new Book("War and Peace", 1225));

        PageChecker pageChecker = new PageChecker(200);
        ComprobadorUtil.removeUnmatched(books, pageChecker);
        //This will need to print the book 1984  ;)
        System.out.println("Libros con más de 200 páginas: " + books);

        //EXERCISE 8//

        //We will have 2 lists
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("Goodbye");

        ArrayList<String> list2 = new ArrayList<>();
        //We are adding some words
        list2.add("world");
        list2.add("everyone");

        // We create a stringJoiner delimiter by " "
        StringJoiner stringJoiner = new StringJoiner(" ");

        // Now we are going to put together both lists.
        StringJoinerImpl stringJoinerImpl = new StringJoinerImpl(" ");
        //We will join with zip both lists
        ArrayList<String> joinedList = Joiners.zipArrayLists(stringJoinerImpl, list1, list2);

        // With this for, all the results will be printed ;)
        for (String item : joinedList) {
            //This will print hello world and goodbye everyone
            System.out.println(item);
        }
    }
}
