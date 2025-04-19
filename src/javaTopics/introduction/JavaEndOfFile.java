package javaTopics.introduction;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(i + " " + str);
            i++;
        }
    }
}
