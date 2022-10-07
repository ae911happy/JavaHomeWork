package HomeWork4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入半径：");
        double r = sc.nextDouble();
        Circle radius = new Circle(r);
        radius.getRadius();
        System.out.print("输入圆柱体的高：");
        double h = sc.nextDouble();
        Cylinder height = new Cylinder(r,h);
        height.getHeight();
        Cylinder Vol = new Cylinder(r,h);
        System.out.print("圆柱体的体积是：");
        double i = Vol.getVol();
        System.out.println(i);
    }
}
