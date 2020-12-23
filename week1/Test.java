package week1;

import java.lang.Math;

public class Test {
    public static void sum(int a, int b, int c) {
        System.out.println("Bài 1!");
        System.out.println(a + b + c);
    }

    public static void sumDigits(int a, int b, int c) {
        System.out.println("Bài 2!");
        if (a < 0 || b < 0 || c < 0)
            System.out.println("Error!");
        else {
            int sum = 0;
            while (a > 0) {
                sum += a % 10;
                a /= 10;
            }
            while (b > 0) {
                sum += b % 10;
                b /= 10;
            }
            while (c > 0) {
                sum += c % 10;
                c /= 10;
            }
            System.out.println(sum);
        }
    }

    public static void sumMinMax(int a, int b, int c) {
        System.out.println("Bài 3!");
        int temp[] = new int[3];
        temp[0] = a;
        temp[1] = b;
        temp[2] = c;
        int max = temp[0];
        int min = temp[0];
        for (int i = 1; i < 3; i++) {
            if (max < temp[i])
                max = temp[i];
        }
        for (int i = 1; i < 3; i++) {
            if (min > temp[i])
                min = temp[i];
        }
        System.out.println(min + max);
    }

    public static int gcd(int a, int b) {
        while (a * b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public static void gcd(int a, int b, int c) {
        System.out.println("Bài 4!");
        int temp = gcd(a, b);
        System.out.println(gcd(temp, c));

    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);

    }

    public static void lcm(int a, int b, int c) {
        System.out.println("Bài 5!");
        int temp = lcm(a, b);
        System.out.println((lcm(temp, c)));
    }

    public static void solveQuadratic(int a, int b, int c) {
        System.out.println("Bài 6!");
        int dental = b * b - 4 * a * c;
        if (dental < 0)
            System.out.println("No solution!");
        else {
            if (dental == 0) {
                double temp = -b / (2 * a);
                System.out.println(temp);
            } else {
                double temp1 = (-b + Math.sqrt(dental)) / (2 * a);
                double temp2 = (-b - Math.sqrt(dental)) / (2 * a);
                System.out.println(temp1);
                System.out.println(temp2);
            }

        }

    }

    public static void main(String [] args){
        sum(12,12,14);
        sumMinMax(100, 1234, 1892323);
        sumDigits(12131231, 3242, 5454);
        gcd(10, 15, 8);
        lcm(123,1234,872);
        solveQuadratic(1, 2, 1);
        solveQuadratic(1, -3, 5);
        solveQuadratic(1, -3, -5);
        solveQuadratic(100, -3, 5);
    }
}
