package week2;

public class Exercise7 {
    public static void solve(int a[][]) {
        int N = 10000;
        int count = 0;
        int tmp[][] = new int[N][N];
        // Đưa 2 hcn về góc phần tư thứ nhất
        if (a[0][0] < 0 && a[0][0] < a[2][0]) {
            a[1][0] -= a[0][0];
            a[2][0] -= a[0][0];
            a[3][0] -= a[0][0];
            a[0][0] = 0;
        }
        if (a[2][0] < 0 && a[2][0] < a[0][0]) {
            a[0][0] -= a[2][0];
            a[1][0] -= a[2][0];
            a[3][0] -= a[2][0];
            a[2][0] = 0;
        }
        if (a[0][1] < 0 && a[0][1] < a[2][1]) {
            a[1][1] -= a[0][1];
            a[2][1] -= a[0][1];
            a[3][1] -= a[0][1];
            a[0][1] = 0;
        }
        if (a[2][1] < 0 && a[2][1] < a[0][1]) {
            a[0][1] -= a[2][1];
            a[1][1] -= a[2][1];
            a[3][1] -= a[2][1];
            a[2][1] = 0;
        }
        // Tô màu là 1 cho tất cả các ô thuộc hcn AB
        for (int i = a[0][0] + 1; i <= a[1][0]; i++) {
            for (int j = a[0][1] + 1; j <= a[1][1]; j++) {
                tmp[i][j] = 1;
            }
        }
        // Tô màu là 2 cho tất cả các ô thuộc hcn CD
        for (int i = a[2][0] + 1; i <= a[3][0]; i++) {
            for (int j = a[2][1] + 1; j <= a[3][1]; j++) {
                tmp[i][j] = 2; 
            }
        }
        // Đếm số ô được tô 2 trong hcn AB
        for (int i = a[0][0] + 1; i <= a[1][0]; i++) {
            for (int j = a[0][1] + 1; j <= a[1][1]; j++) {
                if (tmp[i][j] == 2) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Hai hcn không giao nhau!");
        } else {
            System.out.println("Hai hcn giao nhau " + count + " đơn vị diện tích!");
        }
    }

    public static void main(String[] args) {
        int a[][] = { { -2, 3 }, { 3, 7 }, { -3, 4 }, { 4, 6 } };
        solve(a);
    }
}
