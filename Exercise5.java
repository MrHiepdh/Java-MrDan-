public class Exercise5 {
    // idea1 3 điểm thẳng hàng khi tam giác được chúng tạo ra có S = 0
    public static void solve(int a[][]) {
        int area = a[0][0] * (a[1][1] - a[2][1]) + a[1][0] * (a[2][1] - a[0][1]) + a[2][0] * (a[0][1] - a[1][1]);
        if (area == 0) {
            System.out.println("True!");
        } else {
            System.out.println("False!");
        }
    }

    // idea2 xét hệ số góc
    public static void solve2(int a[][]) {// (y3-y2)*(x2-x1)==(y2-y1)*(x3-x2)
        if ((a[2][1] - a[1][1]) * (a[1][0] - a[0][0]) == (a[1][1] - a[0][1]) * (a[2][0] - a[1][0])) {
            System.out.println(("True"));
        } else {
            System.out.println("False");
        }

    }

    public static void main(String[] args) {
        int a[][] = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
        solve(a);
    }
}
