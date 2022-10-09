package PTACaogao;

import java.util.Scanner;

public class Rect {
    double l;
    double h;
    double z;//长度 宽度 高度

    public Rect() {
    }

    public Rect(double l, double h, double z) {
        this.l = l;
        this.h = h;
        this.z = z;
    }

    public double length() {
        double length;
        length = 2 * l * h;

        return length;
    }

    public double area() {
        double area;
        area = l * h;
        return area;
    }
}
    //立方体类
     class Cubic extends Rect {
        public Cubic(double l, double h, double z) {
            super(l, h, z);
        }

        //表面积
        public double area() {
            double area;
            area = 2 * (l * z) + 2 * (h * z) + 2 * (l * h);
            return area;
        }

        //体积
        public double vol() {
            double vol;
            vol = l * h * z;
            return vol;
        }
    }

        //四棱锥类
        class Pyramid extends Rect {
            public Pyramid(double l, double h, double z) {
                super(l, h, z);
            }

            //表面积
            public double area() {
                double area;
                double s1 = Math.sqrt((l / 2) * (l / 2) + z * z);
                double s2 = Math.sqrt((h / 2) * (h / 2) + z * z);
                area = s1 * h + s2 * l + super.area();
                return area;
            }

            public double V() {
                double V;
                V = 1 / 3 * (l * h * z);
                return V;
            }
        }


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double l = sc.nextDouble();
            double h = sc.nextDouble();
            double z = sc.nextDouble();
            System.out.println();
            if (l <= 0 || h <= 0 || z <= 0) {
                i = 0;
                h = 0;
                z = 0;
            }
            Cubic cr=new Cubic(l,h,z);
        }
    }
}
