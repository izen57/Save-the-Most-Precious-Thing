public class Location {
    private String name;
    private Item item;
    private Location previousLocation;
    private String message;

    public Location(String name, Item item, Location previousLocation, String message) {
        this.name = name;
        this.item = item;
        this.previousLocation = previousLocation;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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
