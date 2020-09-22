package PcHomework;

public class Case {
    String model;
    String manufacturer;
    String powerSupply;
    Dimensions dimensions;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    void pressPowerButton(){

        System.out.println("Power Button Pressed");
    }

}
