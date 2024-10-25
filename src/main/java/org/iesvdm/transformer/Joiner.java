package org.iesvdm.transformer;
//EXERCISE 8
public interface Joiner<T> {
    //De 2 objetos T al unirlos, la salida devuelve 1 nuevo objeto T
    public T join(T obj1,T obj2);
}