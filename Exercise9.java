import java.util.*;

public class Exercise9 {
   public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] a = new int[10000];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(); // storing random integers in an array
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < 10000; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            }
            else if (a[i] > max2 && a[i] != max1)
                max2 = a[i];
        }
        System.out.print(max2);
    }
}
