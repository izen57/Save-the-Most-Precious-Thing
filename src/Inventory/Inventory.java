package Inventory;

import java.util.ArrayList;

/**
 * A class which represents an inventory of an in-game instance.
 * The inventory is held by {@link Locations.Location locations} and all classes derived by the {@link Character character} class.
 */
public class Inventory
{
    /**
     * A storage of the inventory which contains an {@link ArrayList} of {@link AbstractItem abstract} items.
     * Such a generalization is good for the iteration through the inventory or taking any item.
     */
    private ArrayList<AbstractItem> storage;

    /**
     * Initializes an inventory with no {@link AbstractItem items} in it and capacity of 100.
     */
    public Inventory()
    {
        storage = new ArrayList<>(100);
    }

    /**
     * Initializes an inventory with the already created storage.
     * @param storage a storage to inject.
     */
    public Inventory(ArrayList<AbstractItem> storage)
    {
        this.storage = storage;
    }

    public void addItem(AbstractItem item)
    {
        storage.add(item);
    }

    /**
     * Removes the existing item from the storage, nothing happens otherwise.
     * @param itemName a name of the item to remove.
     */
    public void removeItem(String itemName)
    {
        AbstractItem item = findItemByName(itemName);
        if (item != null)
            storage.remove(item);
    }

    /**
     * Finds an item in the inventory by its name.
     * @param itemName a name of the item to find.
     * @return an item of the given type parameter if it is presents in an inventory, {@code null} otherwise.
     * @param <T> the type parameter of needed item from the inventory which should be derived from the {@link AbstractItem}.
     */
    public <T extends AbstractItem> T findItemByName(String itemName)
    {
        for (AbstractItem i : storage)
            if (itemName.equalsIgnoreCase(i.getName()))
                return (T) i;

        return null;
    }

    public void showInventory()
    {
        if (!isEmpty()) {
            System.out.print("Now you have: ");
            for (AbstractItem item : storage)
                System.out.print(item.getName() );
            System.out.println(" in your inventory.");
        } else
            System.out.println("You have nothing yet in your inventory.");
    }

    public ArrayList<AbstractItem> getStorage() {
        return storage;
    }

    public boolean isEmpty()
    {
        return storage.isEmpty();
    }

    public int getSize()
    {
        return storage.size();
    }
}
