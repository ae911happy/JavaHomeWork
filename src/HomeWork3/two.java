package HomeWork3;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = "";
        char c1 = str.charAt(str.length() - 3);
        char c2 = str.charAt(str.length() - 2);
        char c3 = str.charAt(str.length() - 1);

        for (int i = 0; i < str.length() - 3; i++) {
            str1 = str1 + str.charAt(i);
        }
        str1 = "" + c1 + c2 + c3 + str1;
        System.out.println(str1);
    }
    }

