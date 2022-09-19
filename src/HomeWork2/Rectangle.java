package HomeWork2;

import java.util.Scanner;

public class  Rectangle {
    private double width, height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double Area;
        Area = width * height;

        return Area;
    }

    public double getLength() {
        double Length;
        Length = width + height;

        return Length;
    }

//测试类
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double width, height;
        String color;

        width= sc.nextDouble();
        height= sc.nextDouble();
        color=sc.nextLine();

        Rectangle rt = new Rectangle(width,height,color);
        double A = rt.getArea();
        double L = rt.getLength();

        System.out.printf("面积：%.2f\n",A);
        System.out.printf("周长：%.2f\n",L);
    }
}
