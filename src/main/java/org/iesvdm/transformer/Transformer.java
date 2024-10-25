package org.iesvdm.transformer;

//AL ser una interfaz funcional y recibir y devolver solo un parametro
// he decidido poner interfaz funcional
@FunctionalInterface
public interface Transformer<T>
{
    public T transform(T obj);
}

