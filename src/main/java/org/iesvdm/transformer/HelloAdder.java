package org.iesvdm.transformer;
//La clase HelloAdder implementa al transformer
public class HelloAdder implements Transformer<String> {
    private String greeting;

    public HelloAdder(String greeting) {
        this.greeting = this.greeting;
    }

    @Override
    public String transform(String str) {
        return greeting + " " + str;
    }

}
