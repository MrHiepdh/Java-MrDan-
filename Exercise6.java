public class Exercise6 {
    public static void solve(int a, int b, int c, int d) {
        if (b < c || d < a) {
            System.out.println("Hai tập không giao nhau!");
        } else if (c == b) {
            System.out.println("[" + b + "]");
        } else if (a == d) {
            System.out.println("[" + a + "]");
        } else {
            if (b > c && a != d) {
                int tmp[] = { a, b, c, d };
                boolean haveSwap = false;
                for (int i = 0; i < 4; i++) {
                    haveSwap = false;
                    for (int j = 0; j < 4 - 1 - i; j++) {
                        if (tmp[j] > tmp[j + 1]) {
                            int t = tmp[j];
                            tmp[j] = tmp[j + 1];
                            tmp[j + 1] = t;
                        }
                        haveSwap = true;
                    }
                    if (haveSwap)
                        break;
                }
                System.out.println("[" + tmp[1] + "," + tmp[2] + "]");
            }
        }
    }

    public static void main(String[] args) {
        solve(3, 5, 3, 4);
    }
}
