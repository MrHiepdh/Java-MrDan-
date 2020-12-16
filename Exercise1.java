public class Exercise1 {
    public static void solve(int n) {
        int temp = 3 * (n * (n - 1)) / 2 + n * 2;
        System.out.println("Số lá bài cần là :" + temp);
    }

    public static void main(String[] args) {
        solve(3);
    }
}
