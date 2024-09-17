package org.example;

public class TeeShirt {

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
            TeeShirt shirt = new TeeShirt();

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


