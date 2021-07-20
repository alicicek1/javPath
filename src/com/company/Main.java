package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        //TAX
        double totalPrice, vatRate = 0.18, vatAmount, priceWithVat;
        System.out.print("Total Price : ");
        totalPrice = scanner.nextDouble();

        vatAmount = totalPrice * vatRate;
        System.out.println("Vat amount => " + vatAmount);

        priceWithVat = totalPrice + vatAmount;
        System.out.println("Final Price => " + priceWithVat);
*/

/*
        //PYTHAGORAS
        int a, b;
        double c;

        System.out.print("First num : ");
        a = scanner.nextInt();
        System.out.print("Second num : ");
        b = scanner.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Result : " + c);
*/

/*
        //TAXI
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

        double r, circumference, area;

        System.out.print("Radius : ");
        r = scanner.nextDouble();

        circumference = 2 * Math.PI * r;
        area = Math.PI * Math.pow(r, 2);

        System.out.println("Area of radius : " + area + "\nCircumference of radius : " + circumference);

    }

    private static double Rounder(double value, int precision) {
        if (precision < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        return bd.setScale(precision, RoundingMode.HALF_UP).doubleValue();
    }


}
