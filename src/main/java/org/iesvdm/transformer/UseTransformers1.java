package org.iesvdm.transformer;

import java.util.*;

public class UseTransformers1
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        //We will ask for some numbers
        System.out.println("Enter some numbers (all on one line, separated by spaces):");
        String line = input.nextLine();
        //will e separated by " "
        String[] numbers = line.split(" ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        //Will go one by one
        for(int i=0; i<numbers.length; i++)
            a.add(new Integer(numbers[i]));
        //we print the numbers of the arraylist
        System.out.println("The numbers are stored in an ArrayList: "+a);
        //Se crea un nuevo transformer de tipo Integer
        Transformer<Integer> trans = new TenTimes();
        //we aplicate transformer to every element
        ArrayList<Integer> b=Transformers.applyConst(trans,a);
        System.out.println("Multiplying the contents by 10 gives: "+b);
    }

}

