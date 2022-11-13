package com.Mehboob;

import java.util.List;
import java.util.Scanner;

public class TestComposerApp {

    public static boolean exitFlag = true;

    /**
     * Display the menuOptions
     */
    public static void menuOptions() {
        System.out.println("Welcome to the composer App\n");
        System.out.println("MENU OPTIONS\n");
        System.out.println("\t1.View Composers\n");
        System.out.println("\t2.Find Composer\n");
        System.out.println("\t3.Add Composer\n");
        System.out.println("\t4.Exit\n");
        System.out.print("Please choose an option: \n");
    }

    /**
     * Displays all composers
     * 
     * @param list
     */
    public static void displayComposers(List<Composer> list) {
        for (Composer x : list) {
            System.out.println(x);
        }
    }

    public static void displaySpecificComposer(int id, MemComposerDao mc) {
        Composer t = mc.findBy(id);
        System.out.println("--DISPLAYING COMPOSERS---");
        System.out.println(t);
    }

    /**
     * Evaluates user input and returns the specified action
     * 
     * @param input
     */
    public static void evaluateUserInput(int input, MemComposerDao mc) {
        if (input == 1) {
            displayComposers(mc.findAll());
        } else if (input == 2) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter an Id: ");
            int id = in.nextInt();
            displaySpecificComposer(id, mc);
            
        } else if (input == 3) {
            addComposer(mc);
        }

        else if (input == 4) {
            exitFlag = false;
        }
    }

    /**
     * Add a composer
     * 
     * @param args
     */
    public static void addComposer(MemComposerDao mc) {

        Scanner compScan = new Scanner(System.in);
        System.out.println("Enter an ID: ");
        int id;

        id = compScan.nextInt();

        //read left over new line
        compScan.nextLine();

        System.out.println("Enter a name: ");
        String name = compScan.nextLine();
        System.out.println("Enter a genre: ");
        String genre = compScan.nextLine();

        Composer c = new Composer(id, name, genre);

        mc.insert(c);
        

    }

    public static void main(String[] args) {

        MemComposerDao mc = new MemComposerDao();
        boolean exitFlag = true;
        Scanner input = new Scanner(System.in);
        // display menu option

        while (exitFlag) {
            menuOptions();

            // take in userInput
            int userInput = input.nextInt();
            evaluateUserInput(userInput, mc);

        }
       

    }
}
