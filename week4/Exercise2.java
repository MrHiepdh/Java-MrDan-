package week4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        boolean equal = true;
        for (int i = 0; i < len / 2; i++) {// xét từ vị trí 0 đến vị trí len/2 - 1
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                equal = false;
                break;
            }
        }
        System.out.println(equal);
        sc.close();

    }

}
