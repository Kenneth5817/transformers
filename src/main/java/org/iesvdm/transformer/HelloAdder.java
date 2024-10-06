package org.iesvdm.transformer;
//La clase HelloAdder implementa al transformer
public class HelloAdder implements Transformer<String> {
    public String transform(String str) {
        //Devuelve un hola!!
        return "Hello "+str;
    }
}
