package org.example;

    public class CustomTee extends TeeShirt {
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
            CustomTee customShirt = new CustomTee();

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

