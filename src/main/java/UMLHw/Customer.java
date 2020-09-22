package UMLHw;

import java.util.Arrays;

public class Customer {
    private String name;
    private Clothing[] clothingItems;
    private char size;
    public Customer(String name, char size, Clothing[] clothingItems ){
        this.name = name;
        this.size = size;
        this.clothingItems = clothingItems;
    }

    public Clothing[] getClothingItems() {
        return clothingItems;
    }
    public String getName() {
        return name;
    }

    public char getSize() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(clothingItems) +
                "\nCustomer size= " + size;
    }
}
