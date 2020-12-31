package Week5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
        sc.close();
    }

}
