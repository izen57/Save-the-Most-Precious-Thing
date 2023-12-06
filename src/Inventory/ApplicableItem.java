package Inventory;

/**
 * An applicable item can be applied in some situation.
 * Currently, there is no crucial differences between an applicable item and non-applicable one.
 */
public abstract class ApplicableItem extends AbstractItem implements IApplicable
{
    public ApplicableItem(String name, String description)
    {
        super(name, description);
    }
}
