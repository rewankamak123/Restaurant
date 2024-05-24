package stor1;

import java.util.ArrayList;
import java.util.Scanner;

public class Drinks extends Product {

    Scanner scanner = new Scanner(System.in);
    final private double JuicePrice = 8.5;
    final private double CoffeePrice = 20;
    final private double CanPrice = 12;
    final private double WaterPrice = 5;

    // parameterized constructor
    public Drinks(int manufactuarerDate, int expirationDate) {
        super(manufactuarerDate, expirationDate);
    }

    // setter & getter
    public String getItem() {
        return item;
    }

    public int getManufactuarerDate() {
        return manufactuarerDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return Quantity;
    }

    ArrayList<String> ItemArray = new ArrayList();

    double bag[] = new double[4];

    public void ExceptionHandling() {                                             // solve the exception if the user make a negative input
        try {
            Quantity = scanner.nextInt();
            if (Quantity < 0) {
                throw new IllegalArgumentException("Quantity can't be negative try again");
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            Quantity = scanner.nextInt();
        }
    }

    // add items to bag
    @Override
    public void Adding() {

        System.out.println("Choose the item that you want ");
        System.out.println(" (1)juice --> 8.5 $ \t (2)coffee --> 20 $ \t (3)can --> 12 $  \t (4)water --> 5 $");
        System.out.println("Do you want any thing (y / n)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            double totalPrice = 0;
            while (choice.equalsIgnoreCase("y")) {

                System.out.println("Enter the number of choice");
                int Options = scanner.nextInt();

                switch (Options) {
                    case 1:
                        ItemArray.add("juice");

                        System.out.println("Enter the quantity of product that you want to add for your bag");

                        ExceptionHandling();

                        bag[0] += JuicePrice * Quantity;
                        System.out.println("the juice has been added in your bag successfully");
                        break;
                    case 2:
                        ItemArray.add("coffee");

                        System.out.println("Enter the quantity of product that you want to add for your bag");

                        ExceptionHandling();

                        bag[1] += CoffeePrice * Quantity;
                        System.out.println("the coffee has been added in your bag successfully");
                        break;
                    case 3:
                        ItemArray.add("can");

                        System.out.println("Enter the quantity of product that you want to add for your bag");

                        ExceptionHandling();

                        bag[2] += CanPrice * Quantity;
                           System.out.println("the can has been added in your bag successfully");
                        break;
                    case 4:
                        ItemArray.add("water");

                        System.out.println("Enter the quantity of product that you want to add for your bag");

                        ExceptionHandling();

                        bag[3] += WaterPrice * Quantity;
                        System.out.println("the water has been added in your bag successfully");
                        break;
                    default:
                        System.out.println("sorry we don't understand your choice");
                }

                System.out.println("Do you want any thing else (y / n)");
                choice = scanner.next();
                if(choice.equalsIgnoreCase("y")){
                    continue;
                }

               else if (choice.equalsIgnoreCase("n")) {
                    System.out.println(" Ok,Thank you");

                    for (int i = 0; i < 4; i++) {
                        totalPrice += bag[i];

                    }
                    
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("the total price =" + totalPrice);
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                }
               else{
                   System.out.println("Sorry we dont understand you");
                   
               }

                break;
            }

        } else if (choice.equalsIgnoreCase("n")) {
            System.out.println(" Ok,Thank you");
            double totalPrice = 0;
            for (int i = 0; i < 4; i++) {
                totalPrice += bag[i];

            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("the total price =" + totalPrice);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("Sorry we dont understand you");
        }
    }

    // remove items from bag
    @Override
    public void Removing() {
        System.out.println("do you want to remove any thing (y / n) ");
        String choice = scanner.next();
        System.out.println("Choose the item that you want to remove ");
        System.out.println(" (1)juice --> 8.5 $ \t (2)coffee --> 20 $ \t (3)can --> 12 $  \t (4)water --> 5 $");

        if (choice.equalsIgnoreCase("y")) {
            double totalPrice = 0;
            while (choice.equalsIgnoreCase("y")) {
                System.out.println("Enter the number of choice");
                int Options = scanner.nextInt();

                for (int i = 0; i < 4; i++) {
                    totalPrice += bag[i];

                }
                switch (Options) {

                    case 1:
                        if (bag[0] > 0) {
                            ItemArray.remove("juice");

                            System.out.println("Enter the quantity of product that you want to remove from your bag");

                            ExceptionHandling();

                            if (JuicePrice * Quantity <= bag[0]) {
                                bag[0] -= JuicePrice * Quantity;
                                System.out.println("the juice has been removed  successfully");
                            } else {
                                System.out.println("The quantity you want to remove is more than that is in your bag");
                            }
                        } else {
                            System.out.println("Sorry but you don't have this product in your bag");
                        }
                        break;
                    case 2:
                        if (bag[1] > 0) {
                            ItemArray.remove("coffee");

                            System.out.println("Enter the quantity of product that you want to remove from your bag");

                            ExceptionHandling();

                            if (CoffeePrice * Quantity <= bag[1]) {
                                bag[1] -= CoffeePrice * Quantity;
                                System.out.println("the coffee has been removed successfully");
                            } else {
                                System.out.println("The quantity you want to remove is more than that is in your bag");
                            }
                        } else {
                            System.out.println("Sorry but you don't have this product in your bag");
                        }
                        break;
                    case 3:
                        if (bag[2] > 0) {
                            ItemArray.remove("can");

                            System.out.println("Enter the quantity of product that you want to remove from your bag");

                            ExceptionHandling();

                            if (CanPrice * Quantity <= bag[2]) {
                                bag[2] -= CanPrice * Quantity;
                                System.out.println("the can has been removed successfully");
                            } else {
                                System.out.println("The quantity you want to remove is more than that is in your bag");
                            }
                        } else {
                            System.out.println("Sorry but you don't have this product in your bag");
                        }
                        break;
                    case 4:
                        if (bag[3] > 0) {
                            ItemArray.remove("water");

                            System.out.println("Enter the quantity of product that you want to remove from your bag");

                            ExceptionHandling();

                            if (WaterPrice * Quantity <= bag[3]) {
                                bag[3] -= WaterPrice * Quantity;
                                System.out.println("the water has been removed successfully");
                            } else {
                                System.out.println("The quantity you want to remove is more than that is in your bag");
                            }
                        } else {
                            System.out.println("Sorry but you don't have this product in your bag");
                        }
                        break;
                    default:
                        System.out.println("sorry we don't understand your choice");
                }

                System.out.println("Do you want  to remove any thing else (y / n) ");
                choice = scanner.next();

                if (choice.equalsIgnoreCase("n") || !choice.equalsIgnoreCase("y")) {
                    System.out.println(" Ok,Thank you");
                    totalPrice = 0;
                    for (int i = 0; i < 4; i++) {
                        totalPrice += bag[i];

                    }
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("the total price after removing=" + totalPrice);
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                    break;
                }

            }
        } else if (choice.equals("n")) {
            System.out.println(" Ok,Thank you");
            double totalPrice = 0;
            for (int i = 0; i < 4; i++) {

                totalPrice += bag[i];

            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("the total price after removing=" + totalPrice);
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("Sorry we dont understand you");
        }
    }
 
}
