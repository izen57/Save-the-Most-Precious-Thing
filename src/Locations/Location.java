package Locations;

import Items.AbstractItem;

public class Location {
    private String name;
    private AbstractItem abstractItem;
    private Location previousLocation;
    private String message;

    public Location(String name, AbstractItem abstractItem, Location previousLocation, String message) {
        this.name = name;
        this.abstractItem = abstractItem;
        this.previousLocation = previousLocation;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractItem getItem() {
        return abstractItem;
    }

    public void setItem(AbstractItem abstractItem) {
        this.abstractItem = abstractItem;
    }

    public Location getPreviousLocation() {
        return previousLocation;
    }


    public void setPreviousLocation(Location previousLocation) {
        this.previousLocation = previousLocation;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
