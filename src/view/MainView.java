package view;

import controller.CollectionsController;
import java.util.Scanner;

public class MainView {

    public static String option = "";

    public static void display() {

        while (!option.toUpperCase().equals("Q")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Which operation do you want to do?");
            System.out.println("----------------------------------");
            System.out.println("A) List Example");
            System.out.println("B) Set Example");
            System.out.println("C) Map Example");
            System.out.println("D) Queue Example");
            System.out.println("E) Tree Example");
            System.out.println("Q) Quit");
            option = scan.nextLine();
            
            switch (option.toUpperCase()) {
                case "A":
                    CollectionsController.ListExample();            
                    break;
                case "B":
                    CollectionsController.SetsExample();                    
                    break;
                case "C":
                    CollectionsController.MapExample();                    
                    break;
                case "D":
                    CollectionsController.QueueExample();                    
                    break;
                case "E":
                    CollectionsController.TreeExample();                    
                    break;
                default:
                    System.out.println("Please check the option List");
            }
        }

    }
}
