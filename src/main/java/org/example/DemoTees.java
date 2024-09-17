package org.example;
import java.util.Scanner;

public class DemoTees {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Create two TeeShirt objects
            TeeShirt shirt1 = new TeeShirt();
            TeeShirt shirt2 = new TeeShirt();

            // Input for TeeShirt 1
            System.out.println("Enter details for the first TeeShirt:");
            System.out.print("Order Number: ");
            shirt1.setOrderNumber(input.nextInt());

            input.nextLine();
            System.out.print("Size: ");
            shirt1.setSize(input.nextLine());

            System.out.print("Color: ");
            shirt1.setColor(input.nextLine());

            // Input for TeeShirt 2
            System.out.println("\nEnter details for the second TeeShirt:");
            System.out.print("Order Number: ");
            shirt2.setOrderNumber(input.nextInt());

            input.nextLine();
            System.out.print("Size: ");
            shirt2.setSize(input.nextLine());

            System.out.print("Color: ");
            shirt2.setColor(input.nextLine());

            // Create two CustomTee objects
            CustomTee customShirt1 = new CustomTee();
            CustomTee customShirt2 = new CustomTee();

            // Input for CustomTee 1
            System.out.println("\nEnter details for the first CustomTee:");
            System.out.print("Order Number: ");
            customShirt1.setOrderNumber(input.nextInt());
            input.nextLine();

            System.out.print("Size: ");
            customShirt1.setSize(input.nextLine());
            System.out.print("Color: ");

            customShirt1.setColor(input.nextLine());
            System.out.print("Slogan: ");
            customShirt1.setSlogan(input.nextLine());

            // Input for CustomTee 2
            System.out.println("\nEnter details for the second CustomTee:");
            System.out.print("Order Number: ");
            customShirt2.setOrderNumber(input.nextInt());
            input.nextLine();

            System.out.print("Size: ");
            customShirt2.setSize(input.nextLine());

            System.out.print("Color: ");
            customShirt2.setColor(input.nextLine());
            System.out.print("Slogan: ");

            customShirt2.setSlogan(input.nextLine());

            // Display details for both TeeShirt objects
            System.out.println("\nFirst TeeShirt Details:");
            System.out.println("Order Number: " + shirt1.getOrderNumber());
            System.out.println("Size: " + shirt1.getSize());
            System.out.println("Color: " + shirt1.getColor());
            System.out.println("Price: $" + shirt1.getPrice());

            System.out.println("\nSecond TeeShirt Details:");
            System.out.println("Order Number: " + shirt2.getOrderNumber());
            System.out.println("Size: " + shirt2.getSize());
            System.out.println("Color: " + shirt2.getColor());
            System.out.println("Price: $" + shirt2.getPrice());

            // Display details for both CustomTee objects
            System.out.println("\nFirst CustomTee Details:");
            System.out.println("Order Number: " + customShirt1.getOrderNumber());
            System.out.println("Size: " + customShirt1.getSize());
            System.out.println("Color: " + customShirt1.getColor());
            System.out.println("Slogan: " + customShirt1.getSlogan());
            System.out.println("Price: $" + customShirt1.getPrice());

            System.out.println("\nSecond CustomTee Details:");
            System.out.println("Order Number: " + customShirt2.getOrderNumber());
            System.out.println("Size: " + customShirt2.getSize());
            System.out.println("Color: " + customShirt2.getColor());
            System.out.println("Slogan: " + customShirt2.getSlogan());
            System.out.println("Price: $" + customShirt2.getPrice());

            input.close();
        }
    }


