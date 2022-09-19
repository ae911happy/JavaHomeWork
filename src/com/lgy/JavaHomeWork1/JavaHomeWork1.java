package com.lgy.JavaHomeWork1;

public class JavaHomeWork1 {
    public static void main(String[] args) {
        int ge,shi,bai;
        int Count=100;

        for (;Count<1000;Count++)
        {
            ge=Count%10;
            shi=Count%100/10;
            bai=Count/100;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==Count)
            {
                System.out.println(Count);
            }
        }
    }
}
