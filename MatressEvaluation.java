/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matressevaluation;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MatressEvaluation {

public class BedSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter sales for Queen bed: ");
        int queen = input.nextInt();

        System.out.print("Enter sales for King bed: ");
        int king = input.nextInt();

        System.out.print("Enter sales for Single bed: ");
        int single = input.nextInt();

        // Calculations
        int total = queen + king + single;
        double average = total / 3.0;

        // Most Popular
        String mostPopular = "Queen";
        int maxSales = queen;

        if (king > maxSales) {
            mostPopular = "King";
            maxSales = king;
        }
        if (single > maxSales) {
            mostPopular = "Single";
            maxSales = single;
        }

        // Output
        System.out.println("\n--- RESULTS ---");
        System.out.println("Total Sales: " + total);
        System.out.println("Average Sales: " + average);
        System.out.println("Most Popular Product: " + mostPopular + " (" + maxSales + " sold)");
    }
}
       }

