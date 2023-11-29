import Items.AbstractItem;

import java.util.ArrayList;

public class Inventory
{
    private ArrayList<AbstractItem> storage;

    public Inventory()
    {
        storage = new ArrayList<>(100);
    }

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

    /**
     * Find an item by its name.
     * @param itemName an item to find
     * @return an abstract item if there is it in the inventory, <code>null</code> otherwise
     */
    public AbstractItem findItemByName(String itemName)
    {
        for (AbstractItem i : storage)
            if (itemName.equals(i.getName()))
                return i;

        return null;
    }
}
