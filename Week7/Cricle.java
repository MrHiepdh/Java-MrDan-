package Week7;

import java.util.*;

public class Cricle {
    double radius;
    double pi = 3.14;

    public void Cricle(double radius) {
        this.radius = radius;
    }

    public double getAre() {
        return radius * radius * pi;
    }

    public double getPre() {
        return 2 * pi * radius;
    }
}

class run1 {
    public static void main(String[] args) {
        Cricle cr1 = new Cricle();
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        cr1.Cricle(radius);
        System.out.printf("Area : %.2f" ,cr1.getAre());
        System.out.println("Area : " + cr1.getPre());
        sc.close();
    }
}
