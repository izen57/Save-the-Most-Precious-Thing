package Inventory;

/**
 * An applicable item can be applied in some situation to another applicable item only.
 */
public class ApplicableItem extends AbstractItem implements IApplicable
{
    public ApplicableItem(String name, String description)
    {
        super(name, description);
    }

    @Override
    public boolean apply(IApplicable applicableItem)
    {
        // here it will be the match between the names of items for each item.
        // For example: OldKey and Old Door
        return false;
    }
}
