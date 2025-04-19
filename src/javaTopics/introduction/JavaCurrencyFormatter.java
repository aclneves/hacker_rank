package javaTopics.introduction;

import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = currencyFormatter(Locale.US, payment);
        String india = currencyFormatter(new Locale("en", "IN"), payment);
        String china = currencyFormatter(Locale.CHINA, payment);
        String france = currencyFormatter(Locale.FRANCE, payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

    private static String currencyFormatter(Locale locale, double payment) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter.format(payment);
    }
}

