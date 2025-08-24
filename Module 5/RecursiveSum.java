import java.util.Scanner;

public class RecursiveSum {

    // Recursive method to read numbers and calculate sum
    public static int sumNumbers(Scanner scanner, int count) {
        // Base case: if no numbers left, return 0
        if (count == 0) {
            return 0;
        }

        // Prompt user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Recursive step: add current number to sum of remaining numbers
        return num + sumNumbers(scanner, count - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 5; // fixed to 5 numbers

        System.out.println("You will enter " + totalNumbers + " numbers.");

        int sum = sumNumbers(scanner, totalNumbers);

        System.out.println("The sum of the numbers is: " + sum);

        scanner.close();
    }
}
