import java.util.*;

public class Test2 {
    public static void sort(int a[]) {
        System.out.println("Exercise 1 : ");
        boolean haveSwap = false;
        for (int i = 0; i < a.length; i++) {
            haveSwap = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
                haveSwap = true;
            }
            if (haveSwap)
                break;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void sum(int a[]) {
        System.out.println("Exercise 2 : ");
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    public static void removeDuplicate(int a[]) {
        int count = 0;
        int b[] = new int[count];
        b[count++] = a[0];
        for (int i = 1; i < a.length; i++) {
            boolean have = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    have = true;
                    break;
                }
            }
            if (!have) {
                b[count++] = a[i];
            }
        }
        for (int i = 0; i <= count; i++) {
            System.out.println(b[i]);
        }
    }

    public static void testExist(int a[], int x) {
        System.out.println("Exercise 4 :");
        boolean have = false;
        for (int i = 0; i < a.length && !have; i++) {
            if (a[i] == x) {
                have = true;
                break;
            }
        }
        if (have) {
            System.out.println("True!");
        } else {
            System.out.println("False!");
        }
    }

    public static void findIndex(int a[], int x) {
        System.out.println("Exercise 5 : ");
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println(i + " ");
                index = 1;
            }
        }
        if (index == -1) {
            System.out.println(x + " isn't in array!");
        }
    }

    public static void averageValue(int a[]) {
        System.out.println("Exercise 3 : ");
        double average = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        average = (double) (sum / a.length);
        System.out.println(average);
    }

    public static void remove(int a[], int n) {
        System.out.println("Exercise 6 : ");
        int i, s = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == n) {
                break;
            }
        }
        if (i == a.length) {
            System.out.println(n + " isn't in array!");
        } else if (i < a.length) {
            s = a.length - 1;
            for (int j = i; j < s; j++) {
                a[j] = a[j + 1];
            }
            for (int j = 0; j < s; j++) {
                System.out.println(a[j]);
            }
        }
    }

    public static void maxAndMin(int a[]) {
        System.out.println("Exercise 7 : ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void secondLargest(int a[]) {
        System.out.println("Exercise 9 : ");
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max1 = a[i];
                max2 = max1;
            } else if (a[i] > max2 && a[i] != max1) {
                max2 = a[i];
            }
        }
        System.out.println(max2);
    }

    public static void average2(int a[]) {
        System.out.println("Exercise 10 : ");
        double average = 0;
        sort(a);
        for (int i = 1; i < a.length - 1; i++) {
            average += a[i];
        }
        average = (double) (average / (a.length - 2));
        System.out.println();
    }

    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] a = new int[10000];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(); // storing random integers in an array
        }
    }
}
