package HomeWork4;

import java.util.Scanner;

public class Circle {
    double radius,Perimeter,Area;


    public Circle() {
        radius = 0;
    }
    public Circle(double r) {
        radius = r;
    }

    double getRadius() {
        radius = this.radius;
        return radius;
    }
    double getPerimeter() {
        Perimeter = 2*3.14*radius;
        return Perimeter;
    }
    double getArea() {
        Area = 3.14*Math.pow(radius,2);
        return Area;
    }
    void disp()
    {
        System.out.println(radius+Perimeter+Area);
    }
}



