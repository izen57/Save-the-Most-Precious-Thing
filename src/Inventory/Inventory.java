package Inventory;

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

    public <T extends AbstractItem> T removeItem(String itemName)
    {
        T item = findItemByName(itemName);
        if (item != null)
            storage.remove(item);

        return item;
    }

    /**
     * Find an item in the inner inventory by its name.
     * @param itemName an item to find.
     * @return an item of type <code>T</code> which must extends the {@link AbstractItem AbstractItem class } if there is it in the inventory, <code>null</code> otherwise.
     */
    public <T extends AbstractItem> T findItemByName(String itemName)
    {
        for (AbstractItem i : storage)
            if (itemName.equalsIgnoreCase(i.getName()))
                return (T) i;

        return null;
    }

    public boolean contains(AbstractItem item)
    {
        return storage.contains(item);
    }
}
