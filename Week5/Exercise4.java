package Week5;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 1; i <= n; i++) {
            a[n - i] = sc.nextInt();
        }
        for (int temp : a) {//for each
            System.out.print(temp + " ");
        }
        sc.close();
    }
}
