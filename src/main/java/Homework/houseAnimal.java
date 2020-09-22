package Homework;

public abstract class houseAnimal extends Pets implements IGreet{

    public houseAnimal(String name) {
        super(name);
    }
    public void greeting() {
        System.out.println("*licks*");
    }
}
