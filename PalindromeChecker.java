package PalindromeChecker;
import java.util.Scanner;

public class PalindromeChecker {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String welcome; header();
    	welcome = "\nWelcome! Please enter a word, phrase, or sequence and I will tell you if it's a palindrome or not.\n";
               
        System.out.println(welcome);
        while (true) {
            System.out.println("1. Palindrome Checker");
            System.out.println("2. Exit");
            
           
            System.out.print("\nEnter Number: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    checker();
                    break;
                case 2:
                	displayprogrammer();
                    System.exit(0);
                default:
                    System.out.println("Error. Please input number only from 1 - 2.\n");
                    break;
            }
           
        }
    }

    public static boolean isPalindrome(String wordToCheck) {
        // Remove spaces and special characters from the input string
    	wordToCheck = wordToCheck.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = wordToCheck.length();
        for (int i = 0; i < length / 2; i++) {
            if (wordToCheck.charAt(i) != wordToCheck.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void checker() {
    	
    	do {
            sc.nextLine(); // Consume the newline character left by nextInt()
            
            System.out.print("\nEnter word/phrase: ");
            String input = sc.nextLine();
           

            if (isPalindrome(input)) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is NOT a palindrome.");
            }

            System.out.print("\nDo you want to check another string? [Y/N]: ");
            String anotherCheck = sc.next();
            if (!anotherCheck.equalsIgnoreCase("y")) {
            	displayprogrammer();
                System.exit(0);
            }
            
        } while (true);
    }
   
    
    public static void displayprogrammer() {
    	System.out.println("\n\t\t-----------> Program Terminated <--------------");
		System.out.println("# =========================================================================== #");		
		System.out.println("|                   2023 @ Sharon Grace T. Hangaan                            |");
		System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
		System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
		System.out.println("# =========================================================================== #");	
        System.exit(0);
    }
    
    
    public static void header() {
    	System.out.println("\n\t(================ PALINDROME CHECKER =================)");
		System.out.println("\t(==== Laboratory001 - Basic String Manipulation ======)");
		System.out.println("\t-------------------------------------------------------");
    }   
}
