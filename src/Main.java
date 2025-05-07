import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Get user input
        System.out.print("Enter cat's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter cat's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        System.out.print("Enter cat's breed: ");
        String breed = scanner.nextLine();

        System.out.print("Enter what the cat is eating: ");
        String food = scanner.nextLine();

        System.out.print("Enter the cat's weight: ");
        int weight = scanner.nextInt();

// Create and use the Cat object
        Cat userCat = new Cat(name, age, breed, weight);
        System.out.println("\n--- Cat Information ---");
        userCat.displayInfo();
        userCat.meow();
        userCat.eat(food);
        userCat.eat(String.valueOf(weight));

        scanner.close();
    }
}
