package org.iesvdm.transformer;
//La clase HelloAdder implementa al transformer
//EXERCISE 1-> ONLY UNDERSTAND
public class HelloAdder implements Transformer<String> {
    private String greeting;

    public HelloAdder(String greeting) {
        this.greeting = this.greeting;
    }

    //toString
    @Override
    public String transform(String str) {
        return greeting + " " + str;
    }

}
