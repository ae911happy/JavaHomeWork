package Caogao;
class Main {
    static int x = 10;
    static {
        x += 5;
        System.out.println("x=" + x);
    }
    public static void main(String args[ ])
    {
        System.out.println("x=" + x);
    }
    static {
        x /= 3;
        System.out.println("x=" + x);
    }
}
