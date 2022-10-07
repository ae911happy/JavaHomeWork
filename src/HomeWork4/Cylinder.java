package HomeWork4;

public class Cylinder extends Circle {
    double height,Vol;

    public Cylinder() {
    }

    Cylinder (double r, double h) {
        radius = r;
        height = h;
    }
    double getHeight () {
        height = this.height;
        return height;
    }
    double getVol () {
        Vol = 3.14*Math.pow(radius,2)*height;

        return Vol;
    }
    void dispVol () {
        System.out.println(Vol);
    }
}
