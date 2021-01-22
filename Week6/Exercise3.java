package Week6;

import java.util.*;

public class Exercise3 {
    // idea : dùng mảng đánh dấu
    // sắp xếp, sau đó khơi tạo 1 mảng với size là max trong mảng đã cho
    public static void solve(int a[]) {
        Arrays.sort(a);
        int n = a.length;
        int count = 1;
        System.out.print(a[0]);
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.println(" : " + count);
                count = 1;
                System.out.print(a[i]);

            }
        }
        System.out.println(" : " + count);
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 1, 3, 4, 4, 5 };
        solve(a);
    }
}
