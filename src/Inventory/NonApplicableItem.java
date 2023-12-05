package Inventory;

/**
 * An item which is not applicable to any other item.
 */
public abstract class NonApplicableItem extends AbstractItem
{
    public NonApplicableItem(String name, String description)
    {
        super(name, description);
    }
}
