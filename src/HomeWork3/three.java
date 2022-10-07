package HomeWork3;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;

        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            if(c >= 'a' && c <= 'z'){
                smallcount++;
            }else if(c >= 'A' && c <= 'Z'){
                bigcount++;
            }else if(c >= '0' && c <= '9' || (c == ' ')){
                numbercount++;
            }
        }
        System.out.println(smallcount);
        System.out.println(bigcount);
        System.out.println(numbercount);
    }
}
