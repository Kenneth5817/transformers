package org.iesvdm.transformer;

import java.util.*;
//Ejercicio 6 entenderlo
public class UseTransformers3
{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //We are asking for some numbers here
        System.out.println("Enter some numbers (all on one line, separated by spaces):");
        String line = input.nextLine();
        //We will collect the numerbs with an array, the elements will be separated by " "
        String[] numbers = line.split(" ");
        //With an arrayList we will collect the (integer) numbers
        ArrayList<Integer> a = new ArrayList<Integer>();
        //We will see number by number, one by one
        for(int i=0; i<numbers.length; i++)
            a.add(Integer.valueOf(numbers[i]));
        //This numbers will be collecting in the arrayList
        System.out.println("The numbers are stored in an ArrayList: "+a);
        System.out.print("Enter an integer: ");
        int m = input.nextInt();
        //This is going to take one parameter m and will send b
        Transformer<Integer> multByM = new Multiplier(m);
        ArrayList<Integer> b=Transformers.applyConst(multByM,a);
        System.out.println("Multiplying the contents by "+m+" gives: "+b);

        //EXERCISE 6
        // Test HelloAdder with custom greeting
        input.nextLine();
        //We are going to ask for a greeting
        System.out.print("Enter a greeting: ");
        String greeting = input.nextLine();

        //We will ask for some names separated by spaces
        System.out.println("Enter some names (separated by spaces PLISSSS):");
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
