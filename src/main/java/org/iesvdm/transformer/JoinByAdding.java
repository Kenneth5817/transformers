package org.iesvdm.transformer;
//EJ7
class JoinByAdding implements Joiner<Integer> {
    public Integer join(Integer int1,Integer int2)
    {
        return (Integer) (int1+int2);
    }
}
