package week4;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        int count = 1;// biến để đếm số lần xuất hiện
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {//nếu bằng tăng biến đếm lên 1
                count++;
            } else {// nếu không thì thêm vào chuỗi kết quả và reset biến đếm 
                if(count>1){
                result += str.charAt(i) + String.valueOf(count);
                }
                else if(count==1){
                    result += str.charAt(i);
                }
                count = 1;
            }
        }
        //vì chỉ xét đến str.length - 1 nên cần xét 2 trường hợp sau
        if (str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
            result += str.charAt(str.length() - 1);
        } else if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
            result += str.charAt(str.length() - 1) + String.valueOf(count);
        }
        System.out.println(result);
        sc.close();
    }
}
