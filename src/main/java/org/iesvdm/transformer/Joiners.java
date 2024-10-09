package org.iesvdm.transformer;


import java.util.ArrayList;

public class Joiners{

    //Tenemos 2 listas y un Joiner generados por tipo T
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2) {

        //En cuanto alguna de las listas esté vacía
        //devuelve una liplist vacía
        if(ls1.isEmpty()||ls2.isEmpty()) {
            return LispList.empty();
        }else {
            //Vamos a unir las 2 listas y comprobar las cabeceras,
            //si por ej. hay dos elemntos 1 se almacenan union cada nivel  -- se almacena de cada nivel
            T h = joiner.join(ls1.head(),ls2.head());
            //Se guardan en una Lisplist --
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            //CONS: coger la cola cabeza
            return t.cons(h);
        }
    }



    //Ejercicio 4
    //Método zipArrayLists que une dos ArrayLists usando un Joiner
    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner, ArrayList<T> list1, ArrayList<T> list2){
        ArrayList<T> result = new ArrayList<>();

        //Vemos la longitud minima entre las listas
        int size= Math.min(list1.size(),list2.size());

        //Recorremos los elemntos y aplicamos el método Join de Joiner
        for(int i=0; i<size; i++){
            T joinedElement = joiner.join(list1.get(i),list2.get(i));
            result.add(joinedElement);
        }
        return result;
    }
}