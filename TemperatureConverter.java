import java.util.Scanner;

public class TemperatureConverter {
    // Method to get user's chose option
    public int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! I'm a Temperature Converter!");
        System.out.println("1. Convert from Celsius to Fahrenheit");
        System.out.println("2. Convert from Fahrenheit to Celsius");
        System.out.println("Please select option 1 or 2: ");
        return scanner.nextInt();
    }
    // Method to convert from Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 9 / 5;
    }

    // Method to convert from Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    // Method to carry out conversion
    public void tempConverter() {
        Scanner input = new Scanner(System.in);
        int userChoice = getInput();

        switch (userChoice) {
            case 1:
                System.out.println("Enter temperature in celsius: ");
                double celsius = input.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees Fahrenheit");
                break;
            case 2:
                System.out.println("Enter temperature in fahrenheit: ");
                double tempFahrenheit = input.nextDouble();
                double tempCelsius = fahrenheitToCelsius(tempFahrenheit);
                System.out.println(tempFahrenheit + " degrees Fahrenheit is " + tempCelsius + " degrees Celsius");
                break;
            default:
                System.out.println("You have entered an invalid option. Please select option 1 or 2.");
        }
    }
}

