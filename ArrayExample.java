import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        // Print the numbers
        System.out.println("You entered:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}
