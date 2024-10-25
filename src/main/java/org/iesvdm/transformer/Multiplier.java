package org.iesvdm.transformer;

class Multiplier implements Transformer<Integer>
{
    //Attribute
    private int mult;

    //We will multiply
    public Multiplier(int m)
    {
        mult = m;
    }

    //We will transform the number(n) multiplying by mult
    public Integer transform(Integer n)
    {
        return n*mult;
    }
}
