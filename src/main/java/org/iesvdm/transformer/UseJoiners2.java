package org.iesvdm.transformer;
import java.util.ArrayList;

//Ej4
public class UseJoiners2 {
    public static void main(String[] args) {
        // We will create 2 diferents Array List were we will be collecting some diferents numbers
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // We create a Joiner to "sumar" the numbers  ---Ese spanglish jeje
        Joiner<Integer> adder = new JoinByAdding();

        // Use of zipArrayLists to "sumar" the elements
        ArrayList<Integer> result = Joiners.zipArrayLists(adder, list1, list2);

        // We can print the results
        System.out.println("Sumar los elementos correspondientes de los ArrayLists da:");
        System.out.println(result); // Must show [5, 7, 9]
    }
}
