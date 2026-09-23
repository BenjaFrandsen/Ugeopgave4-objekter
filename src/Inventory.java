import java.sql.SQLOutput;
import java.util.ArrayList;

public class Inventory {
    private String playerName;
    private ArrayList<Item> items;
    private int maxCapacity;

    public Inventory(String playerName, int maxCapacity) {
        this.playerName = playerName;
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }


    public void addItem(Item item) {
        if (items.size() < maxCapacity) {
            items.add(item);
            System.out.println(playerName + " got item: " + item.getName());
        } else {
            System.out.println("Inventory is full!");
        }
    }
    public int getTotalValue() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getValue();
        }
        return sum;
    }

    public ArrayList<Item> itemType(String type) {
        ArrayList<Item> found = new ArrayList<>();
        for (Item item : items) {
            if (item.getType().equals(type)) {
                found.add(item);
            }
        }
        return found;
    }

    public void printIventory() {
        System.out.println(playerName +"s" + " inventory:");
        System.out.println("Items in bag " + items.size() + "/" + maxCapacity);
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("Total Value: " + getTotalValue());
    }

}