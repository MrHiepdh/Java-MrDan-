public class Exercise3 {
    public static boolean redundancy(int n) {// redundancy :dư thừa
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum > n) {
            return true;
        } else {
            return false;
        }
    }

    public static void solve(int n) {
        boolean have = false;
        for (int i = n + 1; !have; i++) {
            if (redundancy(i)) {
                System.out.println(i);
                have = true;
            }
        }
    }

    public static void main(String[] args) {
        solve(6);
    }
}
