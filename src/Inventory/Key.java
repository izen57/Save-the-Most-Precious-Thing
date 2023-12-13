package Inventory;

public class Key extends AbstractItem implements IApplicable {
    public Key() {
        super("Key", "Room for Monalisa 1509");
    }

    @Override
    public String getMessage()
    {
        return "The following is written on the key, \"Room for Monalisa, 1509\".";
    }
}
