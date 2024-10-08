package org.iesvdm.transformer;
import java.util.ArrayList;

//Ej4
public class UseJoiners2 {
    public static void main(String[] args) {
        // Crear dos ArrayLists de enteros
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Crear un Joiner para sumar los enteros
        Joiner<Integer> adder = new JoinByAdding();

        // Usar zipArrayLists para sumar los elementos correspondientes
        ArrayList<Integer> result = Joiners.zipArrayLists(adder, list1, list2);

        // Mostrar el resultado
        System.out.println("Sumar los elementos correspondientes de los ArrayLists da:");
        System.out.println(result); // Debería mostrar [5, 7, 9]
    }
}
