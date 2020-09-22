package UMLHw;

import java.lang.reflect.Array;

public class ShopApp {
    double tax = .1;
    public double calcTotal(Clothing[] list){
        double total = 0.0;
        for (int x=0; x<list.length; x++){
            total += list[x].getPrice();
        }
        double taxes = total * tax;
        return total + taxes;
    }
    public char measure(Customer Customer){
        return Customer.getSize();
    }
    public double employeePriceAfterDisc(Employee employee){
        double total = 0.0;
        for (int x=0; x<employee.getClothingItems().length; x++){
            total += employee.getClothingItems()[x].getPrice();
        }
        double dis = total * employee.getDiscount();
        total -= dis;
        double taxes = total * tax;
        total += tax;
        return total ;

    }


}
