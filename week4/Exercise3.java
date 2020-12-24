package week4;
//idea : sử dụng mảng đánh dấu để xét các kí tự đã đếm
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp[] = new int[26];//khởi tạo 1 mảng có size bằng với số kí tự chữ cái là 26
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int flag = ch;//chuyển từ giá trị kí tự sang giá trị int
            int count = 1;//biến để đếm số lần xuất hiện
            if (temp[flag - 97] == 0) {// nếu phần tử với index là giá trị int của kí tự đang xét là 0 thì đếm
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
                temp[flag - 97] = 1;//gán phần tử hiện tại của mảng là 1 để đánh dấu là đã xét
            }
        }
        System.out.println(result);
        sc.close();
    }

}
