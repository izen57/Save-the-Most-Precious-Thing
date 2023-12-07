package Inventory;

/**
 * An applicable item can be applied in some situation to another applicable item only.
 */
public abstract class ApplicableItem extends AbstractItem implements IApplicable
{
    public ApplicableItem(String name, String description)
    {
        super(name, description);
    }
}
