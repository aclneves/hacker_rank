package javaTopics.introduction;

import java.util.*;
import java.util.stream.Collectors;


public class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            ArrayList<Integer> list_result = new ArrayList<>();
            int parcial_result = a + b;
            list_result.add(parcial_result);

            for (int j = 1; j < n; j++) {
                parcial_result += (int) (Math.pow(2, j) * b);
                list_result.add(parcial_result);
            }
            String print_result = list_result.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" "));
            System.out.println(print_result);
        }
        in.close();
    }
}
