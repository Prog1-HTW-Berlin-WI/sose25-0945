

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionVL{

    public static void main(String[] args) {
        // 1. NullPointerException
        String text = null; 
        try {
             System.out.println("Länge des Texts: " + text.length()); 
             // blablabla
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        
        int[] zahlen = {1, 2, 3};
        try {
            System.out.println("Zahl an Index 5: " + zahlen[5]); 
        } catch (IndexOutOfBoundsException ioo){
            System.out.println(ioo.getMessage());
        }

        
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Gib eine Zahl zwischen 1 und 10 ein.");
        try{
            int zahl = scanner.nextInt(); 
        } catch (Exception e) {}
        System.out.println("Gelesene Zahl: " + zahl);

      
    }
}



