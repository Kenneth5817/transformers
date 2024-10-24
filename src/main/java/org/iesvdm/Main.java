package org.iesvdm;

import org.iesvdm.transformer.*;
import org.iesvdm.transformer.BookChecker;

import java.util.ArrayList;
import java.util.StringJoiner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.iesvdm.transformer.*;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // Ejemplo con AgeChecker
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 17));
        people.add(new Person("Charlie", 30));
        people.add(new Person("Diana", 15));

        AgeChecker ageChecker = new AgeChecker("Alice",18);
        //ComprobadorUtil.removeFailingChecks(people, ageChecker); Con esta linea borraríamos y despues comprobariaos el resultado
        System.out.println("Personas mayores de 18 años: " + people); // Debería imprimir [Alice, Charlie]
     // Debería imprimir [Alice, Charlie]

        // Ejemplo con PageChecker
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("The Great Gatsby", 180));
        books.add(new Book("1984", 328));
        books.add(new Book("A Short Book", 50));
        books.add(new Book("War and Peace", 1225));

        PageChecker pageChecker = new PageChecker(200);
        ComprobadorUtil.removeUnmatched(books, pageChecker);
        System.out.println("Libros con más de 200 páginas: " + books); // Debería imprimir [1984, War and Peace]

        /**Ej 8**/
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("Goodbye");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("world");
        list2.add("everyone");

        // Crear un StringJoiner con un espacio como delimitador
        StringJoiner stringJoiner = new StringJoiner(" ");

        // Unir las dos listas (aquí necesitas un Joiner<String> que funcione)
        StringJoinerImpl stringJoinerImpl = new StringJoinerImpl(" "); // Asegúrate de que existe esta clase
        ArrayList<String> joinedList = Joiners.zipArrayLists(stringJoinerImpl, list1, list2);

        // Imprimir el resultado
        for (String item : joinedList) {
            System.out.println(item); // Debería imprimir "Hello world" y "Goodbye everyone"
        }
    }
}
