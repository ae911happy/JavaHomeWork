package PTACaogao;

import java.util.Scanner;

public class Main {
    private int no;
    private String name;
    private int age;
    private String seminary;
    private int no1;
    private String name1;
    private int age1;
    private String seminary1;

    public Main() {
    }

    public Main(int no, String name, int age, String seminary) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.seminary = seminary;
    }

    public int getNo1() {
        return no1;
    }

    public void setNo1(int no1) {
        this.no1 = no1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }

    public String getSeminary1() {
        return seminary1;
    }

    public void setSeminary1(String seminary1) {
        this.seminary1 = seminary1;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeminary() {
        return seminary;
    }

    public void setSeminary(String seminary) {
        this.seminary = seminary;
    }

    public String toString()
    {
        return "no: "+no+", "+"name:"+name+", "+"age: "+age+", "+"seminary: "+seminary;
    }
    public boolean equals(Main t) {
        return this.no == t.no;
    }
    //测试类：
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        String name;
        int age;
        String seminary;
        int no1;
        String name1;
        int age1;
        String seminary1;

        no=sc.nextInt();
        name=sc.next();
        age=sc.nextInt();
        seminary= sc.next();
        no1= sc.nextInt();
        name1=sc.next();
        age1=sc.nextInt();
        seminary1= sc.next();

        Main t1 = new Main(no,name,age,seminary);
        Main t2 = new Main(no1,name1,age1,seminary1);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
    }
}
