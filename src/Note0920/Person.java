package Note0920;

public class Person {
    private String name;
    private int age;

    public Person()
    {
        System.out.println("Person");
    }

    public Person(String name)
    {
        this();
        System.out.println("有参Person");
        this.setName(name);
    }

    public  Person(String name,int age)
    {
        this(name);
        System.out.println("双参Person");
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String talk()
    {
        String info;
        info="6666"+this.getName();
        return info;
    }

}
