import java.util.ArrayList;

public class Inventory
{
    private ArrayList<AbstractItem> storage;

    public Inventory(ArrayList<AbstractItem> storage)
    {
        this.storage = storage;
    }

    public void addItem(AbstractItem item)
    {
        storage.add(item);
    }

    public void removeItem(String itemName)
    {
        AbstractItem item = findItemByName(itemName);
        if (item != null)
            storage.remove(item);
    }

    public AbstractItem findItemByName(String itemName)
    {
        for (AbstractItem i : storage)
            if (itemName.equals(i.getName()))
                return i;

        return null;
    }
}
