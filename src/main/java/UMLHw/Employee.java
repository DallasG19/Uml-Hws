package UMLHw;

public class Employee extends Customer{
    private final double discount = .1;

    public Employee(String name, char size, Clothing[] clothingItems) {
        super(name, size, clothingItems);
    }

    public double getDiscount() {

        return discount;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "discount=" + discount +
                '}';
    }
}
