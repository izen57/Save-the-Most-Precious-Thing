package Inventory;

import java.util.List;

public class Inventory {
    private List<Item> inventory;

    public Inventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }
}
