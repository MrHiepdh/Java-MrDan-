package Week6;

public class Exercise1 {
    public static void solve(int a, int b) {
        int m = a, n = b;
        while (a * b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        a += b;
        System.out.println(a + " " + m * n / a);
    }

    public static void main(String[] args) {
        solve(7, 8);
        solve(2, 6);
    }
}
