package Footshape_218;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Foot foot = new Foot();

        System.out.println("What to draw? 1. Ellipse, 2. Rectangle");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        switch (choice) {
            case 1:
                foot.draw("ellipse");
                break;
            case 2:
                foot.draw("rectangle");
                break;
            default:
                System.out.println("Invalid choice! Please enter either 1 or 2.");
        }

        scanner.close();
    }
}
