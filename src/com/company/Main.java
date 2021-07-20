package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice, vatRate = 0.18, vatAmount, priceWithVat;
        System.out.print("Total Price : ");
        totalPrice = scanner.nextDouble();

        vatAmount = totalPrice * vatRate;
        System.out.println("Vat amount => " + vatAmount);

        priceWithVat = totalPrice + vatAmount;
        System.out.println("Final Price => " + priceWithVat);
    }
}
