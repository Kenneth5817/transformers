package org.iesvdm.transformer;

import java.util.Scanner;
//EXERCISE 3-> ONLY UNDERSTAND
public class UseJoiners1
{
    public static void main(String[] args)
    {
        //In the liplists we are going to collect some integer
        Scanner in = new Scanner(System.in);
        LispList<Integer> ls1,ls2,ls3;
        //We ask for the information
        System.out.print("Enter a list (of integers): ");
        String str = in.nextLine();
        ls1 = parseIntLispList(str);
        System.out.print("Enter another list (of integers): ");
        str = in.nextLine();
        ls2 = parseIntLispList(str);
        Joiner<Integer> adder = new JoinByAdding();
        ls3 = Joiners.zipLists(adder,ls1,ls2);
        //We add to the list
        System.out.println("Adding corresponding integers in the lists gives:\n"+ls3);
    }

    //This will see the length of the content to know if its posible to put in a LipLIst
    public static LispList<Integer> parseIntLispList(String str)
    {
        String line = str.trim();
        String contents = line.substring(1,line.length()-1).trim();
        //If the lenght is equals to 0, will return an empty lip list
        if(contents.length()==0)
            return LispList.empty();
        String[] nums = contents.split(",");
        LispList<Integer> list = LispList.empty();
        //Will record all nums
        for(int i=nums.length-1; i>=0; i--)
        {
            String num = nums[i].trim();
            list = list.cons(Integer.parseInt(num));
        }
        return list;
    }

}
