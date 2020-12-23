package week2;

import java.lang.Math;

public class Exercise2 {
    public static void result(int a, int b) {
        int N = 1000;
        boolean[] check = new boolean[N];
        for (int i = 2; i < N; i++) {
            check[i] = true;
        }
        for (int i = 2; i < N; i++) {
            if (check[i] == true) {
                for (int j = 2 * i; j < N; j += i) {
                    check[j] = false;
                }
            }
        }
        boolean have = false;
        for (int i = a + 1; i < b; i++) {
            int temp = (int) Math.sqrt(i);
            if (temp * temp == i && check[temp] == true) {
                System.out.println(i + " ");
                have = true;
            }
        }
        if (!have) {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        result(3, 6);
    }
}
