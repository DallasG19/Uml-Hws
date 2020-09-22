package UMLHw;

public class Clothing {
    private String description;
    private double price;
    private char size;
    private boolean sizeAnswer = false;
    public Clothing(String description, double price, char size,boolean sizeAnswer ){
        this.description = description;
        this.price = price;
        this.size = size;
        this.sizeAnswer = sizeAnswer;
    }

    public double getPrice() {
        return price;
    }
    public char getSize() {
        return size;
    }
    public boolean isAFit(Customer customer) {
        for (Clothing i: customer.getClothingItems()){
            if (i.getSize() == customer.getSize()){
                sizeAnswer = true;
            }
        }

        return sizeAnswer;
        }
    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}





