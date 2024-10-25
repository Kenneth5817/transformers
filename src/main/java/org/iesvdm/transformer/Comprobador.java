package org.iesvdm.transformer;
//eJ7
public interface Comprobador<S> {
    boolean check(Book item);
    //This interface will only check the book items like pages for example
    public interface Checker<T> {
        boolean check(T item);
    }

}
