package Locations;
import Inventory.Inventory;


public class Location {
    private String name;
    protected Inventory inventory;
    private String message;

    public Location(String name, Inventory inventory,  String message) {
        this.name = name;
        this.inventory = inventory;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Inventory getInventory() {
        return inventory;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
