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

