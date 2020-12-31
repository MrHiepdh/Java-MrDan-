package Week5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        int index = str.indexOf(ch);
        if(index == -1){
            System.out.println("False!");
        }
        else{
            System.out.println("True!");
        }
        sc.close();
    }
}
