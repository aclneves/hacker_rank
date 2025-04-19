package javaTopics.introduction;

import java.util.Scanner;

public class JavaStdinStdouII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int int_number = in.nextInt();
        double double_number = in.nextDouble();
        in.nextLine();
        String string_text = in.nextLine();
        in.close();

        System.out.println("String: " + string_text);
        System.out.println("Double: " + double_number);
        System.out.println("Int: " + int_number);
    }
}
