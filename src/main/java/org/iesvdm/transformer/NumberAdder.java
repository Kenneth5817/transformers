package org.iesvdm.transformer;

public class NumberAdder implements Transformer<String>
{
    //Attribute
    int number;

    //This will reset the number
    public void reset()
    {
        number=0;
    }

    //This will transfrom the String
    public String transform(String str)
    {
        number++;
        return number+") "+str;
    }
}

