package Week5;

//idea  : chia số đó thành các bộ 3 chữ số và bắt đầu đọc 
// đọc được các số nhỏ hơn 1000
import java.util.Scanner;

public class Exercise1 {
    public static void read(int n) {
        String unit[] = { "mốt", "hai", "ba", "tư", "lăm", "sáu", "bảy", "tám", "chín" };// unit : hàng đơn vị
        String dozen[] = { "mười", "hai", "ba", "bón", "năm", "sáu", "bảy", "tám", "chín" };// dozen : hàng chục
        String hundred[] = { "một", "hai", "ba", "bón", "năm", "sáu", "bảy", "tám", "chín" };// hundre : hàng trăm
        int index3 = n % 10;// lưu chữ số hàng đơn vị
        n /= 10;
        int index2 = n % 10;// lưu chữ số hàng chục
        n /= 10;
        int index1 = n % 10;// lưu chữ số hàng trăm
        String read = "";
        if (index1 != 0) {
            read += hundred[index1 - 1] + " trăm ";
        }
        if (index1 != 0 && index2 == 0 && index3 != 0) {// trường hơp các số 101 đến 109 và tương đương với các chữ số
                                                        // hàng trăm khác
            read += "lẻ ";
            if (index3 == 4) {
                read += "bốn";
            } else if (index3 == 5) {
                read += "năm";
            } else if (index3 == 1) {
                read += "một";
            } else {
                read += unit[index3 - 1];
            }
        } else if (index2 != 0) {
            if (index2 == 1) {// vì 110 là một trăm mười
                read += "mười ";
                if (index3 != 0) {
                    if (index3 == 1) {
                        read += "một";
                    } else {
                        read += unit[index3 - 1];
                    }
                }
            } else {// từ 20 thì 0 được đọc là mươi
                if (index3 == 0) {
                    read += dozen[index2 - 1] + " mươi";
                } else {
                    read += dozen[index2 - 1] + " " + unit[index3 - 1];
                }
            }
        }
        if (index1 == index2 && index2 == 0) {// trường hợp số có 1 chữ số
            if (index3 == 4) {
                read += "bốn";
            } else if (index3 == 5) {
                read += "năm";
            } else if (index3 == 1) {
                read += "một";
            } else {
                read += unit[index3 - 1];
            }
        }
        System.out.println(read);
    }

    public static void solve(int n) {
        int level = 0;
        while (n > 0) {
            level++;
            n /= 1000;
        }

        System.out.println(level);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            solve(n);
        }
        sc.close();
    }

}
