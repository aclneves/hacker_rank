package javaTopics.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if ((N >= 2 && N <= 5) || N > 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

    }
}
