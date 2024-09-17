package org.example;
import java.util.Scanner;

public class Main {
    //TeeShirt
        public static class TeeShirt {

            private int orderNumber;
            private String size;
            private String color;
            private double price;

            // Setter for orderNumber
            public void setOrderNumber(int orderNumber) {
                this.orderNumber = orderNumber;
            }

            // Setter for size (sets price based on size)
            public void setSize(String size) {
                this.size = size;
                if (size.equalsIgnoreCase("XXL") || size.equalsIgnoreCase("XXXL")) {
                    this.price = 22.99;
                } else {
                    this.price = 19.99;
                }
            }

            // Setter for color
            public void setColor(String color) {
                this.color = color;
            }

            // Getter for orderNumber
            public int getOrderNumber() {
                return orderNumber;
            }

            // Getter for size
            public String getSize() {
                return size;
            }

            // Getter for color
            public String getColor() {
                return color;
            }

            // Getter for price
            public double getPrice() {
                return price;
            }

            // Main method to test the class
            public static void main(String[] args) {
                org.example.TeeShirt shirt = new org.example.TeeShirt();

                // Set the details
                shirt.setOrderNumber(12345);
                shirt.setSize("XXL");
                shirt.setColor("Blue");

                // Display the details
                System.out.println("Order Number: " + shirt.getOrderNumber());
                System.out.println("Size: " + shirt.getSize());
                System.out.println("Color: " + shirt.getColor());
                System.out.println("Price: $" + shirt.getPrice());
            }
        }
//CustomTee
    public static class CustomTee extends org.example.TeeShirt {
        // Additional field for the slogan
        private String slogan;

        // Setter method for slogan
        public void setSlogan(String slogan) {
            this.slogan = slogan;
        }

        // Getter method for slogan
        public String getSlogan() {
            return slogan;
        }

        // Main method to test the class
        public static void main(String[] args) {
            // Create a CustomTee object
            org.example.CustomTee customShirt = new org.example.CustomTee();

            // Set details for the custom tee shirt
            customShirt.setOrderNumber(54321);
            customShirt.setSize("L");
            customShirt.setColor("Red");
            customShirt.setSlogan("BOOM");

            // Display the details
            System.out.println("Order Number: " + customShirt.getOrderNumber());
            System.out.println("Size: " + customShirt.getSize());
            System.out.println("Color: " + customShirt.getColor());
            System.out.println("Slogan: " + customShirt.getSlogan());
            System.out.println("Price: $" + customShirt.getPrice());
        }
    }
//DemoTees

    public static class DemoTees {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Create two TeeShirt objects
            org.example.TeeShirt shirt1 = new org.example.TeeShirt();
            org.example.TeeShirt shirt2 = new org.example.TeeShirt();

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
            org.example.CustomTee customShirt1 = new org.example.CustomTee();
            org.example.CustomTee customShirt2 = new org.example.CustomTee();

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


}

