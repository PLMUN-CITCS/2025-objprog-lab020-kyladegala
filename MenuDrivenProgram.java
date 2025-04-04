import java.util.Scanner;

public class MenuProgram {  // Corrected class declaration

    // Method to display the menu options to the user
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even or Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to handle the user's menu choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0); // Terminates the program
                break;
            default:
                System.out.println("Error: Invalid choice. Please try again.");
                break;
        }
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello, User! Welcome to the program.");
    }

    // Method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's even or odd: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);