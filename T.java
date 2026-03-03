import java.util.Scanner;

public class TriangleAreaConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Area formula
        double areaSqCm = 0.5 * base * height;

        // Conversion factor:
        // 1 inch = 2.54 cm  →  1 sq inch = (2.54 * 2.54) sq cm
        double sqCmPerSqIn = 2.54 * 2.54;

        // Convert sq cm to sq inches
        double areaSqIn = areaSqCm / sqCmPerSqIn;

        // Output
        System.out.println("The Area of the triangle in sq in is " 
                           + areaSqIn + " and sq cm is " + areaSqCm);
    }
}