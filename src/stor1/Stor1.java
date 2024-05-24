package stor1;

import java.util.Scanner;

public class Stor1 {

    // check the expiration date
    public static void ValidityTest(Product obj) {
        if (obj.manufactuarerDate <= obj.expirationDate) {
            System.out.println("Valid product");
        } else {
            System.out.println("Expired product");
        }
    }

    public static void main(String[] args) {
        System.out.println("\t\t\t\t--------------------Invoice-----------------");  
                System.out.println("\t\t\t\t\t "+"         "+"Coffee Shop");  
                System.out.println("\t\t\t\t\t"+"       "+" Alexanderia Shop");  
                System.out.println("\t\t\t\t\t"  +"      " +"Opposite Coffee Shop ");
        Scanner S = new Scanner(System.in);
        Product obj = new Drinks(2022, 2025);           //applying polymorphism

        // ask user to choose the operation
        while (true) {
            System.out.println("Enter 1 for adding to your bag");
            System.out.println("Enter 2 for removing from your bag");
            System.out.println("Enter 3 for exit");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("_______Choose the operation:_______");

            int operation = S.nextInt();
            switch (operation) {
                case 1:
                    ValidityTest(obj);
                    obj.Adding();
                    break;

                case 2:
                    obj.Removing();
                    break;

                case 3:
                    System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
                    System.out.println("\t\t\t\t                     Visit Again");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong input");
            }
        }

    }
}
