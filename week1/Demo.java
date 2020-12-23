package week1;
import java.util.Scanner;
import java.lang.Math;

public class Demo {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char str1 = sc.next().charAt(0);
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1) {
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
        int tmp[] = new int[3];
        for (int i = 0; i < 3; i++) {
            tmp[i] = sc.nextInt();
        }
        int max = tmp[0];
        int min = tmp[0];
        for (int i = 1; i < 3; i++) {
            if (max < tmp[i]) {
                max = tmp[i];
            }
            if(min>tmp[i]){
                min = tmp[i];
            }
        }
        System.out.println("Max : " + max + " Min : " + min);
        for (int i = 0; i < 3; i++) {
            if (isPrime(tmp[i])) {
                System.out.println(tmp[i]);
            }
        }
        for (int i = 0; i < 3; i++) {
            int flag = (int) Math.sqrt(tmp[i]);
            if (flag * flag == tmp[i]) {
                if (isPrime(flag)) {
                    System.out.println(tmp[i]);
                }
            }
        }
        sc.close();
    }
}
