package org.iesvdm.transformer;

import java.util.*;
//Ejercicio 6 entenderlo
public class UseTransformers3
{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some numbers (all on one line, separated by spaces):");
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<numbers.length; i++)
            a.add(Integer.valueOf(numbers[i]));
        System.out.println("The numbers are stored in an ArrayList: "+a);
        System.out.print("Enter an integer: ");
        int m = input.nextInt();
        Transformer<Integer> multByM = new Multiplier(m);
        ArrayList<Integer> b=Transformers.applyConst(multByM,a);
        System.out.println("Multiplying the contents by "+m+" gives: "+b);

        //EJERCICIO 6
        // Test HelloAdder with custom greeting
        input.nextLine(); // Clear the buffer
        System.out.print("Enter a greeting: ");
        String greeting = input.nextLine();

        System.out.println("Enter some names (all on one line, separated by spaces):");
        String namesLine = input.nextLine();
        String[] names = namesLine.split(" ");
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        // Using the modified HelloAdder
        Transformer<String> helloAdder = new HelloAdder(greeting);
        ArrayList<String> greetingsList = Transformers.applyConst(helloAdder, namesList);
        System.out.println("The greetings are: " + greetingsList);

        // You could also test the HelloAdder specifically if needed
        System.out.print("Using HelloAdder with a specific name: ");
        String specificName = input.nextLine();
        System.out.println("Greeting: " + helloAdder.transform(specificName));
    }

}
