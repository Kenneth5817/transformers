package org.iesvdm.transformer;

import java.util.*;

//EXERCISE 1-> ONLY UNDERSTAND
public class UseTransformers2
{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //We need to introduce some words here
        System.out.println("Enter some words (all on one line, separated by spaces):");
        String line = input.nextLine();

        //We will collect in an array separated by " ".
        String[] words = line.split(" ");

        //In an array we will collect all the diferentes words
        ArrayList<String> a = new ArrayList<String>();
        //We will go one by one
        for(int i=0; i<words.length; i++)
            a.add(words[i]);
        //We can print all of them
        System.out.println("The words are stored in an ArrayList: "+a);
        String greeting="Hello!";
        //With this transformer array will put hello after every word
        Transformer<String> hello = new HelloAdder(greeting);
        ArrayList<String> b=Transformers.applyConst(hello,a);
        //We show the results
        System.out.println("Adding \"hello\" to the words gives: "+b);
    }

}