package org.iesvdm.transformer;
import java.util.ArrayList;
public class Joiners
{
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
    {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
        }
    }

    //Ejercicio 4
    // Método zipArrayLists que une dos ArrayLists usando un Joiner
    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner, ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> result = new ArrayList<>();

        // Determinar la longitud mínima entre las dos listas
        int size = Math.min(list1.size(), list2.size());

        // Recorrer los elementos y aplicar el método join del Joiner
        for (int i = 0; i < size; i++) {
            T joinedElement = joiner.join(list1.get(i), list2.get(i));
            result.add(joinedElement);
        }

        return result;
    }
}