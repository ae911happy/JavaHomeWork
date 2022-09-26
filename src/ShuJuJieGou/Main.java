package ShuJuJieGou;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        m=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int j=0;j<m;j++)
        {
            int k=arr[n-1];
            for(int i=n-1;i>0;i--)
            {
                arr[i]=arr[(i-1+n)%n];
            }
            arr[0]=k;
        }

        for(int i=0;i<n;i++)
        {
            if(i==n-1)
                System.out.printf("%d",arr[i]);
            else
                System.out.printf("%d ",arr[i]);
        }
    }
}
