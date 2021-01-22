package Week6;

public class Exercise5 {
    public static void multiply(int a[][], int b[][]) {
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;
        int result[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
                for (int t = 0; t < k; t++) {
                    result[i][j] += a[i][t] * b[t][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int a[][] = { { 3, 2, 1 }, { 0, -1, 4 }, { -2, 3, 0 } };
        int b[][] = { { 1, 2 }, { 3, 0 }, { 4, -1 } };
        multiply(a, b);
    }
}
