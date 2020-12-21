import java.lang.Math;

public class Exercise7_2 {
    public static boolean inOrOut(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (x2 < x1 && x1 < x3 && y2 < y1 && y1 < y3) {
            return true;
        }
        return false;
    }

    public static boolean between(int x1, int x2, int x3, int x4) {
        if (x1 < x3 && x3 < x4 && x4 < x2) {
            return true;
        }
        return false;
    }

    public static void solve(int a[][]) {
        int area = 0;
        boolean inA = inOrOut(a[0][0], a[0][1], a[2][0], a[2][1], a[3][0], a[3][1]);
        boolean inB = inOrOut(a[1][0], a[1][1], a[2][0], a[2][1], a[3][0], a[3][1]);
        boolean inC = inOrOut(a[2][0], a[2][1], a[0][0], a[0][1], a[1][0], a[1][1]);
        boolean inD = inOrOut(a[3][0], a[3][1], a[0][0], a[0][1], a[1][0], a[1][1]);
        if (inA == true && inB == false) {
            if (a[1][1] > a[3][1]) {
                area = Math.abs((a[0][0] - a[3][0]) * (a[0][1] - a[3][1]));
            } else {
                area = Math.abs((a[0][0] - a[3][0]) * (a[0][1] - a[1][1]));
            }
        } else if (inA == true && inB == true) {
            area = Math.abs((a[0][0] - a[1][0]) * (a[0][1] - a[1][1]));
        } else if (inC == true && inD == false) {
            if (a[3][1] > a[1][1]) {
                area = Math.abs((a[1][0] - a[2][0]) * (a[1][1] - a[2][1]));
            } else {
                area = Math.abs((a[1][0] - a[2][0]) * (a[3][1] - a[2][1]));
            }
        } else if (inC == true && inD == true) {
            area = Math.abs((a[3][0] - a[2][0]) * (a[3][1] - a[2][1]));
        } else if (between(a[2][0], a[3][0], a[0][0], a[1][0])) {
            area = Math.abs((a[0][0] - a[1][0]) * (a[2][1] - a[3][1]));
        } else if (between(a[0][0], a[1][0], a[2][0], a[3][0])) {
            area = Math.abs((a[2][0] - a[3][0]) * (a[0][1] - a[1][1]));
        }
        System.out.println("Hai hình chữ nhật giao nhau " + area + " đơn vị diện tích!");
    }

    public static void main(String[] args) {
        int a[][] = { { -2, 3 }, { 3, 7 }, { -3, 4 }, { 4, 6 } };
        solve(a);
    }
}
