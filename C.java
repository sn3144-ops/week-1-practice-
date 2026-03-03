import java.util.Scanner;

public class SquareSideCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Formula: Perimeter = 4 × side
        double side = perimeter / 4.0;

        // Output
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);
    }
}