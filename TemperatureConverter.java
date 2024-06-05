import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");
            
            int option = scanner.nextInt();
            if (option == 7) {
                break;
            }
            
            System.out.print("Enter the temperature value: ");
            double inputTemperature = scanner.nextDouble();
            double convertedTemperature = 0.0;
            
            switch (option) {
                case 1:
                    convertedTemperature = celsiusToFahrenheit(inputTemperature);
                    System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", inputTemperature, convertedTemperature);
                    break;
                case 2:
                    convertedTemperature = celsiusToKelvin(inputTemperature);
                    System.out.printf("%.2f Celsius is %.2f Kelvin\n", inputTemperature, convertedTemperature);
                    break;
                case 3:
                    convertedTemperature = fahrenheitToCelsius(inputTemperature);
                    System.out.printf("%.2f Fahrenheit is %.2f Celsius\n", inputTemperature, convertedTemperature);
                    break;
                case 4:
                    convertedTemperature = fahrenheitToKelvin(inputTemperature);
                    System.out.printf("%.2f Fahrenheit is %.2f Kelvin\n", inputTemperature, convertedTemperature);
                    break;
                case 5:
                    convertedTemperature = kelvinToCelsius(inputTemperature);
                    System.out.printf("%.2f Kelvin is %.2f Celsius\n", inputTemperature, convertedTemperature);
                    break;
                case 6:
                    convertedTemperature = kelvinToFahrenheit(inputTemperature);
                    System.out.printf("%.2f Kelvin is %.2f Fahrenheit\n", inputTemperature, convertedTemperature);
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
