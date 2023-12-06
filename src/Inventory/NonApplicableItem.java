package Inventory;

/**
 * An item which is not applicable to any other item at any situation.
 * The {@link Main.User user} may just to read the item's description.
 */
public abstract class NonApplicableItem extends AbstractItem
{
    public NonApplicableItem(String name, String description)
    {
        super(name, description);
    }
}
