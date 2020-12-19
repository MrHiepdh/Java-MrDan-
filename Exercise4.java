public class Exercise4 {
    public static int solve(int t) {
        int temp = 2 * t - 1;
        return temp * temp * temp;
    }

    public static void result(int n) {
        int sum = 1, i;
        for (i = 2; i <= n; i++) {
            sum += solve(i);
            if (sum > Integer.MAX_VALUE) {
                break;
            }
        }
        if (i < n)
            System.out.println(("-1"));
        else {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        result(7);
        result(13);
    }
}
