import java.util.Scanner;

public class TemperaturConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;

        // Output
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
    }
}