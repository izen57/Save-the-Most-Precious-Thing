package Inventory;

public class Key extends ApplicableItem {

    public Key() {
        super("Key", "Room for Monalisa 1509");
    }

    @Override
    public String getMessage()
    {
        return "Room for Monalisa 1509";
    }
}
