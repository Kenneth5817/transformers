package org.iesvdm.transformer;

import java.util.ArrayList;

public class Transformers {

    //Creamos un array
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a) {
        //Crea un array en t y se aplica en el nuevo la transformación sobre el antiguo
        ArrayList<T> b = new ArrayList<>();
        for (T t : a)
            //Devuelve otro array transformado del mismo tipo
            b.add(tran.transform(t));
        return b;
    }

    //EJ5
    // Método transform List que aplica una transformación a cada elemento de la lista
    public static <T, U> LispList<U> transformList(Transformer<T> transformer, LispList<T> list) {

        U transformedHead = null;
        if (list.isEmpty()) {
            ArrayList<T> b = new ArrayList<>();
        } else {
            //Aplicar el transformador el primer elemento y continuar con el resto de la lista
            transformedHead = (U) transformer.transform(list.head());
        }
        return (LispList<U>) transformList(transformer, list.tail().cons((T) transformedHead));

    }
    //Estos son los ultimos cambios
    //EJERCICIO 2
    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
        ArrayList<T> nuevoArray = new ArrayList<>();

        //2 maneras de hacerlo
        for(int i = 0; i< a.size(); i++){
            a.set(i, tran.transform(a.get(i)));
        }

        //Va a ir recorriendo indice por indice
        for(T t: a){
            int indice=a.indexOf(t);
            a.remove(indice);
            a.add(indice,nuevoArray.get(indice));
            tran.transform(t);
        }
    }

}

