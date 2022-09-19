package HomeWork2;

import java.util.Scanner;

public class Accout {
    String name,date,Accout;
    int passport;
    double money;

    public Accout(String name, String date, String accout, int passport, double money) {
        this.name = name;
        this.date = date;
        Accout = accout;
        this.passport = passport;
        this.money = money;
    }

    public void CunQian(double money)
    {
    this.money=this.money+money;
    }

    public void QuQian()
    {
        this.money=this.money-money;
    }

    public void ChangePassport()
    {
        this.passport=passport;
    }

    public String ChaBioashi()
    {
        return Accout;
    }

    public String ChaName()
    {
        this.name=name;
        return name;
    }

    public String ChaDate()
    {
        this.date=date;
        return date;
    }

    public double ChaMoney()
    {
        return money;
    }

    //测试类
    public static void main(String[] args) {
        Accout a = new Accout("sb","2022","bfhadjsfgydsvgydf",123456,88.8);
        System.out.println(a.money);
        Scanner sc=new Scanner(System.in);
        double money= sc.nextDouble();
        a.CunQian(money);
        System.out.println(a.money);
    }
}
