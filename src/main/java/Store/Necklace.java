package Store;

public class Necklace {
    int price;
    String name;
    char itemId;
    String dateCreated;
    public Necklace(int price, String name, char itemId, String dateCreated){
      this.price = price;
      this.name = name;
      this.itemId = itemId;
      this.dateCreated = dateCreated;
}
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public char getItemId() {
        return itemId;
    }
    public String getDateCreated() {
        return dateCreated;
    }
}
