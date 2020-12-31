package Week5;
// công thức tính tổng = (số đầu + số cuối) * số số hạng / 2 (chỉ áp dụng với dãy số là cấp số cộng )
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amount = n / 2 + 1;//số số hạng 
        if (n % 2 != 0)
            n -= 1;//đảm bảo n luôn là số chẵn cuối cùng trong dãy cần tính toán
        System.out.println(amount * n / 2);
        sc.close();
    }
}
