package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        if (args.length == 0)
        {
            System.err.print("Ошибочка надо что то ввести!");
        }
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
            String str = in.nextLine();
            Scanner s = new Scanner(str);
            for (String iterStr: args)
                if ((str.toLowerCase().contains(iterStr.toLowerCase())) ||
                        (s.findInLine(iterStr) != null))
                {
                    System.out.println(str);
                    break;
                }
            s.close();

        }
        in.close();
    }
    }

