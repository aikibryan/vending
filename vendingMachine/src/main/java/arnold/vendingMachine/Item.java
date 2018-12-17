package arnold.vendingMachine;
/**
 * Products/Items enumeration for Vending Machine 
 */
public enum Item {

    COKE("Coke", 125),
    WATER("Water", 150),
    CHIPS("Chips", 100),
    BAR("Chocholate Bar", 75),
    SNICKERS("Snickers",75);
    private String name;
    private int price;

    private Item(
            String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }
}


