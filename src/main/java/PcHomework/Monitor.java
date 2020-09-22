package PcHomework;

public class Monitor {
    int Resolution;
    String Model;
    String Manufacturer;

    void drawPixelAt(int x, int y, String color){
        System.out.println( "Drawing pixel at " + x + "," + y + " " + " in color "
                + color);
    }
}
