//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        do {
            System.out.print("Enter a valid temperature in Celsius: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
            celsius = scanner.nextDouble();
        } while (celsius < -273.15);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        fuelCost();
        RectangleInfo();
        HighOrLow();
    }

    public static void fuelCost() {
                Scanner scanner = new Scanner(System.in);
                double gallons, mpg, pricePerGallon;

                do {
                    System.out.print("Enter the number of gallons in the tank: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Enter a numeric value.");
                        scanner.next();
                    }
                    gallons = scanner.nextDouble();
                } while (gallons <= 0);

                do {
                    System.out.print("Enter the fuel efficiency (MPG): ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Enter a numeric value.");
                        scanner.next();
                    }
                    mpg = scanner.nextDouble();
                } while (mpg <= 0);

                do {
                    System.out.print("Enter the price of gas per gallon: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Enter a numeric value.");
                        scanner.next();
                    }
                    pricePerGallon = scanner.nextDouble();
                } while (pricePerGallon <= 0);

                double costPer100Miles = (100 / mpg) * pricePerGallon;
                double maxDistance = gallons * mpg;

                System.out.println("Cost to drive 100 miles: $" + costPer100Miles);
                System.out.println("The car can go " + maxDistance + " miles with a full tank.");
            }

    public static void RectangleInfo() {
        Scanner scanner = new Scanner(System.in);
        double width, height;

                do {
                    System.out.print("Enter the width of the rectangle: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Enter a numeric value.");
                        scanner.next();
                    }
                    width = scanner.nextDouble();
                } while (width <= 0);

                do {
                    System.out.print("Enter the height of the rectangle: ");
                    while (!scanner.hasNextDouble()) {
                        System.out.println("Invalid input. Enter a numeric value.");
                        scanner.next();
                    }
                    height = scanner.nextDouble();
                } while (height <= 0);

                double area = width * height;
                double perimeter = 2 * (width + height);
                double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

                System.out.println("Area: " + area);
                System.out.println("Perimeter: " + perimeter);
                System.out.println("Diagonal: " + diagonal);
            }

    public static void HighOrLow() {

                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int target = random.nextInt(10) + 1;
                int guess;

                do {
                    System.out.print("Guess a number between 1 and 10: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Enter a number between 1 and 10.");
                        scanner.next();
                    }
                    guess = scanner.nextInt();
                } while (guess < 1 || guess > 10);

                System.out.println("The correct number was: " + target);
                if (guess < target) {
                    System.out.println("Your guess was too low!");
                } else if (guess > target) {
                    System.out.println("Your guess was too high!");
                } else {
                    System.out.println("You got it right!");
                }
            }
        }










