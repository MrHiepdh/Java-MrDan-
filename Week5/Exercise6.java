package Week5;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean have = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '1' && ch <= '9') {
                have = true;
                break;
            }
        }
        System.out.println(have);
        sc.close();
    }
}
