package Week10;
import java.util.*;
import java.lang.*;

class tmp {
    public static double Pi = 3.14;

    public static int abs(int a) {
        if (a <= 0)
            return -a;
        return a;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int pow(int a, int b) {
        if (b % 2 == 0)
            return pow(a, b / 2) * pow(a, b / 2);
        else
            return pow(a, b / 2) * pow(a, b / 2) * a;
    }

    public static int arrayCaculator(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];
        }
        return tmp;
    }

    public static double arrayCaculator(double[] arr) {
        double tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            tmp += arr[i];
        }
        return tmp;
    }

    public static double area(double a, double b) {
        return a * b;
    }

    public static double area(double a) {
        return a * a;
    }

    public static double area(double a, double b, double c) {
        double tmp = (a + b + c) / 2;
        return Math.sqrt(tmp*(tmp-a)*(tmp-b)*(tmp-c));
    }
}
