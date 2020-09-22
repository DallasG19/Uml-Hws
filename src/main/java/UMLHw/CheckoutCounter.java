package UMLHw;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CheckoutCounter {

    public static void main(String[] args) {

        ShopApp shopapp = new ShopApp();
        ShopApp shopapp2 = new ShopApp();
        Clothing[] clothing = {new Clothing("Black Leather Jacket", 100, 'L', false ),
                               new Clothing("White long sleeved shirt", 100.0,'L', false)
        };
        Clothing[] clothing2 = {new Clothing("White penny loafers", 150, 's', false),
                                new Clothing("Blue shorts", 200.0, 'L', false)
        };
        Customer customer1 = new Customer("Mike",'M', clothing);
        Employee employee1 = new Employee("Jane", 'L', clothing2);
        System.out.println(customer1.getName());
        System.out.println(customer1.toString());
        System.out.print("Fit?" );
        for (Clothing i: customer1.getClothingItems()){
            System.out.println(i.isAFit(customer1));
        }
        System.out.println("$" + shopapp.calcTotal(customer1.getClothingItems()));
        System.out.println(":::::::::::::Thank you - Come Again!::::::::::");

        System.out.println(employee1.getName());
        System.out.println(employee1.toString());
        System.out.print("Fit?" );
        for (Clothing i: employee1.getClothingItems()){
            System.out.println(i.isAFit(employee1));
        }
       //System.out.println("$" + shopapp2.employeePriceAfterDisc(employee1.getClothingItems()));
        System.out.println(":::::::::::::Thank you - Come Again!::::::::::");

    }

}
