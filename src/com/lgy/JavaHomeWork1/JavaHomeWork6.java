package com.lgy.JavaHomeWork1;

    public class JavaHomeWork6 {
        public static void main(String[] args) {
            int sum=0,i;
            for (i=1;;i++)
            {
                sum=sum+i;
                if (sum<8888)
                {
                    continue;
                }else {
                    break;
                }
            }
            System.out.println(i-1);
        }
}
