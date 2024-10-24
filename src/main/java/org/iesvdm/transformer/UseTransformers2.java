package org.iesvdm.transformer;

import java.util.*;

public class UseTransformers2
{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Se pide al usuario que introduzca varias palabras separadas por 1 espacio
        System.out.println("Enter some words (all on one line, separated by spaces):");
        String line = input.nextLine();

        //Almacenamos en un array las diferentes palabras introducidas por el usuario, separado por " ".
        String[] words = line.split(" ");

        //Creamos un nuevo array donde almacenaremos las diferentes palabras del array<String>
        ArrayList<String> a = new ArrayList<String>();
        for(int i=0; i<words.length; i++)
            a.add(words[i]);
        System.out.println("The words are stored in an ArrayList: "+a);
        String greeting="Hello!";
        //Crea otro array aplicando el transformer, (es decir el hello) a cada palabra
        Transformer<String> hello = new HelloAdder(greeting);
        ArrayList<String> b=Transformers.applyConst(hello,a);
        //Mostramos el resultado por pantalla
        System.out.println("Adding \"hello\" to the words gives: "+b);
    }

}