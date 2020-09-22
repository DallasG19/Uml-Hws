package Homework;

public class Dog extends Pets implements IGreet{
    public Dog(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "Bark Bark";
    }

    public void greeting() {
        System.out.println("*licks*");
    }
}