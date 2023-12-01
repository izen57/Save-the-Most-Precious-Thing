package Inventory;

/**
 *  The interface to implement the conception of the appliance of an item.
 */
public interface IApplicable
{
    /**
     * Apply an applicable item to another item.
     *
     * @return <code>true</code> if this item can be applied to the given item, <code>false</code> otherwise.
     */
    String getMessage();
}
