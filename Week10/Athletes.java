package Week10;

import java.util.*;

public class Athletes {// vận động viên
    Scanner sc = new Scanner(System.in);

    private String fullName;
    private int age;
    private String subject;
    private double height;
    private double weigth;

    Athletes() {
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weigth;
    }

    Athletes(String fullName, int age, String subject, double height, double weight) {
        this.age = age;
        this.fullName = fullName;
        this.height = height;
        this.weigth = weight;
        this.subject = subject;
    }

    public boolean higher(double height1, double height2, double weight1, double weight2) {
        if (height1 > height2) {
            return true;
        } else if (height1 < height2) {
            return false;
        } else {
            if (weight1 > weight2)
                return true;
            else
                return false;
        }
    }

    public void output() {
        System.out.println("Name: " + this.fullName);
        System.out.println("Age: " + this.age);
        System.out.println("subject: " + this.subject);
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weigth);
    }

    public Athletes input() {
        System.out.print("Enter the full name: ");
        this.fullName = sc.nextLine();
        System.out.print("Enter the age: ");
        this.age = sc.nextInt();
        sc.nextLine();// sau những method nextInt() hay nextDouble kí tự Enter vẫn còn trong bộ nhớ
                      // đệm nên cần thêm 1 dòng sc.nextLine()
        System.out.print("Enter the subject: ");
        this.subject = sc.nextLine();
        System.out.print("Enter the height: ");
        this.height = sc.nextDouble();
        System.out.print("Enter the weight ");
        this.weigth = sc.nextDouble();
        return this;
        // khi tạo Scanner trong method và close cuối method sẽ dẫn đến Error No Line
        // Found
    }

}

class run10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Athletes p = new Athletes("apolo", 20, "football", 1.8, 56);
        p.output();
        int n = sc.nextInt();
        Athletes[] arr = new Athletes[n];
        for (int i = 0; i < n; i++) {
            Athletes tmp = new Athletes();
            tmp.input();
            arr[i] = tmp;
        }
        boolean swap = false;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                Athletes tmp = new Athletes();
                if (tmp.higher(arr[j].getHeight(), arr[j + 1].getHeight(), arr[j].getWeight(),
                        arr[j + 1].getWeight())) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
            arr[i].output();
        }
        sc.close();
    }
}