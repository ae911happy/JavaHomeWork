package PTACaogao;
import java.util.Scanner;

class MyException extends Exception {
    int n;

    public MyException(int n) {
        this.n = n;
    }

    public String toString() {
        return n + "invalid";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int Jige = 0;
        int BuJiGe = 0;
        for (int i=0;i<m;i++){
            int n = sc.nextInt();
            if (n < 0 || n > 100) {
                i--;
                try {
                    throw new  MyException(n);
                } catch (MyException e) {
                    System.out.println(e.toString());
                }
            }
            else if (n >= 60)
            {Jige++;}
            else
            {BuJiGe++;}
        }
        System.out.println(Jige);
        System.out.println(BuJiGe);
        }
    }
