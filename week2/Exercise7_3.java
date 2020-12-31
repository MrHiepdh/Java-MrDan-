package week2;

public class Exercise7_3 {

    public static void solve(int a[][]) {
        int top = Math.min(a[1][1], a[3][1]);
        int bot = Math.max(a[0][1], a[2][1]);
        int left = Math.max(a[0][0], a[2][0]);
        int right = Math.min(a[1][0], a[3][0]);
        if (top <= bot || right <= left) {
            System.out.println("Hai hình chữ nhật không giao nhau!");
            return;
        }
        System.out.print("Hai hình chữ nhật giao nhau " + ((top - bot) * (right - left))+" đơn vị diện tích!");
    }

    public static void main(String[] args) {
        int a[][] = { { -2, 3 }, { 3, 7 }, { -3, 4 }, { 4, 6 } };
        solve(a);
    }
}
