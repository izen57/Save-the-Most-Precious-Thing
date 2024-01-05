package Inventory;
import Locations.Location;

/**
 * The class for a general item representation. It used by inventory of {@link Location locations} and {@link Character characters}.
 * An item can be an applicable with implementation of {@link IApplicable} or non-applicable without it.
 */
public abstract class AbstractItem
{
    /**
     * A name of an item.
     */
    private String name;

    /**
     * A description of an item. Mostly it is the message which appears while applying it but can be its story, origin, application, etc.
     */
    private String description;

    /**
     * Initializes an instance of the item with given the name and description.
     * @param name A name of the item.
     * @param description A description of the item.
     */
    public AbstractItem(String name, String description) {
        this.name = name;
        this.description = description;
    }


    /**
     * Get the name of one item.
     * @return name of the item.
     */
    public String getName() {
        return name;
    }


    /**
     * Get the description of one item.
     * @return description of the item.
     */
    public String getDescription() {
        return description;
    }
}
