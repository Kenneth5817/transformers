package org.iesvdm.transformer;

public class StringJoinerImpl implements Joiner<String> {
    private String delimiter;

    public StringJoinerImpl(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String join(String first, String second) {
        return first + delimiter + second;
    }
}
