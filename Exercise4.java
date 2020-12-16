public class Exercise4 {
    public static int solve(int t) {
        int temp = 2 * t - 1;
        return temp * temp * temp;
    }

    public static void result(int n) {
        if (n < 1) {
            System.out.println("-1");
        } else {
            int sum = 1;
            for (int i = 2; i <= n; i++) {
                sum += solve(i);
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args){
        result(7);
        result(13);
    }
}
