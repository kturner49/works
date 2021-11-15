/*
INT2200
Komiko Turner

Create a program with multiple classes and methods
to convert a temp to fahrenheit, celcius and kelvin
*/

import java.util.Scanner;

public class TemperatureConverter {

        public static void main(String[] args) throws Exception {
                // constructor for static conversion
                TemperatureConverter converter = new TemperatureConverter();

                // get user temperature
                int input = readInput();

                // convert user input to ftemp
                Temperature2 temp = new Temperature2(input);

                // get temp in f
                double fahrenheit = temp.getFahrenheit();

                // get temp in c
                double celcius = temp.getCelcius();

                // get temp in k
                double kelvin = temp.getKelvin();

                // use static converter and print temp
                converter.displayOutput(fahrenheit, celcius, kelvin);

        }

        public static int readInput() {
                Scanner scanner = new Scanner(System.in);
                int input = 0;
                System.out.println("Enter a number.");
                input = scanner.nextInt();
                scanner.close();
                return input;

        }

        public void displayOutput(double fahrenheit, double celcius, double kelvin) {

                System.out.println("Your temp in fahrenheit: " + fahrenheit);
                System.out.println("Your temp in celcius: " + celcius);
                System.out.println("Your temp in kelvin: " + kelvin);
        }
}