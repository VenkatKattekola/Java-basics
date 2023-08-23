package basics;

import java.util.Scanner;
 
//  Class
public class Test4 {
 
    // Main driver method
    public static void main(String[] arg)
    {
        int number;
      Scanner sc = new Scanner(System.in);
 
        while (true) {
 
            // Display message
            System.out.println("Enter any valid Integer: ");
 
            // Try block to check if any exception occurs
            try {
                    number = Integer.parseInt(sc.next());
                    System.out.println("You entered: " + number);
 
                     break;
            }
 
            // Catch block to handle NumberFormatException
            catch (NumberFormatException e) {
 
                // Print the message if exception occurred
                System.out.println("NumberFormatException occurred" + e);
            }
        }
    }
}