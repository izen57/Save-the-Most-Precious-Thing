package Inventory;

/**
 * The interface to implement the conception of the appliance of an {@link AbstractItem abstract item}.
 */
public interface IApplicable
{
    /**
     * Writes in the output the message while applying the item.
     *
     * @return the message of the application.
     */
    String getMessage();
    String getName();
}
