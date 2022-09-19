package com.lgy.JavaHomeWork1;

public class JavaHomeWork3 {
    public static void main(String[] args) {
        long JieCheng;
        long sum=0;
        for (int i=1;i<=20;i++)
        {
            JieCheng=1;

            for (int a=1;a<=i;a++)
            {
                JieCheng=a*JieCheng;
            }
            sum=sum+JieCheng;
        }
        System.out.println(sum);
    }
}
