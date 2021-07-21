package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //TAX
        /*
        double totalPrice, vatRate = 0.18, vatAmount, priceWithVat;
        System.out.print("Total Price : ");
        totalPrice = scanner.nextDouble();

        vatAmount = totalPrice * vatRate;
        System.out.println("Vat amount => " + vatAmount);

        priceWithVat = totalPrice + vatAmount;
        System.out.println("Final Price => " + priceWithVat);
        */

        //PYTHAGORAS
        /*
        int a, b;
        double c;

        System.out.print("First num : ");
        a = scanner.nextInt();
        System.out.print("Second num : ");
        b = scanner.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Result : " + c);
        */

        //TAXI
        /*
        final double kmPrice = 2.2;
        double totalJourneyKm, finalPrice, startPrice = 10;

        System.out.print("JourneyKM : ");
        totalJourneyKm = scanner.nextDouble();

        finalPrice = kmPrice * totalJourneyKm;
        finalPrice += startPrice;

        if (finalPrice < 20.0) {
            System.out.println("You need to pay 20$");
        } else {
            //System.out.println("You need to pay : " + String.format("%.2f", finalPrice) + "$");
            System.out.println("You need to pay : " + Rounder(finalPrice, 2) + "$");
        }
        */

        //AREA
        /*

        double r, circumference, area, a, areaOfSlice;

        System.out.print("Radius : ");
        r = scanner.nextDouble();

        System.out.print("Slice angle : ");
        a = scanner.nextDouble();

        circumference = 2 * Math.PI * r;
        area = Math.PI * Math.pow(r, 2);
        areaOfSlice = (Math.PI * (Math.pow(r, 2) * a)) / 360;

        System.out.println("Area of radius : " + area + "\nCircumference of radius : " + circumference + "\nArea of Slice : " + areaOfSlice);

        System.out.println("Corretion => Total Area / 2 : " + area / 2);
        */

        //MASS INDEX
        /*
        double height, weight, index;

        System.out.print("Height : ");
        height = scanner.nextDouble();
        System.out.print("Weight : ");
        weight = scanner.nextDouble();

        index = weight / (Math.pow(height, 2));
        System.out.print("Height-Mass Index : " + index);
        */

        //GREENGROCER
        /*
        final double apple = 3.67, banana = 0.95, eggplant = 5, tomato = 1.11, pineapple = 4.32;
        double finalPrice, kgApple, kgBanana, kgEggplant, kgTomato, kgPineapple;

        System.out.println("Please set value of product in KG!");

        System.out.print("Apple : ");
        kgApple = scanner.nextDouble();

        System.out.print("Banana : ");
        kgBanana = scanner.nextDouble();

        System.out.print("Eggplant : ");
        kgEggplant = scanner.nextDouble();

        System.out.print("Tomato : ");
        kgTomato = scanner.nextDouble();

        System.out.print("Pineapple : ");
        kgPineapple = scanner.nextDouble();
        

        finalPrice = kgApple + kgBanana + kgEggplant + kgTomato + kgPineapple;
        System.out.print("Final Price : " + Rounder(finalPrice, 3));
        */

        //HACKERRANK
        /*
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                else
                    System.out.println(scanner.next() + " can't be fitted anywhere.");
                //Complete the code
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }
        */


        //CALCULATOR
        /*
        int a, b, c;

        System.out.print("First number : ");
        a = scanner.nextInt();
        System.out.print("Second number : ");
        b = scanner.nextInt();
        System.out.print("1 => +\n2 => -\n3 => *\n4 => /\nSelect an operator :");
        c = scanner.nextInt();
        System.out.print("Result : ");
        switch (c) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
            default -> System.out.println("Select an valid operator!");
        }
        */

        //LOGIN
        /*
        final String password = "123", username = "ali";
        String pointer, pwd, newPwd;
        boolean pwdCheck = true;

        System.out.print("Username : ");
        if (!scanner.nextLine().equals(username)) {
            System.out.println("Username is wrong");
            throw new Exception("Username is wrong");
        }

        System.out.print("Password : ");
        pwd = scanner.nextLine();
        if (pwd != password) {
            System.out.println("Password is wrong! Wanna change it? (Y/N)");
            pointer = scanner.nextLine();
            if (pointer.equals("Y") || pointer.equals("y")) {
                do {
                    System.out.println("New Password : ");
                    newPwd = scanner.nextLine();
                    if ((newPwd.equals(pwd)) || (newPwd.equals(password))) {
                        System.out.println("Password has not changed!");
                        throw new Exception("Password has not changed!");
                    } else {
                        pwdCheck = false;
                        System.out.println("Password is changed.");
                    }
                } while (pwdCheck);
            } else {
                System.out.println("Try again.");
            }
        }
        */

        int age, ticketType;
        double km, totalPrice;
        final double consKm = 0.1;

        System.out.print("Distance : ");
        km = scanner.nextDouble();
        if (km <= 0) {
            throw new Exception("Invalid km!");
        } else {
            System.out.print("Your age : ");
            age = scanner.nextInt();
            if (age <= 0) {
                throw new Exception("Invalid age!");
            } else {
                System.out.print("1 => One way \n2 => Return \nTicket Type : ");
                ticketType = scanner.nextInt();

                if (ticketType == 1 || ticketType == 2) {
                    if (age <= 12) {
                        totalPrice = km * consKm - km * consKm * 0.5;
                    } else if (age > 12 && age <= 24) {
                        totalPrice = km * consKm - km * consKm * 0.1;
                    } else if (age >= 65) {
                        totalPrice = km * consKm - km * consKm * 0.3;
                    } else
                        totalPrice = km * consKm;
                    switch (ticketType) {
                        case 1:
                            break;
                        case 2:
                            totalPrice = (totalPrice - totalPrice * 0.2) * 2;
                            break;
                        default:
                            break;
                    }
                    System.out.print("Total Price : " + Rounder(totalPrice, 2) + "$");
                } else
                    throw new Exception("Invalid ticket type!");
            }
        }
    }

    private static double Rounder(double value, int precision) {
        if (precision < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        return bd.setScale(precision, RoundingMode.HALF_UP).doubleValue();
    }

    public enum TicketType {
        ONE_WAY(1),
        RETURN(2);

        private int value;
        private static Map map = new HashMap<>();

        private TicketType(int value) {
            this.value = value;
        }

        static {
            for (TicketType ticketType : TicketType.values()) {
                map.put(ticketType.value, ticketType);
            }
        }

        public static TicketType valueOf(int value) {
            return (TicketType) map.get(value);
        }

        public int getValue() {
            return value;
        }
    }

}
