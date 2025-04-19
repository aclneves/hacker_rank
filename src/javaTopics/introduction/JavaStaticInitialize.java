package javaTopics.introduction;

import java.util.*;

class JavaStaticInitialize {
    static int B;
    static int H;
    static int area;
    static boolean initialized = false;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        in.close();

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
            area = B * H;
            initialized = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Não chamamos System.exit(0) aqui
        }
    }

    public static void main(String[] argh) {
        if (initialized) {
            System.out.println(area);
        }
    }
}