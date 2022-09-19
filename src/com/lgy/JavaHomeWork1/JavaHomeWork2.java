package com.lgy.JavaHomeWork1;

public class JavaHomeWork2 {
    public static void main(String[] args) {
        int sumZheng=0,sumFu=0,sum=0;
        for (int i=13;i<=993;i+=20)
        {
            sumZheng+=i;
        }
        for (int n=23;n<=1003;n+=20)
        {
            sumFu+=n;
        }
        sum=sumZheng-sumFu;
        System.out.println(sum);
    }
}
