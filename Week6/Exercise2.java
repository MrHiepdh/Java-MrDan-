package Week6;

import java.lang.Math;

public class Exercise2 {
    public static void display(int a[], int n) {
        for (int t : a) {
            System.out.print(t);
        }
        System.out.println("\n");
    }

    public static void next(int a[], int n) {
        ++a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            if (a[i] > 1) {
                a[i - 1]++;
                a[i] -= 2;
            }
        }
    }

    public static void solve(int n, int a[]) {
        for (int i = 0; i < Math.pow(2, (double) n); i++) {
            display(a, n);
            next(a, n);
        }
    }

    public static void main(String[] args) {
        int a[] = new int[4];// khởi tạo chuỗi ban đầu
        solve(4, a);
    }
}
