package org.iesvdm.transformer;

//StringJoiner implements a Joiner<String> [implementation of StringJoiner]
public class StringJoinerImpl implements Joiner<String> {
    private String delimiter;

    //We will put the delimiter
    public StringJoinerImpl(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String join(String first, String second) {
        return first + delimiter + second;
    }
}
