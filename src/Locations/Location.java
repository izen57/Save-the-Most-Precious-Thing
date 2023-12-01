package Locations;

import Inventory.Inventory;

public class Location {
    private String name;
    protected Inventory inventory;
    private String message;

    public Location(String name, String message) {
        this.name = name;
        this.inventory = new Inventory();
        this.message = message;
    }

    public Location(String name, Inventory inventory, String message) {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
