package Week7;

import java.util.*;

public class Rectangle {
    double width;
    double length;

    public void getInfor() {
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        length = sc.nextDouble();
        sc.close();
    }

    public void getArea() {
        System.out.println("Area : " + width * length);
    }

    public void getPre() {
        System.out.println("Pre : " + ((width + length) * 2));
    }
}

class run2{
    public static void main(String []args){
        Rectangle rec1 = new Rectangle();
        rec1.getInfor();
        rec1.getArea();
        rec1.getPre();
    }
}

