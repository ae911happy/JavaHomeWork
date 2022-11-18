package blak;

public class TestInterface1 {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.swim();
        d.fly();
    }
}

interface Swimmable
{
    default void swim()
    {
        System.out.println("游泳");
    }
}

interface Flyable
{
    default void fly()
    {
        System.out.println("飞");
    }
}

class Duck implements Swimmable,Flyable
{

}
