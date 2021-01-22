package Week5;

//idea : đọc theo các quy tắc thường hay dùng
//sử dụng hàm replace để chuẩn hóa về các trường hợp đăc biệt
import java.util.Scanner;

public class Exercise1_2 {

    static String analyze(int n) {
        if (n == 0)
            return "không";
        String[] a = { "tỷ", "trăm", "mươi", "triệu", "trăm", "mươi", "nghìn", "trăm", "mươi" };
        String[] call = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
        int i = a.length - 1;
        String result = "";
        while (n > 0) {
            result = call[n % 10] + " " + result;
            if (n >= 10) {
                result = a[i] + " " + result;
            }
            n /= 10;
            i--;
        }
        // replace
        result = result.replace("mươi năm", "mươi lăm");
        result = result.replace("mươi bốn", "mươi tư");
        result = result.replace("mươi một", "mươi mốt");
        result = result.replace("một mươi", "mười");
        result = result.replace("không mươi", "linh");
        result = result.replace("linh lăm", "linh năm");
        result = result.replace("linh mốt", "linh một");
        result = result.replace("mười không", "mười");
        result = result.replace("mười mốt", "mười một");
        result = result.replace("mười tư", "mười bốn");
        result = result.replaceAll("không trăm linh không( (" + a[0] + "|" + a[3] + "|" + a[6] + ")|) ", "");
        result = result.replaceAll("linh không( |)", "");
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while (t-- > 0) {
            n = sc.nextInt();
            System.out.println(analyze(n));
        }
        sc.close();
    }
}
