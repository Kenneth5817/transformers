package org.iesvdm.transformer;

class JoinByAdding implements Joiner<Integer> {

    //Interfaz que suma 2 objetos, o sea, tiene 2 parámetros Integer
    //y devuelve la suma
    public Integer join(Integer int1,Integer int2) {
        return (Integer) (int1+int2);
    }
}
