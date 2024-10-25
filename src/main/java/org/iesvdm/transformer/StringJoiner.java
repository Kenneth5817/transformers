package org.iesvdm.transformer;

public class StringJoiner implements Joiner<String> {
    //This will join both string, for ex. if i had hello and world, will be like hello world ;)
    @Override
    public String join(String first, String second) {
        return first + " " + second;
    }
}
