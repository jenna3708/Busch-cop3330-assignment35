/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.ArrayList;
import java.util.Scanner;

public class exercise35 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        System.out.print("Enter a name: ");
        String aName = input.nextLine();

        while(!aName.equals(""))
        {
            names.add(aName);

            System.out.print("Enter a name: ");
            aName = input.nextLine();
        }

        int winner = (int)(Math.random()*names.size());
        System.out.print("The winner is... " + names.get(winner) + ".");
    }
}
