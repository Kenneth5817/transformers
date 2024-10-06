package org.iesvdm.transformer;

//TenTimes implementa un transformer
public class TenTimes implements Transformer<Integer>
{

    public Integer transform(Integer n)
    {
        return n*10;
    }
}
