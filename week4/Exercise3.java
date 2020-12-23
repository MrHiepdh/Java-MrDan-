package week4;
//idea : sử dụng mảng đánh dấu để xét các kí tự đã đếm
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp[] = new int[26];
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int flag = ch;
            int count = 1;
            if (temp[flag - 97] == 0) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (ch == str.charAt(j))
                        count++;
                }
                if (count > 1) {
                    String tmp = Integer.toString(count);
                    result += ch + tmp;
                } else {
                    result += ch;
                }
                temp[flag - 97] = 1;
            }
        }
        System.out.println(result);
        sc.close();
    }

}
