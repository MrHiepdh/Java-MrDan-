package week4;

//idea : sử dụng mảng đánh dấu để xét các kí tự đã đếm
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        int count = 1;// biến để đếm số lần xuất hiện
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result += str.charAt(i) + String.valueOf(count);
                count = 1;
            }
        }
        if (str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
            result += str.charAt(str.length() - 1) + "1";
        } else if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
            result += str.charAt(str.length() - 1) + String.valueOf(count);
        }
        System.out.println(result);
        sc.close();
    }
}
