package week2;

public class Exercise6 {
    public static void solve(int a, int b, int c, int d) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i >= c && i <= d)
                count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        solve(3, 5, 3, 4);
    }
}
