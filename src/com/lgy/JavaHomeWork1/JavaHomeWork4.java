package com.lgy.JavaHomeWork1;

public class JavaHomeWork4 {
    public static void main(String[] args) {
        int i;
        long j,item;
        long sum=0;
        for(i=1;i<=10;i++)
        {
            item=(long)Math.pow(10,i);
            j=(item-1)/9*8;
            sum=sum+j;}
        System.out.println(sum);
    }
}
