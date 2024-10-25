package org.iesvdm.transformer;

import java.util.ArrayList;

public class Transformers {

    //EXERCISE 1-> UNderstand this class
    //Method to applyconst
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a) {
        //We create and arrayList in t ;)
        ArrayList<T> b = new ArrayList<>();
        for (T t : a)
            //We return another array of the same type
            b.add(tran.transform(t));
        return b;
    }

    //EJ5
    // METHOD transform List will transform every element of the list
    public static <T, U> LispList<U> transformList(Transformer<T> transformer, LispList<T> list) {

        U transformedHead = null;
        if (list.isEmpty()) {
            //if the list is empty will create and array
            ArrayList<T> b = new ArrayList<>();
        } else {
            //the first alement ill be applied by the transformer
            transformedHead = (U) transformer.transform(list.head());
        }
        return (LispList<U>) transformList(transformer, list.tail().cons((T) transformedHead));

    }

    //EXERCISE 2  (MADE IN CLASS)
    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a) {
        ArrayList<T> newArray = new ArrayList<>();

        //2 ways of doing that
        for(int i = 0; i< a.size(); i++){
            a.set(i, tran.transform(a.get(i)));
        }

        //Will go index by index
        for(T t: a){
            int indice=a.indexOf(t);
            //if they are the same, we will remove the index
            a.remove(indice);
            a.add(indice,newArray.get(indice));
            //and finally we will transform to t
            tran.transform(t);
        }
    }

}

