package org.iesvdm.transformer;

public class StringJoiner implements Joiner<String> {
    @Override
    public String join(String first, String second) {
        return first + " " + second;
    }
}
