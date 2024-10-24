package org.iesvdm.transformer;
//eJ7
public interface Comprobador<S> {
    boolean check(Book item);


    public interface Checker<T> {
        boolean check(T item);
    }

}
