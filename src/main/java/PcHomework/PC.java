package PcHomework;

public class PC {
    private String Case;
    private String Motherbourd;
    private String Monitor;
    public PC() {
        this.Case=Case;
        this.Motherbourd= Motherbourd;
        this.Monitor = Monitor;
    }

    private String getMotherbourd() {
        return Motherbourd;
    }

    private String getCase() {
        return Case;
    }

    private String getMonitor() {
        return Monitor;
    }
    private void drawlogo(){
        drawPixel(Monitor);

    }

    private void drawPixel(String monitor) {
    }

    public String description(){
        String description = ("Welcome to worst buy below is the description of the pc on sale today"+
                '\n' + "Case: Cooler Master MasterBox Pro 5 RGB - tower - ATX " +
                '\n' + "Motherbourd: MSI MPG Z390 GAMING EDGE AC LGA 1151 (300 Series) Intel Z390 HDMI SATA 6Gb/s USB 3.1 ATX Intel Motherboard" +
                '\n' + "Monitor: Acer Nitro Gaming Series VG220Q bmiix 22 (21.5 Diagonal) Full HD 1920 x 1080 75Hz 1ms HDMI VGA AMD FreeSync Technology Flicker-Less Built-in Speakers LED Backlit IPS Gaming Monitor");
    return description;
    }
    public String toString(){

        return Case + " " + Motherbourd + " " + Monitor;
    }
    public String powerUp(){

        pressPowerButton(Case);
        drawlogo();
        loadProgram(Motherbourd);
        return null;
    }

    private void pressPowerButton(Object theCase) {
    }

    private void loadProgram(String motherbourd) {
    }
}
