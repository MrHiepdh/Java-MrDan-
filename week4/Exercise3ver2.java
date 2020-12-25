package week4;

import java.util.Scanner;

public class Exercise3ver2 {

    public static void nenChuoi(String s)
    {
        int dem=1;
        String s1="";//chuỗi lưu kết quả;
        s1+=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            //cộng dần dem khi gặp kí tự giống nhau cho đến khi gặp kí tự mới thì gán vào s1 và reset dem;
            if(s.charAt(i)!=s.charAt(i-1) || i==s.length())
            {
                s1= (s1 + dem) +s.charAt(i);
                dem=1;
            }
            else
                dem++;
        }
        s1+=dem;
        System.out.println(s1);
        
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
       nenChuoi(str);
       sc.close();
    }
}

