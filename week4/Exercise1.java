package week4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch <= 'A' && ch >= 'Z')) {
                str1 += ch + " ";
            } else if (ch <= '9' && ch >= '0') {
                str2 += ch + " ";
            }
        }
        System.out.println(str1);
        System.out.println(str2);
        sc.close();
    }
}
