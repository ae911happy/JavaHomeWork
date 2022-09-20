package NOte;

public class Note {
    private String name;
    private int age;

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
